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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-13")
public class IncrementResult implements libthrift091.TBase<IncrementResult, IncrementResult._Fields>, java.io.Serializable, Cloneable, Comparable<IncrementResult> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("IncrementResult");

  private static final libthrift091.protocol.TField AMOUNTS_FIELD_DESC = new libthrift091.protocol.TField("amounts", libthrift091.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IncrementResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IncrementResultTupleSchemeFactory());
  }

  public Map<String,Datum> amounts; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    AMOUNTS((short)1, "amounts");

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
        case 1: // AMOUNTS
          return AMOUNTS;
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
  private static final _Fields optionals[] = {_Fields.AMOUNTS};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AMOUNTS, new libthrift091.meta_data.FieldMetaData("amounts", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(IncrementResult.class, metaDataMap);
  }

  public IncrementResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IncrementResult(IncrementResult other) {
    if (other.isSetAmounts()) {
      this.amounts = other.amounts;
    }
  }

  public IncrementResult deepCopy() {
    return new IncrementResult(this);
  }

  @Override
  public void clear() {
    this.amounts = null;
  }

  public int getAmountsSize() {
    return (this.amounts == null) ? 0 : this.amounts.size();
  }

  public void putToAmounts(String key, Datum val) {
    if (this.amounts == null) {
      this.amounts = new HashMap<String,Datum>();
    }
    this.amounts.put(key, val);
  }

  public Map<String,Datum> getAmounts() {
    return this.amounts;
  }

  public IncrementResult setAmounts(Map<String,Datum> amounts) {
    this.amounts = amounts;
    return this;
  }

  public void unsetAmounts() {
    this.amounts = null;
  }

  /** Returns true if field amounts is set (has been assigned a value) and false otherwise */
  public boolean isSetAmounts() {
    return this.amounts != null;
  }

  public void setAmountsIsSet(boolean value) {
    if (!value) {
      this.amounts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AMOUNTS:
      if (value == null) {
        unsetAmounts();
      } else {
        setAmounts((Map<String,Datum>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AMOUNTS:
      return getAmounts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AMOUNTS:
      return isSetAmounts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IncrementResult)
      return this.equals((IncrementResult)that);
    return false;
  }

  public boolean equals(IncrementResult that) {
    if (that == null)
      return false;

    boolean this_present_amounts = true && this.isSetAmounts();
    boolean that_present_amounts = true && that.isSetAmounts();
    if (this_present_amounts || that_present_amounts) {
      if (!(this_present_amounts && that_present_amounts))
        return false;
      if (!this.amounts.equals(that.amounts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_amounts = true && (isSetAmounts());
    list.add(present_amounts);
    if (present_amounts)
      list.add(amounts);

    return list.hashCode();
  }

  @Override
  public int compareTo(IncrementResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAmounts()).compareTo(other.isSetAmounts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmounts()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.amounts, other.amounts);
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
    StringBuilder sb = new StringBuilder("IncrementResult(");
    boolean first = true;

    if (isSetAmounts()) {
      sb.append("amounts:");
      if (this.amounts == null) {
        sb.append("null");
      } else {
        sb.append(this.amounts);
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

  private static class IncrementResultStandardSchemeFactory implements SchemeFactory {
    public IncrementResultStandardScheme getScheme() {
      return new IncrementResultStandardScheme();
    }
  }

  private static class IncrementResultStandardScheme extends StandardScheme<IncrementResult> {

    public void read(libthrift091.protocol.TProtocol iprot, IncrementResult struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AMOUNTS
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map212 = iprot.readMapBegin();
                struct.amounts = new HashMap<String,Datum>(2*_map212.size);
                String _key213;
                Datum _val214;
                for (int _i215 = 0; _i215 < _map212.size; ++_i215)
                {
                  _key213 = iprot.readString();
                  _val214 = new Datum();
                  _val214.read(iprot);
                  struct.amounts.put(_key213, _val214);
                }
                iprot.readMapEnd();
              }
              struct.setAmountsIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, IncrementResult struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.amounts != null) {
        if (struct.isSetAmounts()) {
          oprot.writeFieldBegin(AMOUNTS_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.amounts.size()));
            for (Map.Entry<String, Datum> _iter216 : struct.amounts.entrySet())
            {
              oprot.writeString(_iter216.getKey());
              _iter216.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IncrementResultTupleSchemeFactory implements SchemeFactory {
    public IncrementResultTupleScheme getScheme() {
      return new IncrementResultTupleScheme();
    }
  }

  private static class IncrementResultTupleScheme extends TupleScheme<IncrementResult> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, IncrementResult struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAmounts()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAmounts()) {
        {
          oprot.writeI32(struct.amounts.size());
          for (Map.Entry<String, Datum> _iter217 : struct.amounts.entrySet())
          {
            oprot.writeString(_iter217.getKey());
            _iter217.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, IncrementResult struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map218 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.amounts = new HashMap<String,Datum>(2*_map218.size);
          String _key219;
          Datum _val220;
          for (int _i221 = 0; _i221 < _map218.size; ++_i221)
          {
            _key219 = iprot.readString();
            _val220 = new Datum();
            _val220.read(iprot);
            struct.amounts.put(_key219, _val220);
          }
        }
        struct.setAmountsIsSet(true);
      }
    }
  }

}

