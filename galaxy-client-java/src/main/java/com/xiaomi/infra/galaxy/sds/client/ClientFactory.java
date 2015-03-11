package com.xiaomi.infra.galaxy.sds.client;

import com.xiaomi.infra.galaxy.sds.shared.clock.AdjustableClock;
import com.xiaomi.infra.galaxy.sds.thrift.AdminService;
import com.xiaomi.infra.galaxy.sds.thrift.AuthService;
import com.xiaomi.infra.galaxy.sds.thrift.CommonConstants;
import com.xiaomi.infra.galaxy.sds.thrift.Credential;
import com.xiaomi.infra.galaxy.sds.thrift.ErrorsConstants;
import com.xiaomi.infra.galaxy.sds.thrift.TableService;
import com.xiaomi.infra.galaxy.sds.thrift.Version;
import com.xiaomi.infra.galaxy.sds.thrift.VersionUtil;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory to create Auth, Admin or Table clients.
 *
 * @author heliangliang
 */
public class ClientFactory {
  // Also for Android
  @SuppressWarnings("unused")
  private static final Logger LOG = LoggerFactory.getLogger(ClientFactory.class);
  private static final String USER_AGENT_HEADER = "User-Agent";
  private static final Version VERSION = new Version();

  private Credential credential;
  private Map<String, String> customHeaders;
  private HttpClient httpClient;
  private AdjustableClock clock;

