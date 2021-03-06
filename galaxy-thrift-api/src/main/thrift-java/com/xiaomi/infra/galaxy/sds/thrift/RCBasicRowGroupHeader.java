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
 * RC_BASIC Row Group头信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-28")
public class RCBasicRowGroupHeader implements libthrift091.TBase<RCBasicRowGroupHeader, RCBasicRowGroupHeader._Fields>, java.io.Serializable, Cloneable, Comparable<RCBasicRowGroupHeader> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("RCBasicRowGroupHeader");

  private static final libthrift091.protocol.TField COUNT_FIELD_DESC = new libthrift091.protocol.TField("count", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField OFFSET_FIELD_DESC = new libthrift091.protocol.TField("offset", libthrift091.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RCBasicRowGroupHeaderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RCBasicRowGroupHeaderTupleSchemeFactory());
  }

  /**
   * 行组的记录总数，必须为正整数
   */
  public int count; // optional
  /**
   * 属性列组的相对偏移(相对与头信息结尾，即第一个列组offset总是为0)，
   * 属性的顺序与元信息的属性列表对应
   */
  public List<Integer> offset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 行组的记录总数，必须为正整数
     */
    COUNT((short)1, "count"),
    /**
     * 属性列组的相对偏移(相对与头信息结尾，即第一个列组offset总是为0)，
     * 属性的顺序与元信息的属性列表对应
     */
    OFFSET((short)2, "offset");

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
        case 1: // COUNT
          return COUNT;
        case 2: // OFFSET
          return OFFSET;
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
  private static final int __COUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COUNT,_Fields.OFFSET};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COUNT, new libthrift091.meta_data.FieldMetaData("count", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.OFFSET, new libthrift091.meta_data.FieldMetaData("offset", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(RCBasicRowGroupHeader.class, metaDataMap);
  }

  public RCBasicRowGroupHeader() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RCBasicRowGroupHeader(RCBasicRowGroupHeader other) {
    __isset_bitfield = other.__isset_bitfield;
    this.count = other.count;
    if (other.isSetOffset()) {
      List<Integer> __this__offset = new ArrayList<Integer>(other.offset);
      this.offset = __this__offset;
    }
  }

  public RCBasicRowGroupHeader deepCopy() {
    return new RCBasicRowGroupHeader(this);
  }

  @Override
  public void clear() {
    setCountIsSet(false);
    this.count = 0;
    this.offset = null;
  }

  /**
   * 行组的记录总数，必须为正整数
   */
  public int getCount() {
    return this.count;
  }

  /**
   * 行组的记录总数，必须为正整数
   */
  public RCBasicRowGroupHeader setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public int getOffsetSize() {
    return (this.offset == null) ? 0 : this.offset.size();
  }

  public java.util.Iterator<Integer> getOffsetIterator() {
    return (this.offset == null) ? null : this.offset.iterator();
  }

  public void addToOffset(int elem) {
    if (this.offset == null) {
      this.offset = new ArrayList<Integer>();
    }
    this.offset.add(elem);
  }

  /**
   * 属性列组的相对偏移(相对与头信息结尾，即第一个列组offset总是为0)，
   * 属性的顺序与元信息的属性列表对应
   */
  public List<Integer> getOffset() {
    return this.offset;
  }

  /**
   * 属性列组的相对偏移(相对与头信息结尾，即第一个列组offset总是为0)，
   * 属性的顺序与元信息的属性列表对应
   */
  public RCBasicRowGroupHeader setOffset(List<Integer> offset) {
    this.offset = offset;
    return this;
  }

  public void unsetOffset() {
    this.offset = null;
  }

  /** Returns true if field offset is set (has been assigned a value) and false otherwise */
  public boolean isSetOffset() {
    return this.offset != null;
  }

  public void setOffsetIsSet(boolean value) {
    if (!value) {
      this.offset = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Integer)value);
      }
      break;

    case OFFSET:
      if (value == null) {
        unsetOffset();
      } else {
        setOffset((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COUNT:
      return Integer.valueOf(getCount());

    case OFFSET:
      return getOffset();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COUNT:
      return isSetCount();
    case OFFSET:
      return isSetOffset();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RCBasicRowGroupHeader)
      return this.equals((RCBasicRowGroupHeader)that);
    return false;
  }

  public boolean equals(RCBasicRowGroupHeader that) {
    if (that == null)
      return false;

    boolean this_present_count = true && this.isSetCount();
    boolean that_present_count = true && that.isSetCount();
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_offset = true && this.isSetOffset();
    boolean that_present_offset = true && that.isSetOffset();
    if (this_present_offset || that_present_offset) {
      if (!(this_present_offset && that_present_offset))
        return false;
      if (!this.offset.equals(that.offset))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_count = true && (isSetCount());
    list.add(present_count);
    if (present_count)
      list.add(count);

    boolean present_offset = true && (isSetOffset());
    list.add(present_offset);
    if (present_offset)
      list.add(offset);

    return list.hashCode();
  }

  @Override
  public int compareTo(RCBasicRowGroupHeader other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCount()).compareTo(other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOffset()).compareTo(other.isSetOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.offset, other.offset);
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
    StringBuilder sb = new StringBuilder("RCBasicRowGroupHeader(");
    boolean first = true;

    if (isSetCount()) {
      sb.append("count:");
      sb.append(this.count);
      first = false;
    }
    if (isSetOffset()) {
      if (!first) sb.append(", ");
      sb.append("offset:");
      if (this.offset == null) {
        sb.append("null");
      } else {
        sb.append(this.offset);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RCBasicRowGroupHeaderStandardSchemeFactory implements SchemeFactory {
    public RCBasicRowGroupHeaderStandardScheme getScheme() {
      return new RCBasicRowGroupHeaderStandardScheme();
    }
  }

  private static class RCBasicRowGroupHeaderStandardScheme extends StandardScheme<RCBasicRowGroupHeader> {

    public void read(libthrift091.protocol.TProtocol iprot, RCBasicRowGroupHeader struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COUNT
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OFFSET
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list28 = iprot.readListBegin();
                struct.offset = new ArrayList<Integer>(_list28.size);
                int _elem29;
                for (int _i30 = 0; _i30 < _list28.size; ++_i30)
                {
                  _elem29 = iprot.readI32();
                  struct.offset.add(_elem29);
                }
                iprot.readListEnd();
              }
              struct.setOffsetIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, RCBasicRowGroupHeader struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCount()) {
        oprot.writeFieldBegin(COUNT_FIELD_DESC);
        oprot.writeI32(struct.count);
        oprot.writeFieldEnd();
      }
      if (struct.offset != null) {
        if (struct.isSetOffset()) {
          oprot.writeFieldBegin(OFFSET_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, struct.offset.size()));
            for (int _iter31 : struct.offset)
            {
              oprot.writeI32(_iter31);
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

  private static class RCBasicRowGroupHeaderTupleSchemeFactory implements SchemeFactory {
    public RCBasicRowGroupHeaderTupleScheme getScheme() {
      return new RCBasicRowGroupHeaderTupleScheme();
    }
  }

  private static class RCBasicRowGroupHeaderTupleScheme extends TupleScheme<RCBasicRowGroupHeader> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, RCBasicRowGroupHeader struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCount()) {
        optionals.set(0);
      }
      if (struct.isSetOffset()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
      if (struct.isSetOffset()) {
        {
          oprot.writeI32(struct.offset.size());
          for (int _iter32 : struct.offset)
          {
            oprot.writeI32(_iter32);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, RCBasicRowGroupHeader struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
      if (incoming.get(1)) {
        {
          libthrift091.protocol.TList _list33 = new libthrift091.protocol.TList(libthrift091.protocol.TType.I32, iprot.readI32());
          struct.offset = new ArrayList<Integer>(_list33.size);
          int _elem34;
          for (int _i35 = 0; _i35 < _list33.size; ++_i35)
          {
            _elem34 = iprot.readI32();
            struct.offset.add(_elem34);
          }
        }
        struct.setOffsetIsSet(true);
      }
    }
  }

}

