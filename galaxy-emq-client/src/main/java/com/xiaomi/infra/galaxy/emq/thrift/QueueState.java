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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-3")
public class QueueState implements libthrift091.TBase<QueueState, QueueState._Fields>, java.io.Serializable, Cloneable, Comparable<QueueState> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueueState");

  private static final libthrift091.protocol.TField CREATE_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("createTimestamp", libthrift091.protocol.TType.I64, (short)1);
  private static final libthrift091.protocol.TField LAST_MODIFIED_TIMESTAMP_FIELD_DESC = new libthrift091.protocol.TField("lastModifiedTimestamp", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField APPROXIMATE_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("approximateMessageNumber", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField APPROXIMATE_AVAILABLE_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("approximateAvailableMessageNumber", libthrift091.protocol.TType.I64, (short)4);
  private static final libthrift091.protocol.TField APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("approximateInvisibilityMessageNumber", libthrift091.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueueStateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueueStateTupleSchemeFactory());
  }

  /**
   * Queue create timestamp;
   * 
   */
  public long createTimestamp; // required
  /**
   * Queue last modified timestamp;
   * 
   */
  public long lastModifiedTimestamp; // required
  /**
   * The approximate message number in this queue;
   * 
   */
  public long approximateMessageNumber; // required
  /**
   * The available message number in this queue, this is for message that could
   * be get using receivedMesasge
   * 
   */
  public long approximateAvailableMessageNumber; // required
  /**
   * The invisibility message number in this queue, this is for received message
   * that in invisibilitySeconds and not deleted;
   * 
   */
  public long approximateInvisibilityMessageNumber; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * Queue create timestamp;
     * 
     */
    CREATE_TIMESTAMP((short)1, "createTimestamp"),
    /**
     * Queue last modified timestamp;
     * 
     */
    LAST_MODIFIED_TIMESTAMP((short)2, "lastModifiedTimestamp"),
    /**
     * The approximate message number in this queue;
     * 
     */
    APPROXIMATE_MESSAGE_NUMBER((short)3, "approximateMessageNumber"),
    /**
     * The available message number in this queue, this is for message that could
     * be get using receivedMesasge
     * 
     */
    APPROXIMATE_AVAILABLE_MESSAGE_NUMBER((short)4, "approximateAvailableMessageNumber"),
    /**
     * The invisibility message number in this queue, this is for received message
     * that in invisibilitySeconds and not deleted;
     * 
     */
    APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER((short)5, "approximateInvisibilityMessageNumber");

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
        case 1: // CREATE_TIMESTAMP
          return CREATE_TIMESTAMP;
        case 2: // LAST_MODIFIED_TIMESTAMP
          return LAST_MODIFIED_TIMESTAMP;
        case 3: // APPROXIMATE_MESSAGE_NUMBER
          return APPROXIMATE_MESSAGE_NUMBER;
        case 4: // APPROXIMATE_AVAILABLE_MESSAGE_NUMBER
          return APPROXIMATE_AVAILABLE_MESSAGE_NUMBER;
        case 5: // APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER
          return APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER;
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
  private static final int __CREATETIMESTAMP_ISSET_ID = 0;
  private static final int __LASTMODIFIEDTIMESTAMP_ISSET_ID = 1;
  private static final int __APPROXIMATEMESSAGENUMBER_ISSET_ID = 2;
  private static final int __APPROXIMATEAVAILABLEMESSAGENUMBER_ISSET_ID = 3;
  private static final int __APPROXIMATEINVISIBILITYMESSAGENUMBER_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATE_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("createTimestamp", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_MODIFIED_TIMESTAMP, new libthrift091.meta_data.FieldMetaData("lastModifiedTimestamp", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.APPROXIMATE_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("approximateMessageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.APPROXIMATE_AVAILABLE_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("approximateAvailableMessageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("approximateInvisibilityMessageNumber", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueueState.class, metaDataMap);
  }

  public QueueState() {
  }

  public QueueState(
    long createTimestamp,
    long lastModifiedTimestamp,
    long approximateMessageNumber,
    long approximateAvailableMessageNumber,
    long approximateInvisibilityMessageNumber)
  {
    this();
    this.createTimestamp = createTimestamp;
    setCreateTimestampIsSet(true);
    this.lastModifiedTimestamp = lastModifiedTimestamp;
    setLastModifiedTimestampIsSet(true);
    this.approximateMessageNumber = approximateMessageNumber;
    setApproximateMessageNumberIsSet(true);
    this.approximateAvailableMessageNumber = approximateAvailableMessageNumber;
    setApproximateAvailableMessageNumberIsSet(true);
    this.approximateInvisibilityMessageNumber = approximateInvisibilityMessageNumber;
    setApproximateInvisibilityMessageNumberIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueueState(QueueState other) {
    __isset_bitfield = other.__isset_bitfield;
    this.createTimestamp = other.createTimestamp;
    this.lastModifiedTimestamp = other.lastModifiedTimestamp;
    this.approximateMessageNumber = other.approximateMessageNumber;
    this.approximateAvailableMessageNumber = other.approximateAvailableMessageNumber;
    this.approximateInvisibilityMessageNumber = other.approximateInvisibilityMessageNumber;
  }

  public QueueState deepCopy() {
    return new QueueState(this);
  }

  @Override
  public void clear() {
    setCreateTimestampIsSet(false);
    this.createTimestamp = 0;
    setLastModifiedTimestampIsSet(false);
    this.lastModifiedTimestamp = 0;
    setApproximateMessageNumberIsSet(false);
    this.approximateMessageNumber = 0;
    setApproximateAvailableMessageNumberIsSet(false);
    this.approximateAvailableMessageNumber = 0;
    setApproximateInvisibilityMessageNumberIsSet(false);
    this.approximateInvisibilityMessageNumber = 0;
  }

  /**
   * Queue create timestamp;
   * 
   */
  public long getCreateTimestamp() {
    return this.createTimestamp;
  }

  /**
   * Queue create timestamp;
   * 
   */
  public QueueState setCreateTimestamp(long createTimestamp) {
    this.createTimestamp = createTimestamp;
    setCreateTimestampIsSet(true);
    return this;
  }

  public void unsetCreateTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID);
  }

  /** Returns true if field createTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID);
  }

  public void setCreateTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIMESTAMP_ISSET_ID, value);
  }

  /**
   * Queue last modified timestamp;
   * 
   */
  public long getLastModifiedTimestamp() {
    return this.lastModifiedTimestamp;
  }

  /**
   * Queue last modified timestamp;
   * 
   */
  public QueueState setLastModifiedTimestamp(long lastModifiedTimestamp) {
    this.lastModifiedTimestamp = lastModifiedTimestamp;
    setLastModifiedTimestampIsSet(true);
    return this;
  }

  public void unsetLastModifiedTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTMODIFIEDTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field lastModifiedTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModifiedTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTMODIFIEDTIMESTAMP_ISSET_ID);
  }

  public void setLastModifiedTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTMODIFIEDTIMESTAMP_ISSET_ID, value);
  }

  /**
   * The approximate message number in this queue;
   * 
   */
  public long getApproximateMessageNumber() {
    return this.approximateMessageNumber;
  }

  /**
   * The approximate message number in this queue;
   * 
   */
  public QueueState setApproximateMessageNumber(long approximateMessageNumber) {
    this.approximateMessageNumber = approximateMessageNumber;
    setApproximateMessageNumberIsSet(true);
    return this;
  }

  public void unsetApproximateMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __APPROXIMATEMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field approximateMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetApproximateMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __APPROXIMATEMESSAGENUMBER_ISSET_ID);
  }

  public void setApproximateMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __APPROXIMATEMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The available message number in this queue, this is for message that could
   * be get using receivedMesasge
   * 
   */
  public long getApproximateAvailableMessageNumber() {
    return this.approximateAvailableMessageNumber;
  }

  /**
   * The available message number in this queue, this is for message that could
   * be get using receivedMesasge
   * 
   */
  public QueueState setApproximateAvailableMessageNumber(long approximateAvailableMessageNumber) {
    this.approximateAvailableMessageNumber = approximateAvailableMessageNumber;
    setApproximateAvailableMessageNumberIsSet(true);
    return this;
  }

  public void unsetApproximateAvailableMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __APPROXIMATEAVAILABLEMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field approximateAvailableMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetApproximateAvailableMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __APPROXIMATEAVAILABLEMESSAGENUMBER_ISSET_ID);
  }

  public void setApproximateAvailableMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __APPROXIMATEAVAILABLEMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The invisibility message number in this queue, this is for received message
   * that in invisibilitySeconds and not deleted;
   * 
   */
  public long getApproximateInvisibilityMessageNumber() {
    return this.approximateInvisibilityMessageNumber;
  }

  /**
   * The invisibility message number in this queue, this is for received message
   * that in invisibilitySeconds and not deleted;
   * 
   */
  public QueueState setApproximateInvisibilityMessageNumber(long approximateInvisibilityMessageNumber) {
    this.approximateInvisibilityMessageNumber = approximateInvisibilityMessageNumber;
    setApproximateInvisibilityMessageNumberIsSet(true);
    return this;
  }

  public void unsetApproximateInvisibilityMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __APPROXIMATEINVISIBILITYMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field approximateInvisibilityMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetApproximateInvisibilityMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __APPROXIMATEINVISIBILITYMESSAGENUMBER_ISSET_ID);
  }

  public void setApproximateInvisibilityMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __APPROXIMATEINVISIBILITYMESSAGENUMBER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CREATE_TIMESTAMP:
      if (value == null) {
        unsetCreateTimestamp();
      } else {
        setCreateTimestamp((Long)value);
      }
      break;

    case LAST_MODIFIED_TIMESTAMP:
      if (value == null) {
        unsetLastModifiedTimestamp();
      } else {
        setLastModifiedTimestamp((Long)value);
      }
      break;

    case APPROXIMATE_MESSAGE_NUMBER:
      if (value == null) {
        unsetApproximateMessageNumber();
      } else {
        setApproximateMessageNumber((Long)value);
      }
      break;

    case APPROXIMATE_AVAILABLE_MESSAGE_NUMBER:
      if (value == null) {
        unsetApproximateAvailableMessageNumber();
      } else {
        setApproximateAvailableMessageNumber((Long)value);
      }
      break;

    case APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER:
      if (value == null) {
        unsetApproximateInvisibilityMessageNumber();
      } else {
        setApproximateInvisibilityMessageNumber((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATE_TIMESTAMP:
      return Long.valueOf(getCreateTimestamp());

    case LAST_MODIFIED_TIMESTAMP:
      return Long.valueOf(getLastModifiedTimestamp());

    case APPROXIMATE_MESSAGE_NUMBER:
      return Long.valueOf(getApproximateMessageNumber());

    case APPROXIMATE_AVAILABLE_MESSAGE_NUMBER:
      return Long.valueOf(getApproximateAvailableMessageNumber());

    case APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER:
      return Long.valueOf(getApproximateInvisibilityMessageNumber());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CREATE_TIMESTAMP:
      return isSetCreateTimestamp();
    case LAST_MODIFIED_TIMESTAMP:
      return isSetLastModifiedTimestamp();
    case APPROXIMATE_MESSAGE_NUMBER:
      return isSetApproximateMessageNumber();
    case APPROXIMATE_AVAILABLE_MESSAGE_NUMBER:
      return isSetApproximateAvailableMessageNumber();
    case APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER:
      return isSetApproximateInvisibilityMessageNumber();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueueState)
      return this.equals((QueueState)that);
    return false;
  }

  public boolean equals(QueueState that) {
    if (that == null)
      return false;

    boolean this_present_createTimestamp = true;
    boolean that_present_createTimestamp = true;
    if (this_present_createTimestamp || that_present_createTimestamp) {
      if (!(this_present_createTimestamp && that_present_createTimestamp))
        return false;
      if (this.createTimestamp != that.createTimestamp)
        return false;
    }

    boolean this_present_lastModifiedTimestamp = true;
    boolean that_present_lastModifiedTimestamp = true;
    if (this_present_lastModifiedTimestamp || that_present_lastModifiedTimestamp) {
      if (!(this_present_lastModifiedTimestamp && that_present_lastModifiedTimestamp))
        return false;
      if (this.lastModifiedTimestamp != that.lastModifiedTimestamp)
        return false;
    }

    boolean this_present_approximateMessageNumber = true;
    boolean that_present_approximateMessageNumber = true;
    if (this_present_approximateMessageNumber || that_present_approximateMessageNumber) {
      if (!(this_present_approximateMessageNumber && that_present_approximateMessageNumber))
        return false;
      if (this.approximateMessageNumber != that.approximateMessageNumber)
        return false;
    }

    boolean this_present_approximateAvailableMessageNumber = true;
    boolean that_present_approximateAvailableMessageNumber = true;
    if (this_present_approximateAvailableMessageNumber || that_present_approximateAvailableMessageNumber) {
      if (!(this_present_approximateAvailableMessageNumber && that_present_approximateAvailableMessageNumber))
        return false;
      if (this.approximateAvailableMessageNumber != that.approximateAvailableMessageNumber)
        return false;
    }

    boolean this_present_approximateInvisibilityMessageNumber = true;
    boolean that_present_approximateInvisibilityMessageNumber = true;
    if (this_present_approximateInvisibilityMessageNumber || that_present_approximateInvisibilityMessageNumber) {
      if (!(this_present_approximateInvisibilityMessageNumber && that_present_approximateInvisibilityMessageNumber))
        return false;
      if (this.approximateInvisibilityMessageNumber != that.approximateInvisibilityMessageNumber)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_createTimestamp = true;
    list.add(present_createTimestamp);
    if (present_createTimestamp)
      list.add(createTimestamp);

    boolean present_lastModifiedTimestamp = true;
    list.add(present_lastModifiedTimestamp);
    if (present_lastModifiedTimestamp)
      list.add(lastModifiedTimestamp);

    boolean present_approximateMessageNumber = true;
    list.add(present_approximateMessageNumber);
    if (present_approximateMessageNumber)
      list.add(approximateMessageNumber);

    boolean present_approximateAvailableMessageNumber = true;
    list.add(present_approximateAvailableMessageNumber);
    if (present_approximateAvailableMessageNumber)
      list.add(approximateAvailableMessageNumber);

    boolean present_approximateInvisibilityMessageNumber = true;
    list.add(present_approximateInvisibilityMessageNumber);
    if (present_approximateInvisibilityMessageNumber)
      list.add(approximateInvisibilityMessageNumber);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueueState other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCreateTimestamp()).compareTo(other.isSetCreateTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.createTimestamp, other.createTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastModifiedTimestamp()).compareTo(other.isSetLastModifiedTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModifiedTimestamp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.lastModifiedTimestamp, other.lastModifiedTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApproximateMessageNumber()).compareTo(other.isSetApproximateMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApproximateMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.approximateMessageNumber, other.approximateMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApproximateAvailableMessageNumber()).compareTo(other.isSetApproximateAvailableMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApproximateAvailableMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.approximateAvailableMessageNumber, other.approximateAvailableMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApproximateInvisibilityMessageNumber()).compareTo(other.isSetApproximateInvisibilityMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApproximateInvisibilityMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.approximateInvisibilityMessageNumber, other.approximateInvisibilityMessageNumber);
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
    StringBuilder sb = new StringBuilder("QueueState(");
    boolean first = true;

    sb.append("createTimestamp:");
    sb.append(this.createTimestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastModifiedTimestamp:");
    sb.append(this.lastModifiedTimestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("approximateMessageNumber:");
    sb.append(this.approximateMessageNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("approximateAvailableMessageNumber:");
    sb.append(this.approximateAvailableMessageNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("approximateInvisibilityMessageNumber:");
    sb.append(this.approximateInvisibilityMessageNumber);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // alas, we cannot check 'createTimestamp' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'lastModifiedTimestamp' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'approximateMessageNumber' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'approximateAvailableMessageNumber' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'approximateInvisibilityMessageNumber' because it's a primitive and you chose the non-beans generator.
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

  private static class QueueStateStandardSchemeFactory implements SchemeFactory {
    public QueueStateStandardScheme getScheme() {
      return new QueueStateStandardScheme();
    }
  }

  private static class QueueStateStandardScheme extends StandardScheme<QueueState> {

    public void read(libthrift091.protocol.TProtocol iprot, QueueState struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CREATE_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.createTimestamp = iprot.readI64();
              struct.setCreateTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LAST_MODIFIED_TIMESTAMP
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.lastModifiedTimestamp = iprot.readI64();
              struct.setLastModifiedTimestampIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPROXIMATE_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.approximateMessageNumber = iprot.readI64();
              struct.setApproximateMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // APPROXIMATE_AVAILABLE_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.approximateAvailableMessageNumber = iprot.readI64();
              struct.setApproximateAvailableMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.approximateInvisibilityMessageNumber = iprot.readI64();
              struct.setApproximateInvisibilityMessageNumberIsSet(true);
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
      if (!struct.isSetCreateTimestamp()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'createTimestamp' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetLastModifiedTimestamp()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'lastModifiedTimestamp' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetApproximateMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'approximateMessageNumber' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetApproximateAvailableMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'approximateAvailableMessageNumber' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetApproximateInvisibilityMessageNumber()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'approximateInvisibilityMessageNumber' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, QueueState struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CREATE_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.createTimestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_MODIFIED_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.lastModifiedTimestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPROXIMATE_MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI64(struct.approximateMessageNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPROXIMATE_AVAILABLE_MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI64(struct.approximateAvailableMessageNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APPROXIMATE_INVISIBILITY_MESSAGE_NUMBER_FIELD_DESC);
      oprot.writeI64(struct.approximateInvisibilityMessageNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueueStateTupleSchemeFactory implements SchemeFactory {
    public QueueStateTupleScheme getScheme() {
      return new QueueStateTupleScheme();
    }
  }

  private static class QueueStateTupleScheme extends TupleScheme<QueueState> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueueState struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.createTimestamp);
      oprot.writeI64(struct.lastModifiedTimestamp);
      oprot.writeI64(struct.approximateMessageNumber);
      oprot.writeI64(struct.approximateAvailableMessageNumber);
      oprot.writeI64(struct.approximateInvisibilityMessageNumber);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueueState struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.createTimestamp = iprot.readI64();
      struct.setCreateTimestampIsSet(true);
      struct.lastModifiedTimestamp = iprot.readI64();
      struct.setLastModifiedTimestampIsSet(true);
      struct.approximateMessageNumber = iprot.readI64();
      struct.setApproximateMessageNumberIsSet(true);
      struct.approximateAvailableMessageNumber = iprot.readI64();
      struct.setApproximateAvailableMessageNumberIsSet(true);
      struct.approximateInvisibilityMessageNumber = iprot.readI64();
      struct.setApproximateInvisibilityMessageNumberIsSet(true);
    }
  }

}