  private static HttpClient generateHttpClient() {
    HttpParams params = new BasicHttpParams();
    ConnManagerParams.setMaxTotalConnections(params, 1);
    HttpConnectionParams
        .setConnectionTimeout(params, (int) CommonConstants.DEFAULT_CLIENT_CONN_TIMEOUT);
    SchemeRegistry schemeRegistry = new SchemeRegistry();
    schemeRegistry.register(
        new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    SSLSocketFactory sslSocketFactory = SSLSocketFactory.getSocketFactory();
    sslSocketFactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
    schemeRegistry.register(new Scheme("https", sslSocketFactory, 443));
    ClientConnectionManager conMgr = new ThreadSafeClientConnManager(params, schemeRegistry);
    return new DefaultHttpClient(conMgr, params);
  }

  public ClientFactory setCustomHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  public ClientFactory() {
    this(new AdjustableClock());
  }

  public ClientFactory(Credential credential) {
    this(credential, new AdjustableClock());
  }

  public ClientFactory(AdjustableClock clock) {
    this(null, clock);
  }

  public ClientFactory(Credential credential, AdjustableClock clock) {
    this(credential, clock, generateHttpClient());
  }

  /**
   * Create client factory
   *
   * @param credential sds credential
   * @param httpClient http client, must be thread safe when used in multiple threads,
   *                   if the default client is no satisfied, the client can be set here.
   */
  public ClientFactory(Credential credential, HttpClient httpClient) {
    this(credential, new AdjustableClock(), httpClient);
  }

  /**
   * Create client factory
   *
   * @param credential sds credential
   * @param clock      adjustable clock, used for test
   * @param httpClient http client, must be thread safe when used in multiple threads,
   *                   if the default client is no satisfied, the client can be set here.
   */
  public ClientFactory(Credential credential, AdjustableClock clock, HttpClient httpClient) {
    this.credential = credential;
    this.clock = clock;
    this.httpClient = httpClient;
  }

  public Version getSDKVersion() {
    return VERSION;
  }

  public AuthService.Iface newAuthClient() {
    String url = CommonConstants.DEFAULT_SERVICE_ENDPOINT + CommonConstants.AUTH_SERVICE_PATH;
    return newAuthClient(url);
  }

  public AuthService.Iface newAuthClient(boolean supportAccountKey) {
    String url = CommonConstants.DEFAULT_SERVICE_ENDPOINT + CommonConstants.AUTH_SERVICE_PATH;
    return newAuthClient(url, supportAccountKey);
  }

  public AuthService.Iface newAuthClient(String url) {
    return newAuthClient(url, false);
  }

  public AuthService.Iface newAuthClient(String url, boolean supportAccountKey) {
    return newAuthClient(url, (int) CommonConstants.DEFAULT_CLIENT_TIMEOUT,
        (int) CommonConstants.DEFAULT_CLIENT_CONN_TIMEOUT, supportAccountKey);
  }

  public AuthService.Iface newAuthClient(String url, int socketTimeout, int connTimeout) {
    return newAuthClient(url, socketTimeout, connTimeout, false);
  }

  public AuthService.Iface newAuthClient(String url, int socketTimeout, int connTimeout,
      boolean supportAccountKey) {
    return createClient(AuthService.Iface.class, AuthService.Client.class, url, socketTimeout,
        connTimeout, false, ErrorsConstants.MAX_RETRY, supportAccountKey);
  }

  public AuthService.Iface newAuthClient(String url, boolean isRetry, int maxRetry) {
    return newAuthClient(url, isRetry, maxRetry, false);
  }

  public AuthService.Iface newAuthClient(String url, boolean isRetry, int maxRetry,
      boolean supportAccountKey) {
    return createClient(AuthService.Iface.class, AuthService.Client.class, url,
        (int) CommonConstants.DEFAULT_CLIENT_TIMEOUT,
        (int) CommonConstants.DEFAULT_CLIENT_CONN_TIMEOUT, isRetry, maxRetry, supportAccountKey);
  }

  public AuthService.Iface newAuthClient(String url, int socketTimeout, int connTimeout,
      boolean isRetry, int maxRetry) {
    return newAuthClient(url, socketTimeout, connTimeout, isRetry, maxRetry, false);
  }

  public AuthService.Iface newAuthClient(String url, int socketTimeout, int connTimeout,
      boolean isRetry, int maxRetry, boolean supportAccountKey) {
    return createClient(AuthService.Iface.class, AuthService.Client.class, url, socketTimeout,
        connTimeout, isRetry, maxRetry, supportAccountKey);
  }

  public AdminService.Iface newAdminClient() {
    if (credential == null) {
      throw new IllegalArgumentException("Credential is not set");
    }
    String url = CommonConstants.DEFAULT_SERVICE_ENDPOINT + CommonConstants.ADMIN_SERVICE_PATH;
    return newAdminClient(url);
  }

  public AdminService.Iface newAdminClient(boolean supportAccountKey) {
    if (credential == null) {
      throw new IllegalArgumentException("Credential is not set");
    }
    String url = CommonConstants.DEFAULT_SERVICE_ENDPOINT + CommonConstants.ADMIN_SERVICE_PATH;
    return newAdminClient(url, supportAccountKey);
  }

  public AdminService.Iface newAdminClient(String url) {
    return newAdminClient(url, false);
  }

  public AdminService.Iface newAdminClient(String url, boolean supportAccountKey) {
    return newAdminClient(url, (int) CommonConstants.DEFAULT_ADMIN_CLIENT_TIMEOUT,
        (int) CommonConstants.DEFAULT_CLIENT_CONN_TIMEOUT, supportAccountKey);
  }

  public AdminService.Iface newAdminClient(String url, int socketTimeout, int connTimeout) {
    return newAdminClient(url, socketTimeout, connTimeout, false);
  }

  public AdminService.Iface newAdminClient(String url, int socketTimeout, int connTimeout,
      boolean supportAccountKey) {
    return createClient(AdminService.Iface.class, AdminService.Client.class, url, socketTimeout,
        connTimeout, false, ErrorsConstants.MAX_RETRY, supportAccountKey);
  }

  public AdminService.Iface newAdminClient(String url, boolean isRetry, int maxRetry) {
    return newAdminClient(url, isRetry, maxRetry, false);
  }

  public AdminService.Iface newAdminClient(String url, boolean isRetry, int maxRetry,
      boolean supportAccountKey) {
    return createClient(AdminService.Iface.class, AdminService.Client.class, url,
        (int) CommonConstants.DEFAULT_ADMIN_CLIENT_TIMEOUT,
        (int) CommonConstants.DEFAULT_CLIENT_CONN_TIMEOUT, isRetry, maxRetry, supportAccountKey);
  }

  public AdminService.Iface newAdminClient(String url, int socketTimeout, int connTimeout,
      boolean isRetry, int maxRetry) {
    return newAdminClient(url, socketTimeout, connTimeout, isRetry, maxRetry, false);
  }

  public AdminService.Iface newAdminClient(String url, int socketTimeout, int connTimeout,
      boolean isRetry, int maxRetry, boolean supportAccountKey) {
    return createClient(AdminService.Iface.class, AdminService.Client.class, url, socketTimeout,
        connTimeout, isRetry, maxRetry, supportAccountKey);
  }

  public TableService.Iface newTableClient() {
    if (credential == null) {
      throw new IllegalArgumentException("Credential is not set");
    }
    String url = CommonConstants.DEFAULT_SERVICE_ENDPOINT + CommonConstants.TABLE_SERVICE_PATH;
    return newTableClient(url);
  }

  public TableService.Iface newTableClient(boolean supportAccountKey) {
    if (credential == null) {
      throw new IllegalArgumentException("Credential is not set");
    }
    String url = CommonConstants.DEFAULT_SERVICE_ENDPOINT + CommonConstants.TABLE_SERVICE_PATH;
    return newTableClient(url, supportAccountKey);
  }

  public TableService.Iface newTableClient(String url) {
    return newTableClient(url, false);
  }

  public TableService.Iface newTableClient(String url, boolean supportAccountKey) {
    return newTableClient(url, (int) CommonConstants.DEFAULT_CLIENT_TIMEOUT,
        (int) CommonConstants.DEFAULT_CLIENT_CONN_TIMEOUT, supportAccountKey);
  }

  public TableService.Iface newTableClient(String url, int socketTimeout, int connTimeout) {
    return newTableClient(url, socketTimeout, connTimeout, false);
  }

  public TableService.Iface newTableClient(String url, int socketTimeout, int connTimeout,
      boolean supportAccountKey) {
    return createClient(TableService.Iface.class, TableService.Client.class, url, socketTimeout,
        connTimeout, false, ErrorsConstants.MAX_RETRY, supportAccountKey);
  }

  public TableService.Iface newTableClient(String url, boolean isRetry, int maxRetry) {
    return newTableClient(url, isRetry, maxRetry, false);
  }

  public TableService.Iface newTableClient(String url, boolean isRetry, int maxRetry,
      boolean supportAccountKey) {
    return createClient(TableService.Iface.class, TableService.Client.class, url,
        (int) CommonConstants.DEFAULT_CLIENT_TIMEOUT,
        (int) CommonConstants.DEFAULT_CLIENT_CONN_TIMEOUT, isRetry, maxRetry, supportAccountKey);
  }

  public TableService.Iface newTableClient(String url, int socketTimeout, int connTimeout,
      boolean isRetry, int maxRetry) {
    return newTableClient(url, socketTimeout, connTimeout, isRetry, maxRetry, false);
  }

  public TableService.Iface newTableClient(String url, int socketTimeout, int connTimeout,
      boolean isRetry, int maxRetry, boolean supportAccountKey) {
    return createClient(TableService.Iface.class, TableService.Client.class, url, socketTimeout,
        connTimeout, isRetry, maxRetry, supportAccountKey);
  }

  private <IFace, Impl> IFace createClient(Class<IFace> ifaceClass, Class<Impl> implClass,
      String url, int socketTimeout, int connTimeout, boolean isRetry, int maxRetry,
      boolean supportAccountKey) {
    Map<String, String> headers = new HashMap<String, String>();
    headers.put(USER_AGENT_HEADER, createUserAgentHeader());
    headers.put(CommonConstants.HK_REQUEST_TIMEOUT, String.valueOf(socketTimeout));
    if (customHeaders != null) {
      headers.putAll(customHeaders);
    }

    IFace client = ThreadSafeClient.getClient(httpClient, headers, credential, clock,
        ifaceClass, implClass, url, socketTimeout, connTimeout, supportAccountKey);
    return AutoRetryClient.getAutoRetryClient(ifaceClass, client, isRetry, maxRetry);
  }

  protected String createUserAgentHeader() {
    return String.format("Java-SDK/%s Java/%s", VersionUtil.versionString(VERSION),
        System.getProperty("java.version"));
  }
}
