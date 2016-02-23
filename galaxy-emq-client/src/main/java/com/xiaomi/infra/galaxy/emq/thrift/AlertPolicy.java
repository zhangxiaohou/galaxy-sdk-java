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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-2-18")
public class AlertPolicy implements libthrift091.TBase<AlertPolicy, AlertPolicy._Fields>, java.io.Serializable, Cloneable, Comparable<AlertPolicy> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("AlertPolicy");

  private static final libthrift091.protocol.TField TYPE_FIELD_DESC = new libthrift091.protocol.TField("type", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField MEASUREMENT_FIELD_DESC = new libthrift091.protocol.TField("measurement", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField THRESHOLD_FIELD_DESC = new libthrift091.protocol.TField("threshold", libthrift091.protocol.TType.DOUBLE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AlertPolicyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AlertPolicyTupleSchemeFactory());
  }

  /**
   * The operation to be monitored;
   *  
   * 
   * @see ALERT_TYPE
   */
  public ALERT_TYPE type; // required
  /**
   * The measurement to be monitored;
   *  
   * 
   * @see MEASUREMENT
   */
  public MEASUREMENT measurement; // required
  /**
   * If the monitored value >= threshold, it will send alert messages;
   * If measurement is LATENCY, then threshold unit is milliseconds.
   *  
   */
  public double threshold; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The operation to be monitored;
     *  
     * 
     * @see ALERT_TYPE
     */
    TYPE((short)1, "type"),
    /**
     * The measurement to be monitored;
     *  
     * 
     * @see MEASUREMENT
     */
    MEASUREMENT((short)2, "measurement"),
    /**
     * If the monitored value >= threshold, it will send alert messages;
     * If measurement is LATENCY, then threshold unit is milliseconds.
     *  
     */
    THRESHOLD((short)3, "threshold");

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
        case 2: // MEASUREMENT
          return MEASUREMENT;
        case 3: // THRESHOLD
          return THRESHOLD;
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
  private static final int __THRESHOLD_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.THRESHOLD};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new libthrift091.meta_data.FieldMetaData("type", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, ALERT_TYPE.class)));
    tmpMap.put(_Fields.MEASUREMENT, new libthrift091.meta_data.FieldMetaData("measurement", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, MEASUREMENT.class)));
    tmpMap.put(_Fields.THRESHOLD, new libthrift091.meta_data.FieldMetaData("threshold", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(AlertPolicy.class, metaDataMap);
  }

  public AlertPolicy() {
  }

  public AlertPolicy(
    ALERT_TYPE type,
    MEASUREMENT measurement)
  {
    this();
    this.type = type;
    this.measurement = measurement;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AlertPolicy(AlertPolicy other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetMeasurement()) {
      this.measurement = other.measurement;
    }
    this.threshold = other.threshold;
  }

  public AlertPolicy deepCopy() {
    return new AlertPolicy(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.measurement = null;
    setThresholdIsSet(false);
    this.threshold = 0.0;
  }

  /**
   * The operation to be monitored;
   *  
   * 
   * @see ALERT_TYPE
   */
  public ALERT_TYPE getType() {
    return this.type;
  }

  /**
   * The operation to be monitored;
   *  
   * 
   * @see ALERT_TYPE
   */
  public AlertPolicy setType(ALERT_TYPE type) {
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
   * The measurement to be monitored;
   *  
   * 
   * @see MEASUREMENT
   */
  public MEASUREMENT getMeasurement() {
    return this.measurement;
  }

  /**
   * The measurement to be monitored;
   *  
   * 
   * @see MEASUREMENT
   */
  public AlertPolicy setMeasurement(MEASUREMENT measurement) {
    this.measurement = measurement;
    return this;
  }

  public void unsetMeasurement() {
    this.measurement = null;
  }

  /** Returns true if field measurement is set (has been assigned a value) and false otherwise */
  public boolean isSetMeasurement() {
    return this.measurement != null;
  }

  public void setMeasurementIsSet(boolean value) {
    if (!value) {
      this.measurement = null;
    }
  }

  /**
   * If the monitored value >= threshold, it will send alert messages;
   * If measurement is LATENCY, then threshold unit is milliseconds.
   *  
   */
  public double getThreshold() {
    return this.threshold;
  }

  /**
   * If the monitored value >= threshold, it will send alert messages;
   * If measurement is LATENCY, then threshold unit is milliseconds.
   *  
   */
  public AlertPolicy setThreshold(double threshold) {
    this.threshold = threshold;
    setThresholdIsSet(true);
    return this;
  }

  public void unsetThreshold() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THRESHOLD_ISSET_ID);
  }

  /** Returns true if field threshold is set (has been assigned a value) and false otherwise */
  public boolean isSetThreshold() {
    return EncodingUtils.testBit(__isset_bitfield, __THRESHOLD_ISSET_ID);
  }

  public void setThresholdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THRESHOLD_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ALERT_TYPE)value);
      }
      break;

    case MEASUREMENT:
      if (value == null) {
        unsetMeasurement();
      } else {
        setMeasurement((MEASUREMENT)value);
      }
      break;

    case THRESHOLD:
      if (value == null) {
        unsetThreshold();
      } else {
        setThreshold((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case MEASUREMENT:
      return getMeasurement();

    case THRESHOLD:
      return Double.valueOf(getThreshold());

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
    case MEASUREMENT:
      return isSetMeasurement();
    case THRESHOLD:
      return isSetThreshold();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AlertPolicy)
      return this.equals((AlertPolicy)that);
    return false;
  }

  public boolean equals(AlertPolicy that) {
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

    boolean this_present_measurement = true && this.isSetMeasurement();
    boolean that_present_measurement = true && that.isSetMeasurement();
    if (this_present_measurement || that_present_measurement) {
      if (!(this_present_measurement && that_present_measurement))
        return false;
      if (!this.measurement.equals(that.measurement))
        return false;
    }

    boolean this_present_threshold = true && this.isSetThreshold();
    boolean that_present_threshold = true && that.isSetThreshold();
    if (this_present_threshold || that_present_threshold) {
      if (!(this_present_threshold && that_present_threshold))
        return false;
      if (this.threshold != that.threshold)
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

    boolean present_measurement = true && (isSetMeasurement());
    list.add(present_measurement);
    if (present_measurement)
      list.add(measurement.getValue());

    boolean present_threshold = true && (isSetThreshold());
    list.add(present_threshold);
    if (present_threshold)
      list.add(threshold);

    return list.hashCode();
  }

  @Override
  public int compareTo(AlertPolicy other) {
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
    lastComparison = Boolean.valueOf(isSetMeasurement()).compareTo(other.isSetMeasurement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMeasurement()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.measurement, other.measurement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThreshold()).compareTo(other.isSetThreshold());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreshold()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.threshold, other.threshold);
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
    StringBuilder sb = new StringBuilder("AlertPolicy(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("measurement:");
    if (this.measurement == null) {
      sb.append("null");
    } else {
      sb.append(this.measurement);
    }
    first = false;
    if (isSetThreshold()) {
      if (!first) sb.append(", ");
      sb.append("threshold:");
      sb.append(this.threshold);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (type == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    if (measurement == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'measurement' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AlertPolicyStandardSchemeFactory implements SchemeFactory {
    public AlertPolicyStandardScheme getScheme() {
      return new AlertPolicyStandardScheme();
    }
  }

  private static class AlertPolicyStandardScheme extends StandardScheme<AlertPolicy> {

    public void read(libthrift091.protocol.TProtocol iprot, AlertPolicy struct) throws libthrift091.TException {
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
              struct.type = com.xiaomi.infra.galaxy.emq.thrift.ALERT_TYPE.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MEASUREMENT
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.measurement = com.xiaomi.infra.galaxy.emq.thrift.MEASUREMENT.findByValue(iprot.readI32());
              struct.setMeasurementIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THRESHOLD
            if (schemeField.type == libthrift091.protocol.TType.DOUBLE) {
              struct.threshold = iprot.readDouble();
              struct.setThresholdIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, AlertPolicy struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.measurement != null) {
        oprot.writeFieldBegin(MEASUREMENT_FIELD_DESC);
        oprot.writeI32(struct.measurement.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetThreshold()) {
        oprot.writeFieldBegin(THRESHOLD_FIELD_DESC);
        oprot.writeDouble(struct.threshold);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AlertPolicyTupleSchemeFactory implements SchemeFactory {
    public AlertPolicyTupleScheme getScheme() {
      return new AlertPolicyTupleScheme();
    }
  }

  private static class AlertPolicyTupleScheme extends TupleScheme<AlertPolicy> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, AlertPolicy struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      oprot.writeI32(struct.measurement.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetThreshold()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetThreshold()) {
        oprot.writeDouble(struct.threshold);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, AlertPolicy struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = com.xiaomi.infra.galaxy.emq.thrift.ALERT_TYPE.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.measurement = com.xiaomi.infra.galaxy.emq.thrift.MEASUREMENT.findByValue(iprot.readI32());
      struct.setMeasurementIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.threshold = iprot.readDouble();
        struct.setThresholdIsSet(true);
      }
    }
  }

}

