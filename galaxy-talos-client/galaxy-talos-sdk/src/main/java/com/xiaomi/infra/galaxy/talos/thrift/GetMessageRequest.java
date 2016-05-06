/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-7")
public class GetMessageRequest implements libthrift091.TBase<GetMessageRequest, GetMessageRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetMessageRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetMessageRequest");

  private static final libthrift091.protocol.TField TOPIC_AND_PARTITION_FIELD_DESC = new libthrift091.protocol.TField("topicAndPartition", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField MESSAGE_OFFSET_FIELD_DESC = new libthrift091.protocol.TField("messageOffset", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField MAX_GET_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("maxGetMessageNumber", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField MAX_GET_MESSAGE_BYTES_FIELD_DESC = new libthrift091.protocol.TField("maxGetMessageBytes", libthrift091.protocol.TType.I32, (short)5);
  private static final libthrift091.protocol.TField SHOW_UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC = new libthrift091.protocol.TField("showUnHandledMessageNumber", libthrift091.protocol.TType.BOOL, (short)6);
  private static final libthrift091.protocol.TField SEQUENCE_ID_FIELD_DESC = new libthrift091.protocol.TField("sequenceId", libthrift091.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetMessageRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetMessageRequestTupleSchemeFactory());
  }

  /**
   * TopicAndPartititon from which to get message;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition; // required
  /**
   * The offset that from which to read message, can be MessageOffset.START_OFFSET,
   * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
   * 
   */
  public long messageOffset; // required
  /**
   * The max get message number, max is 2000 (1 ~ 2000)
   * 
   */
  public int maxGetMessageNumber; // optional
  /**
   * The max get message bytes, max is 2MB (1B ~ 2MB)
   * 
   */
  public int maxGetMessageBytes; // optional
  /**
   * Whether or not set unHandlerMessageNumber in GetMessageResponse;
   * 
   */
  public boolean showUnHandledMessageNumber; // optional
  /**
   * The unique identifier for this GutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public String sequenceId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * TopicAndPartititon from which to get message;
     * 
     */
    TOPIC_AND_PARTITION((short)1, "topicAndPartition"),
    /**
     * The offset that from which to read message, can be MessageOffset.START_OFFSET,
     * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
     * 
     */
    MESSAGE_OFFSET((short)3, "messageOffset"),
    /**
     * The max get message number, max is 2000 (1 ~ 2000)
     * 
     */
    MAX_GET_MESSAGE_NUMBER((short)4, "maxGetMessageNumber"),
    /**
     * The max get message bytes, max is 2MB (1B ~ 2MB)
     * 
     */
    MAX_GET_MESSAGE_BYTES((short)5, "maxGetMessageBytes"),
    /**
     * Whether or not set unHandlerMessageNumber in GetMessageResponse;
     * 
     */
    SHOW_UN_HANDLED_MESSAGE_NUMBER((short)6, "showUnHandledMessageNumber"),
    /**
     * The unique identifier for this GutMessageRequest, should in format
     * client_id#sequence_id;
     * 
     */
    SEQUENCE_ID((short)7, "sequenceId");

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
        case 1: // TOPIC_AND_PARTITION
          return TOPIC_AND_PARTITION;
        case 3: // MESSAGE_OFFSET
          return MESSAGE_OFFSET;
        case 4: // MAX_GET_MESSAGE_NUMBER
          return MAX_GET_MESSAGE_NUMBER;
        case 5: // MAX_GET_MESSAGE_BYTES
          return MAX_GET_MESSAGE_BYTES;
        case 6: // SHOW_UN_HANDLED_MESSAGE_NUMBER
          return SHOW_UN_HANDLED_MESSAGE_NUMBER;
        case 7: // SEQUENCE_ID
          return SEQUENCE_ID;
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
  private static final int __MESSAGEOFFSET_ISSET_ID = 0;
  private static final int __MAXGETMESSAGENUMBER_ISSET_ID = 1;
  private static final int __MAXGETMESSAGEBYTES_ISSET_ID = 2;
  private static final int __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MAX_GET_MESSAGE_NUMBER,_Fields.MAX_GET_MESSAGE_BYTES,_Fields.SHOW_UN_HANDLED_MESSAGE_NUMBER};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPIC_AND_PARTITION, new libthrift091.meta_data.FieldMetaData("topicAndPartition", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition.class)));
    tmpMap.put(_Fields.MESSAGE_OFFSET, new libthrift091.meta_data.FieldMetaData("messageOffset", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_GET_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("maxGetMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_GET_MESSAGE_BYTES, new libthrift091.meta_data.FieldMetaData("maxGetMessageBytes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.SHOW_UN_HANDLED_MESSAGE_NUMBER, new libthrift091.meta_data.FieldMetaData("showUnHandledMessageNumber", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SEQUENCE_ID, new libthrift091.meta_data.FieldMetaData("sequenceId", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetMessageRequest.class, metaDataMap);
  }

  public GetMessageRequest() {
    this.maxGetMessageNumber = 2000;

    this.maxGetMessageBytes = 2097152;

    this.showUnHandledMessageNumber = true;

  }

  public GetMessageRequest(
    com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition,
    long messageOffset,
    String sequenceId)
  {
    this();
    this.topicAndPartition = topicAndPartition;
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
    this.sequenceId = sequenceId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetMessageRequest(GetMessageRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTopicAndPartition()) {
      this.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition(other.topicAndPartition);
    }
    this.messageOffset = other.messageOffset;
    this.maxGetMessageNumber = other.maxGetMessageNumber;
    this.maxGetMessageBytes = other.maxGetMessageBytes;
    this.showUnHandledMessageNumber = other.showUnHandledMessageNumber;
    if (other.isSetSequenceId()) {
      this.sequenceId = other.sequenceId;
    }
  }

  public GetMessageRequest deepCopy() {
    return new GetMessageRequest(this);
  }

  @Override
  public void clear() {
    this.topicAndPartition = null;
    setMessageOffsetIsSet(false);
    this.messageOffset = 0;
    this.maxGetMessageNumber = 2000;

    this.maxGetMessageBytes = 2097152;

    this.showUnHandledMessageNumber = true;

    this.sequenceId = null;
  }

  /**
   * TopicAndPartititon from which to get message;
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition getTopicAndPartition() {
    return this.topicAndPartition;
  }

  /**
   * TopicAndPartititon from which to get message;
   * 
   */
  public GetMessageRequest setTopicAndPartition(com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition topicAndPartition) {
    this.topicAndPartition = topicAndPartition;
    return this;
  }

  public void unsetTopicAndPartition() {
    this.topicAndPartition = null;
  }

  /** Returns true if field topicAndPartition is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicAndPartition() {
    return this.topicAndPartition != null;
  }

  public void setTopicAndPartitionIsSet(boolean value) {
    if (!value) {
      this.topicAndPartition = null;
    }
  }

  /**
   * The offset that from which to read message, can be MessageOffset.START_OFFSET,
   * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
   * 
   */
  public long getMessageOffset() {
    return this.messageOffset;
  }

  /**
   * The offset that from which to read message, can be MessageOffset.START_OFFSET,
   * MessageOffset.LTTEST_OFFSET or and int from 0 to (2^63 - 1)
   * 
   */
  public GetMessageRequest setMessageOffset(long messageOffset) {
    this.messageOffset = messageOffset;
    setMessageOffsetIsSet(true);
    return this;
  }

  public void unsetMessageOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  /** Returns true if field messageOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID);
  }

  public void setMessageOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MESSAGEOFFSET_ISSET_ID, value);
  }

  /**
   * The max get message number, max is 2000 (1 ~ 2000)
   * 
   */
  public int getMaxGetMessageNumber() {
    return this.maxGetMessageNumber;
  }

  /**
   * The max get message number, max is 2000 (1 ~ 2000)
   * 
   */
  public GetMessageRequest setMaxGetMessageNumber(int maxGetMessageNumber) {
    this.maxGetMessageNumber = maxGetMessageNumber;
    setMaxGetMessageNumberIsSet(true);
    return this;
  }

  public void unsetMaxGetMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXGETMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field maxGetMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxGetMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXGETMESSAGENUMBER_ISSET_ID);
  }

  public void setMaxGetMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXGETMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The max get message bytes, max is 2MB (1B ~ 2MB)
   * 
   */
  public int getMaxGetMessageBytes() {
    return this.maxGetMessageBytes;
  }

  /**
   * The max get message bytes, max is 2MB (1B ~ 2MB)
   * 
   */
  public GetMessageRequest setMaxGetMessageBytes(int maxGetMessageBytes) {
    this.maxGetMessageBytes = maxGetMessageBytes;
    setMaxGetMessageBytesIsSet(true);
    return this;
  }

  public void unsetMaxGetMessageBytes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXGETMESSAGEBYTES_ISSET_ID);
  }

  /** Returns true if field maxGetMessageBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxGetMessageBytes() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXGETMESSAGEBYTES_ISSET_ID);
  }

  public void setMaxGetMessageBytesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXGETMESSAGEBYTES_ISSET_ID, value);
  }

  /**
   * Whether or not set unHandlerMessageNumber in GetMessageResponse;
   * 
   */
  public boolean isShowUnHandledMessageNumber() {
    return this.showUnHandledMessageNumber;
  }

  /**
   * Whether or not set unHandlerMessageNumber in GetMessageResponse;
   * 
   */
  public GetMessageRequest setShowUnHandledMessageNumber(boolean showUnHandledMessageNumber) {
    this.showUnHandledMessageNumber = showUnHandledMessageNumber;
    setShowUnHandledMessageNumberIsSet(true);
    return this;
  }

  public void unsetShowUnHandledMessageNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  /** Returns true if field showUnHandledMessageNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetShowUnHandledMessageNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID);
  }

  public void setShowUnHandledMessageNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHOWUNHANDLEDMESSAGENUMBER_ISSET_ID, value);
  }

  /**
   * The unique identifier for this GutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public String getSequenceId() {
    return this.sequenceId;
  }

  /**
   * The unique identifier for this GutMessageRequest, should in format
   * client_id#sequence_id;
   * 
   */
  public GetMessageRequest setSequenceId(String sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  public void unsetSequenceId() {
    this.sequenceId = null;
  }

  /** Returns true if field sequenceId is set (has been assigned a value) and false otherwise */
  public boolean isSetSequenceId() {
    return this.sequenceId != null;
  }

  public void setSequenceIdIsSet(boolean value) {
    if (!value) {
      this.sequenceId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      if (value == null) {
        unsetTopicAndPartition();
      } else {
        setTopicAndPartition((com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition)value);
      }
      break;

    case MESSAGE_OFFSET:
      if (value == null) {
        unsetMessageOffset();
      } else {
        setMessageOffset((Long)value);
      }
      break;

    case MAX_GET_MESSAGE_NUMBER:
      if (value == null) {
        unsetMaxGetMessageNumber();
      } else {
        setMaxGetMessageNumber((Integer)value);
      }
      break;

    case MAX_GET_MESSAGE_BYTES:
      if (value == null) {
        unsetMaxGetMessageBytes();
      } else {
        setMaxGetMessageBytes((Integer)value);
      }
      break;

    case SHOW_UN_HANDLED_MESSAGE_NUMBER:
      if (value == null) {
        unsetShowUnHandledMessageNumber();
      } else {
        setShowUnHandledMessageNumber((Boolean)value);
      }
      break;

    case SEQUENCE_ID:
      if (value == null) {
        unsetSequenceId();
      } else {
        setSequenceId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_AND_PARTITION:
      return getTopicAndPartition();

    case MESSAGE_OFFSET:
      return Long.valueOf(getMessageOffset());

    case MAX_GET_MESSAGE_NUMBER:
      return Integer.valueOf(getMaxGetMessageNumber());

    case MAX_GET_MESSAGE_BYTES:
      return Integer.valueOf(getMaxGetMessageBytes());

    case SHOW_UN_HANDLED_MESSAGE_NUMBER:
      return Boolean.valueOf(isShowUnHandledMessageNumber());

    case SEQUENCE_ID:
      return getSequenceId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_AND_PARTITION:
      return isSetTopicAndPartition();
    case MESSAGE_OFFSET:
      return isSetMessageOffset();
    case MAX_GET_MESSAGE_NUMBER:
      return isSetMaxGetMessageNumber();
    case MAX_GET_MESSAGE_BYTES:
      return isSetMaxGetMessageBytes();
    case SHOW_UN_HANDLED_MESSAGE_NUMBER:
      return isSetShowUnHandledMessageNumber();
    case SEQUENCE_ID:
      return isSetSequenceId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetMessageRequest)
      return this.equals((GetMessageRequest)that);
    return false;
  }

  public boolean equals(GetMessageRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicAndPartition = true && this.isSetTopicAndPartition();
    boolean that_present_topicAndPartition = true && that.isSetTopicAndPartition();
    if (this_present_topicAndPartition || that_present_topicAndPartition) {
      if (!(this_present_topicAndPartition && that_present_topicAndPartition))
        return false;
      if (!this.topicAndPartition.equals(that.topicAndPartition))
        return false;
    }

    boolean this_present_messageOffset = true;
    boolean that_present_messageOffset = true;
    if (this_present_messageOffset || that_present_messageOffset) {
      if (!(this_present_messageOffset && that_present_messageOffset))
        return false;
      if (this.messageOffset != that.messageOffset)
        return false;
    }

    boolean this_present_maxGetMessageNumber = true && this.isSetMaxGetMessageNumber();
    boolean that_present_maxGetMessageNumber = true && that.isSetMaxGetMessageNumber();
    if (this_present_maxGetMessageNumber || that_present_maxGetMessageNumber) {
      if (!(this_present_maxGetMessageNumber && that_present_maxGetMessageNumber))
        return false;
      if (this.maxGetMessageNumber != that.maxGetMessageNumber)
        return false;
    }

    boolean this_present_maxGetMessageBytes = true && this.isSetMaxGetMessageBytes();
    boolean that_present_maxGetMessageBytes = true && that.isSetMaxGetMessageBytes();
    if (this_present_maxGetMessageBytes || that_present_maxGetMessageBytes) {
      if (!(this_present_maxGetMessageBytes && that_present_maxGetMessageBytes))
        return false;
      if (this.maxGetMessageBytes != that.maxGetMessageBytes)
        return false;
    }

    boolean this_present_showUnHandledMessageNumber = true && this.isSetShowUnHandledMessageNumber();
    boolean that_present_showUnHandledMessageNumber = true && that.isSetShowUnHandledMessageNumber();
    if (this_present_showUnHandledMessageNumber || that_present_showUnHandledMessageNumber) {
      if (!(this_present_showUnHandledMessageNumber && that_present_showUnHandledMessageNumber))
        return false;
      if (this.showUnHandledMessageNumber != that.showUnHandledMessageNumber)
        return false;
    }

    boolean this_present_sequenceId = true && this.isSetSequenceId();
    boolean that_present_sequenceId = true && that.isSetSequenceId();
    if (this_present_sequenceId || that_present_sequenceId) {
      if (!(this_present_sequenceId && that_present_sequenceId))
        return false;
      if (!this.sequenceId.equals(that.sequenceId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicAndPartition = true && (isSetTopicAndPartition());
    list.add(present_topicAndPartition);
    if (present_topicAndPartition)
      list.add(topicAndPartition);

    boolean present_messageOffset = true;
    list.add(present_messageOffset);
    if (present_messageOffset)
      list.add(messageOffset);

    boolean present_maxGetMessageNumber = true && (isSetMaxGetMessageNumber());
    list.add(present_maxGetMessageNumber);
    if (present_maxGetMessageNumber)
      list.add(maxGetMessageNumber);

    boolean present_maxGetMessageBytes = true && (isSetMaxGetMessageBytes());
    list.add(present_maxGetMessageBytes);
    if (present_maxGetMessageBytes)
      list.add(maxGetMessageBytes);

    boolean present_showUnHandledMessageNumber = true && (isSetShowUnHandledMessageNumber());
    list.add(present_showUnHandledMessageNumber);
    if (present_showUnHandledMessageNumber)
      list.add(showUnHandledMessageNumber);

    boolean present_sequenceId = true && (isSetSequenceId());
    list.add(present_sequenceId);
    if (present_sequenceId)
      list.add(sequenceId);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetMessageRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicAndPartition()).compareTo(other.isSetTopicAndPartition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicAndPartition()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicAndPartition, other.topicAndPartition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageOffset()).compareTo(other.isSetMessageOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageOffset()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.messageOffset, other.messageOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxGetMessageNumber()).compareTo(other.isSetMaxGetMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxGetMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxGetMessageNumber, other.maxGetMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxGetMessageBytes()).compareTo(other.isSetMaxGetMessageBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxGetMessageBytes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxGetMessageBytes, other.maxGetMessageBytes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShowUnHandledMessageNumber()).compareTo(other.isSetShowUnHandledMessageNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShowUnHandledMessageNumber()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.showUnHandledMessageNumber, other.showUnHandledMessageNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequenceId()).compareTo(other.isSetSequenceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequenceId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.sequenceId, other.sequenceId);
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
    StringBuilder sb = new StringBuilder("GetMessageRequest(");
    boolean first = true;

    sb.append("topicAndPartition:");
    if (this.topicAndPartition == null) {
      sb.append("null");
    } else {
      sb.append(this.topicAndPartition);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageOffset:");
    sb.append(this.messageOffset);
    first = false;
    if (isSetMaxGetMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("maxGetMessageNumber:");
      sb.append(this.maxGetMessageNumber);
      first = false;
    }
    if (isSetMaxGetMessageBytes()) {
      if (!first) sb.append(", ");
      sb.append("maxGetMessageBytes:");
      sb.append(this.maxGetMessageBytes);
      first = false;
    }
    if (isSetShowUnHandledMessageNumber()) {
      if (!first) sb.append(", ");
      sb.append("showUnHandledMessageNumber:");
      sb.append(this.showUnHandledMessageNumber);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("sequenceId:");
    if (this.sequenceId == null) {
      sb.append("null");
    } else {
      sb.append(this.sequenceId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicAndPartition == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicAndPartition' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'messageOffset' because it's a primitive and you chose the non-beans generator.
    if (sequenceId == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'sequenceId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicAndPartition != null) {
      topicAndPartition.validate();
    }
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

  private static class GetMessageRequestStandardSchemeFactory implements SchemeFactory {
    public GetMessageRequestStandardScheme getScheme() {
      return new GetMessageRequestStandardScheme();
    }
  }

  private static class GetMessageRequestStandardScheme extends StandardScheme<GetMessageRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, GetMessageRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_AND_PARTITION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
              struct.topicAndPartition.read(iprot);
              struct.setTopicAndPartitionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE_OFFSET
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.messageOffset = iprot.readI64();
              struct.setMessageOffsetIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_GET_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxGetMessageNumber = iprot.readI32();
              struct.setMaxGetMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAX_GET_MESSAGE_BYTES
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxGetMessageBytes = iprot.readI32();
              struct.setMaxGetMessageBytesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SHOW_UN_HANDLED_MESSAGE_NUMBER
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.showUnHandledMessageNumber = iprot.readBool();
              struct.setShowUnHandledMessageNumberIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SEQUENCE_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.sequenceId = iprot.readString();
              struct.setSequenceIdIsSet(true);
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
      if (!struct.isSetMessageOffset()) {
        throw new libthrift091.protocol.TProtocolException("Required field 'messageOffset' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, GetMessageRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicAndPartition != null) {
        oprot.writeFieldBegin(TOPIC_AND_PARTITION_FIELD_DESC);
        struct.topicAndPartition.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGE_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.messageOffset);
      oprot.writeFieldEnd();
      if (struct.isSetMaxGetMessageNumber()) {
        oprot.writeFieldBegin(MAX_GET_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeI32(struct.maxGetMessageNumber);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxGetMessageBytes()) {
        oprot.writeFieldBegin(MAX_GET_MESSAGE_BYTES_FIELD_DESC);
        oprot.writeI32(struct.maxGetMessageBytes);
        oprot.writeFieldEnd();
      }
      if (struct.isSetShowUnHandledMessageNumber()) {
        oprot.writeFieldBegin(SHOW_UN_HANDLED_MESSAGE_NUMBER_FIELD_DESC);
        oprot.writeBool(struct.showUnHandledMessageNumber);
        oprot.writeFieldEnd();
      }
      if (struct.sequenceId != null) {
        oprot.writeFieldBegin(SEQUENCE_ID_FIELD_DESC);
        oprot.writeString(struct.sequenceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetMessageRequestTupleSchemeFactory implements SchemeFactory {
    public GetMessageRequestTupleScheme getScheme() {
      return new GetMessageRequestTupleScheme();
    }
  }

  private static class GetMessageRequestTupleScheme extends TupleScheme<GetMessageRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicAndPartition.write(oprot);
      oprot.writeI64(struct.messageOffset);
      oprot.writeString(struct.sequenceId);
      BitSet optionals = new BitSet();
      if (struct.isSetMaxGetMessageNumber()) {
        optionals.set(0);
      }
      if (struct.isSetMaxGetMessageBytes()) {
        optionals.set(1);
      }
      if (struct.isSetShowUnHandledMessageNumber()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMaxGetMessageNumber()) {
        oprot.writeI32(struct.maxGetMessageNumber);
      }
      if (struct.isSetMaxGetMessageBytes()) {
        oprot.writeI32(struct.maxGetMessageBytes);
      }
      if (struct.isSetShowUnHandledMessageNumber()) {
        oprot.writeBool(struct.showUnHandledMessageNumber);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetMessageRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicAndPartition = new com.xiaomi.infra.galaxy.talos.thrift.TopicAndPartition();
      struct.topicAndPartition.read(iprot);
      struct.setTopicAndPartitionIsSet(true);
      struct.messageOffset = iprot.readI64();
      struct.setMessageOffsetIsSet(true);
      struct.sequenceId = iprot.readString();
      struct.setSequenceIdIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.maxGetMessageNumber = iprot.readI32();
        struct.setMaxGetMessageNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxGetMessageBytes = iprot.readI32();
        struct.setMaxGetMessageBytesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.showUnHandledMessageNumber = iprot.readBool();
        struct.setShowUnHandledMessageNumberIsSet(true);
      }
    }
  }

}
