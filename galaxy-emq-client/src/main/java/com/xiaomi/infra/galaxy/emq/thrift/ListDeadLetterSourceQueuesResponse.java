/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-5-19")
public class ListDeadLetterSourceQueuesResponse implements libthrift091.TBase<ListDeadLetterSourceQueuesResponse, ListDeadLetterSourceQueuesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ListDeadLetterSourceQueuesResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("ListDeadLetterSourceQueuesResponse");

  private static final libthrift091.protocol.TField DLQ_NAME_FIELD_DESC = new libthrift091.protocol.TField("dlqName", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField SOURCE_QUEUES_FIELD_DESC = new libthrift091.protocol.TField("sourceQueues", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ListDeadLetterSourceQueuesResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ListDeadLetterSourceQueuesResponseTupleSchemeFactory());
  }

  /**
   * The dead letter queue name;
   * 
   */
  public String dlqName; // required
  /**
   * The source queues, only a dead letter queue has source queues;
   * 
   */
  public List<String> sourceQueues; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The dead letter queue name;
     * 
     */
    DLQ_NAME((short)1, "dlqName"),
    /**
     * The source queues, only a dead letter queue has source queues;
     * 
     */
    SOURCE_QUEUES((short)2, "sourceQueues");

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
        case 1: // DLQ_NAME
          return DLQ_NAME;
        case 2: // SOURCE_QUEUES
          return SOURCE_QUEUES;
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
  private static final _Fields optionals[] = {_Fields.SOURCE_QUEUES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DLQ_NAME, new libthrift091.meta_data.FieldMetaData("dlqName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.SOURCE_QUEUES, new libthrift091.meta_data.FieldMetaData("sourceQueues", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(ListDeadLetterSourceQueuesResponse.class, metaDataMap);
  }

  public ListDeadLetterSourceQueuesResponse() {
  }

  public ListDeadLetterSourceQueuesResponse(
    String dlqName)
  {
    this();
    this.dlqName = dlqName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListDeadLetterSourceQueuesResponse(ListDeadLetterSourceQueuesResponse other) {
    if (other.isSetDlqName()) {
      this.dlqName = other.dlqName;
    }
    if (other.isSetSourceQueues()) {
      List<String> __this__sourceQueues = new ArrayList<String>(other.sourceQueues);
      this.sourceQueues = __this__sourceQueues;
    }
  }

  public ListDeadLetterSourceQueuesResponse deepCopy() {
    return new ListDeadLetterSourceQueuesResponse(this);
  }

  @Override
  public void clear() {
    this.dlqName = null;
    this.sourceQueues = null;
  }

  /**
   * The dead letter queue name;
   * 
   */
  public String getDlqName() {
    return this.dlqName;
  }

  /**
   * The dead letter queue name;
   * 
   */
  public ListDeadLetterSourceQueuesResponse setDlqName(String dlqName) {
    this.dlqName = dlqName;
    return this;
  }

  public void unsetDlqName() {
    this.dlqName = null;
  }

  /** Returns true if field dlqName is set (has been assigned a value) and false otherwise */
  public boolean isSetDlqName() {
    return this.dlqName != null;
  }

  public void setDlqNameIsSet(boolean value) {
    if (!value) {
      this.dlqName = null;
    }
  }

  public int getSourceQueuesSize() {
    return (this.sourceQueues == null) ? 0 : this.sourceQueues.size();
  }

  public java.util.Iterator<String> getSourceQueuesIterator() {
    return (this.sourceQueues == null) ? null : this.sourceQueues.iterator();
  }

  public void addToSourceQueues(String elem) {
    if (this.sourceQueues == null) {
      this.sourceQueues = new ArrayList<String>();
    }
    this.sourceQueues.add(elem);
  }

  /**
   * The source queues, only a dead letter queue has source queues;
   * 
   */
  public List<String> getSourceQueues() {
    return this.sourceQueues;
  }

  /**
   * The source queues, only a dead letter queue has source queues;
   * 
   */
  public ListDeadLetterSourceQueuesResponse setSourceQueues(List<String> sourceQueues) {
    this.sourceQueues = sourceQueues;
    return this;
  }

  public void unsetSourceQueues() {
    this.sourceQueues = null;
  }

  /** Returns true if field sourceQueues is set (has been assigned a value) and false otherwise */
  public boolean isSetSourceQueues() {
    return this.sourceQueues != null;
  }

  public void setSourceQueuesIsSet(boolean value) {
    if (!value) {
      this.sourceQueues = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DLQ_NAME:
      if (value == null) {
        unsetDlqName();
      } else {
        setDlqName((String)value);
      }
      break;

    case SOURCE_QUEUES:
      if (value == null) {
        unsetSourceQueues();
      } else {
        setSourceQueues((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DLQ_NAME:
      return getDlqName();

    case SOURCE_QUEUES:
      return getSourceQueues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DLQ_NAME:
      return isSetDlqName();
    case SOURCE_QUEUES:
      return isSetSourceQueues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListDeadLetterSourceQueuesResponse)
      return this.equals((ListDeadLetterSourceQueuesResponse)that);
    return false;
  }

  public boolean equals(ListDeadLetterSourceQueuesResponse that) {
    if (that == null)
      return false;

    boolean this_present_dlqName = true && this.isSetDlqName();
    boolean that_present_dlqName = true && that.isSetDlqName();
    if (this_present_dlqName || that_present_dlqName) {
      if (!(this_present_dlqName && that_present_dlqName))
        return false;
      if (!this.dlqName.equals(that.dlqName))
        return false;
    }

    boolean this_present_sourceQueues = true && this.isSetSourceQueues();
    boolean that_present_sourceQueues = true && that.isSetSourceQueues();
    if (this_present_sourceQueues || that_present_sourceQueues) {
      if (!(this_present_sourceQueues && that_present_sourceQueues))
        return false;
      if (!this.sourceQueues.equals(that.sourceQueues))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dlqName = true && (isSetDlqName());
    list.add(present_dlqName);
    if (present_dlqName)
      list.add(dlqName);

    boolean present_sourceQueues = true && (isSetSourceQueues());
    list.add(present_sourceQueues);
    if (present_sourceQueues)
      list.add(sourceQueues);

    return list.hashCode();
  }

  @Override
  public int compareTo(ListDeadLetterSourceQueuesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDlqName()).compareTo(other.isSetDlqName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDlqName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.dlqName, other.dlqName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSourceQueues()).compareTo(other.isSetSourceQueues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSourceQueues()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sourceQueues, other.sourceQueues);
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
    StringBuilder sb = new StringBuilder("ListDeadLetterSourceQueuesResponse(");
    boolean first = true;

    sb.append("dlqName:");
    if (this.dlqName == null) {
      sb.append("null");
    } else {
      sb.append(this.dlqName);
    }
    first = false;
    if (isSetSourceQueues()) {
      if (!first) sb.append(", ");
      sb.append("sourceQueues:");
      if (this.sourceQueues == null) {
        sb.append("null");
      } else {
        sb.append(this.sourceQueues);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (dlqName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'dlqName' was not present! Struct: " + toString());
    }
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

  private static class ListDeadLetterSourceQueuesResponseStandardSchemeFactory implements SchemeFactory {
    public ListDeadLetterSourceQueuesResponseStandardScheme getScheme() {
      return new ListDeadLetterSourceQueuesResponseStandardScheme();
    }
  }

  private static class ListDeadLetterSourceQueuesResponseStandardScheme extends StandardScheme<ListDeadLetterSourceQueuesResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, ListDeadLetterSourceQueuesResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DLQ_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.dlqName = iprot.readString();
              struct.setDlqNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SOURCE_QUEUES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list10 = iprot.readListBegin();
                struct.sourceQueues = new ArrayList<String>(_list10.size);
                String _elem11;
                for (int _i12 = 0; _i12 < _list10.size; ++_i12)
                {
                  _elem11 = iprot.readString();
                  struct.sourceQueues.add(_elem11);
                }
                iprot.readListEnd();
              }
              struct.setSourceQueuesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, ListDeadLetterSourceQueuesResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dlqName != null) {
        oprot.writeFieldBegin(DLQ_NAME_FIELD_DESC);
        oprot.writeString(struct.dlqName);
        oprot.writeFieldEnd();
      }
      if (struct.sourceQueues != null) {
        if (struct.isSetSourceQueues()) {
          oprot.writeFieldBegin(SOURCE_QUEUES_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, struct.sourceQueues.size()));
            for (String _iter13 : struct.sourceQueues)
            {
              oprot.writeString(_iter13);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ListDeadLetterSourceQueuesResponseTupleSchemeFactory implements SchemeFactory {
    public ListDeadLetterSourceQueuesResponseTupleScheme getScheme() {
      return new ListDeadLetterSourceQueuesResponseTupleScheme();
    }
  }

  private static class ListDeadLetterSourceQueuesResponseTupleScheme extends TupleScheme<ListDeadLetterSourceQueuesResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, ListDeadLetterSourceQueuesResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dlqName);
      BitSet optionals = new BitSet();
      if (struct.isSetSourceQueues()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSourceQueues()) {
        {
          oprot.writeI32(struct.sourceQueues.size());
          for (String _iter14 : struct.sourceQueues)
          {
            oprot.writeString(_iter14);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, ListDeadLetterSourceQueuesResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dlqName = iprot.readString();
      struct.setDlqNameIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list15 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRING, iprot.readI32());
          struct.sourceQueues = new ArrayList<String>(_list15.size);
          String _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = iprot.readString();
            struct.sourceQueues.add(_elem16);
          }
        }
        struct.setSourceQueuesIsSet(true);
      }
    }
  }

}

