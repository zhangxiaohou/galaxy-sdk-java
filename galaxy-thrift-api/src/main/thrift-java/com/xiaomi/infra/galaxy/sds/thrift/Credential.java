/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 小米存储系统认证信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-26")
public class Credential implements libthrift091.TBase<Credential, Credential._Fields>, java.io.Serializable, Cloneable, Comparable<Credential> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("Credential");

  private static final libthrift091.protocol.TField TYPE_FIELD_DESC = new libthrift091.protocol.TField("type", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField SECRET_KEY_ID_FIELD_DESC = new libthrift091.protocol.TField("secretKeyId", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField SECRET_KEY_FIELD_DESC = new libthrift091.protocol.TField("secretKey", libthrift091.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CredentialStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CredentialTupleSchemeFactory());
  }

  /**
   * 用户登录类型
   * 
   * @see UserType
   */
  public UserType type; // optional
  /**
   * 用于服务端查询SecretKey的键值:
   * 1) userId: 对应User Secret
   * 2) appId: 对应App Secret，匿名登录也需设置
   * 3) storageAccessTokenId: 对应Storage Access Token
   */
  public String secretKeyId; // optional
  /**
   * Secret Key
   */
  public String secretKey; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 用户登录类型
     * 
     * @see UserType
     */
    TYPE((short)1, "type"),
    /**
     * 用于服务端查询SecretKey的键值:
     * 1) userId: 对应User Secret
     * 2) appId: 对应App Secret，匿名登录也需设置
     * 3) storageAccessTokenId: 对应Storage Access Token
     */
    SECRET_KEY_ID((short)2, "secretKeyId"),
    /**
     * Secret Key
     */
    SECRET_KEY((short)3, "secretKey");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // SECRET_KEY_ID
          return SECRET_KEY_ID;
        case 3: // SECRET_KEY
          return SECRET_KEY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.SECRET_KEY_ID,_Fields.SECRET_KEY};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new libthrift091.meta_data.FieldMetaData("type", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, UserType.class)));
    tmpMap.put(_Fields.SECRET_KEY_ID, new libthrift091.meta_data.FieldMetaData("secretKeyId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECRET_KEY, new libthrift091.meta_data.FieldMetaData("secretKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(Credential.class, metaDataMap);
  }

  public Credential() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Credential(Credential other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetSecretKeyId()) {
      this.secretKeyId = other.secretKeyId;
    }
    if (other.isSetSecretKey()) {
      this.secretKey = other.secretKey;
    }
  }

  public Credential deepCopy() {
    return new Credential(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.secretKeyId = null;
    this.secretKey = null;
  }

  /**
   * 用户登录类型
   * 
   * @see UserType
   */
  public UserType getType() {
    return this.type;
  }

  /**
   * 用户登录类型
   * 
   * @see UserType
   */
  public Credential setType(UserType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * 用于服务端查询SecretKey的键值:
   * 1) userId: 对应User Secret
   * 2) appId: 对应App Secret，匿名登录也需设置
   * 3) storageAccessTokenId: 对应Storage Access Token
   */
  public String getSecretKeyId() {
    return this.secretKeyId;
  }

  /**
   * 用于服务端查询SecretKey的键值:
   * 1) userId: 对应User Secret
   * 2) appId: 对应App Secret，匿名登录也需设置
   * 3) storageAccessTokenId: 对应Storage Access Token
   */
  public Credential setSecretKeyId(String secretKeyId) {
    this.secretKeyId = secretKeyId;
    return this;
  }

  public void unsetSecretKeyId() {
    this.secretKeyId = null;
  }

  /** Returns true if field secretKeyId is set (has been assigned a value) and false otherwise */
  public boolean isSetSecretKeyId() {
    return this.secretKeyId != null;
  }

  public void setSecretKeyIdIsSet(boolean value) {
    if (!value) {
      this.secretKeyId = null;
    }
  }

  /**
   * Secret Key
   */
  public String getSecretKey() {
    return this.secretKey;
  }

  /**
   * Secret Key
   */
  public Credential setSecretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

  public void unsetSecretKey() {
    this.secretKey = null;
  }

  /** Returns true if field secretKey is set (has been assigned a value) and false otherwise */
  public boolean isSetSecretKey() {
    return this.secretKey != null;
  }

  public void setSecretKeyIsSet(boolean value) {
    if (!value) {
      this.secretKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((UserType)value);
      }
      break;

    case SECRET_KEY_ID:
      if (value == null) {
        unsetSecretKeyId();
      } else {
        setSecretKeyId((String)value);
      }
      break;

    case SECRET_KEY:
      if (value == null) {
        unsetSecretKey();
      } else {
        setSecretKey((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case SECRET_KEY_ID:
      return getSecretKeyId();

    case SECRET_KEY:
      return getSecretKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case SECRET_KEY_ID:
      return isSetSecretKeyId();
    case SECRET_KEY:
      return isSetSecretKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Credential)
      return this.equals((Credential)that);
    return false;
  }

  public boolean equals(Credential that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_secretKeyId = true && this.isSetSecretKeyId();
    boolean that_present_secretKeyId = true && that.isSetSecretKeyId();
    if (this_present_secretKeyId || that_present_secretKeyId) {
      if (!(this_present_secretKeyId && that_present_secretKeyId))
        return false;
      if (!this.secretKeyId.equals(that.secretKeyId))
        return false;
    }

    boolean this_present_secretKey = true && this.isSetSecretKey();
    boolean that_present_secretKey = true && that.isSetSecretKey();
    if (this_present_secretKey || that_present_secretKey) {
      if (!(this_present_secretKey && that_present_secretKey))
        return false;
      if (!this.secretKey.equals(that.secretKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_secretKeyId = true && (isSetSecretKeyId());
    list.add(present_secretKeyId);
    if (present_secretKeyId)
      list.add(secretKeyId);

    boolean present_secretKey = true && (isSetSecretKey());
    list.add(present_secretKey);
    if (present_secretKey)
      list.add(secretKey);

    return list.hashCode();
  }

  @Override
  public int compareTo(Credential other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecretKeyId()).compareTo(other.isSetSecretKeyId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecretKeyId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.secretKeyId, other.secretKeyId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecretKey()).compareTo(other.isSetSecretKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecretKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.secretKey, other.secretKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Credential(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetSecretKeyId()) {
      if (!first) sb.append(", ");
      sb.append("secretKeyId:");
      if (this.secretKeyId == null) {
        sb.append("null");
      } else {
        sb.append(this.secretKeyId);
      }
      first = false;
    }
    if (isSetSecretKey()) {
      if (!first) sb.append(", ");
      sb.append("secretKey:");
      if (this.secretKey == null) {
        sb.append("null");
      } else {
        sb.append(this.secretKey);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CredentialStandardSchemeFactory implements SchemeFactory {
    public CredentialStandardScheme getScheme() {
      return new CredentialStandardScheme();
    }
  }

  private static class CredentialStandardScheme extends StandardScheme<Credential> {

    public void read(libthrift091.protocol.TProtocol iprot, Credential struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.type = com.xiaomi.infra.galaxy.sds.thrift.UserType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SECRET_KEY_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.secretKeyId = iprot.readString();
              struct.setSecretKeyIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SECRET_KEY
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.secretKey = iprot.readString();
              struct.setSecretKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, Credential struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.secretKeyId != null) {
        if (struct.isSetSecretKeyId()) {
          oprot.writeFieldBegin(SECRET_KEY_ID_FIELD_DESC);
          oprot.writeString(struct.secretKeyId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.secretKey != null) {
        if (struct.isSetSecretKey()) {
          oprot.writeFieldBegin(SECRET_KEY_FIELD_DESC);
          oprot.writeString(struct.secretKey);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CredentialTupleSchemeFactory implements SchemeFactory {
    public CredentialTupleScheme getScheme() {
      return new CredentialTupleScheme();
    }
  }

  private static class CredentialTupleScheme extends TupleScheme<Credential> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, Credential struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetSecretKeyId()) {
        optionals.set(1);
      }
      if (struct.isSetSecretKey()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetSecretKeyId()) {
        oprot.writeString(struct.secretKeyId);
      }
      if (struct.isSetSecretKey()) {
        oprot.writeString(struct.secretKey);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, Credential struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.type = com.xiaomi.infra.galaxy.sds.thrift.UserType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.secretKeyId = iprot.readString();
        struct.setSecretKeyIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.secretKey = iprot.readString();
        struct.setSecretKeyIsSet(true);
      }
    }
  }

}

