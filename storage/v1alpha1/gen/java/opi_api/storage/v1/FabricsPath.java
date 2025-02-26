// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.FabricsPath}
 */
public final class FabricsPath extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.FabricsPath)
    FabricsPathOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FabricsPath.newBuilder() to construct.
  private FabricsPath(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FabricsPath() {
    subnqn_ = "";
    adrfam_ = 0;
    sourceTraddr_ = "";
    hostnqn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FabricsPath();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FabricsPath(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            trsvcid_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            subnqn_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            adrfam_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            sourceTraddr_ = s;
            break;
          }
          case 40: {

            sourceTrsvcid_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            hostnqn_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_FabricsPath_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_FabricsPath_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.FabricsPath.class, opi_api.storage.v1.FabricsPath.Builder.class);
  }

  public static final int TRSVCID_FIELD_NUMBER = 1;
  private long trsvcid_;
  /**
   * <pre>
   * Destination service id (e.g. Port)
   * </pre>
   *
   * <code>int64 trsvcid = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The trsvcid.
   */
  @java.lang.Override
  public long getTrsvcid() {
    return trsvcid_;
  }

  public static final int SUBNQN_FIELD_NUMBER = 2;
  private volatile java.lang.Object subnqn_;
  /**
   * <pre>
   * Subsystem NQN
   * </pre>
   *
   * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The subnqn.
   */
  @java.lang.Override
  public java.lang.String getSubnqn() {
    java.lang.Object ref = subnqn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnqn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Subsystem NQN
   * </pre>
   *
   * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for subnqn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubnqnBytes() {
    java.lang.Object ref = subnqn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subnqn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADRFAM_FIELD_NUMBER = 3;
  private int adrfam_;
  /**
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for adrfam.
   */
  @java.lang.Override public int getAdrfamValue() {
    return adrfam_;
  }
  /**
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adrfam.
   */
  @java.lang.Override public opi_api.storage.v1.NvmeAddressFamily getAdrfam() {
    @SuppressWarnings("deprecation")
    opi_api.storage.v1.NvmeAddressFamily result = opi_api.storage.v1.NvmeAddressFamily.valueOf(adrfam_);
    return result == null ? opi_api.storage.v1.NvmeAddressFamily.UNRECOGNIZED : result;
  }

  public static final int SOURCE_TRADDR_FIELD_NUMBER = 4;
  private volatile java.lang.Object sourceTraddr_;
  /**
   * <pre>
   * Source address (e.g. IP of local NIC)
   * </pre>
   *
   * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceTraddr.
   */
  @java.lang.Override
  public java.lang.String getSourceTraddr() {
    java.lang.Object ref = sourceTraddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceTraddr_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Source address (e.g. IP of local NIC)
   * </pre>
   *
   * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for sourceTraddr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceTraddrBytes() {
    java.lang.Object ref = sourceTraddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceTraddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_TRSVCID_FIELD_NUMBER = 5;
  private long sourceTrsvcid_;
  /**
   * <pre>
   * Source port (e.g. Port of local NIC)
   * </pre>
   *
   * <code>int64 source_trsvcid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceTrsvcid.
   */
  @java.lang.Override
  public long getSourceTrsvcid() {
    return sourceTrsvcid_;
  }

  public static final int HOSTNQN_FIELD_NUMBER = 6;
  private volatile java.lang.Object hostnqn_;
  /**
   * <pre>
   * Host NQN
   * </pre>
   *
   * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The hostnqn.
   */
  @java.lang.Override
  public java.lang.String getHostnqn() {
    java.lang.Object ref = hostnqn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostnqn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Host NQN
   * </pre>
   *
   * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for hostnqn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostnqnBytes() {
    java.lang.Object ref = hostnqn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostnqn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (trsvcid_ != 0L) {
      output.writeInt64(1, trsvcid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnqn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subnqn_);
    }
    if (adrfam_ != opi_api.storage.v1.NvmeAddressFamily.NVME_ADDRESS_FAMILY_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, adrfam_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceTraddr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sourceTraddr_);
    }
    if (sourceTrsvcid_ != 0L) {
      output.writeInt64(5, sourceTrsvcid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostnqn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, hostnqn_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trsvcid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, trsvcid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnqn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subnqn_);
    }
    if (adrfam_ != opi_api.storage.v1.NvmeAddressFamily.NVME_ADDRESS_FAMILY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, adrfam_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceTraddr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sourceTraddr_);
    }
    if (sourceTrsvcid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, sourceTrsvcid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostnqn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, hostnqn_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.FabricsPath)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.FabricsPath other = (opi_api.storage.v1.FabricsPath) obj;

    if (getTrsvcid()
        != other.getTrsvcid()) return false;
    if (!getSubnqn()
        .equals(other.getSubnqn())) return false;
    if (adrfam_ != other.adrfam_) return false;
    if (!getSourceTraddr()
        .equals(other.getSourceTraddr())) return false;
    if (getSourceTrsvcid()
        != other.getSourceTrsvcid()) return false;
    if (!getHostnqn()
        .equals(other.getHostnqn())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRSVCID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTrsvcid());
    hash = (37 * hash) + SUBNQN_FIELD_NUMBER;
    hash = (53 * hash) + getSubnqn().hashCode();
    hash = (37 * hash) + ADRFAM_FIELD_NUMBER;
    hash = (53 * hash) + adrfam_;
    hash = (37 * hash) + SOURCE_TRADDR_FIELD_NUMBER;
    hash = (53 * hash) + getSourceTraddr().hashCode();
    hash = (37 * hash) + SOURCE_TRSVCID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSourceTrsvcid());
    hash = (37 * hash) + HOSTNQN_FIELD_NUMBER;
    hash = (53 * hash) + getHostnqn().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.FabricsPath parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.FabricsPath parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.FabricsPath parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.FabricsPath parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.FabricsPath prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opi_api.storage.v1.FabricsPath}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.FabricsPath)
      opi_api.storage.v1.FabricsPathOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_FabricsPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_FabricsPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.FabricsPath.class, opi_api.storage.v1.FabricsPath.Builder.class);
    }

    // Construct using opi_api.storage.v1.FabricsPath.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      trsvcid_ = 0L;

      subnqn_ = "";

      adrfam_ = 0;

      sourceTraddr_ = "";

      sourceTrsvcid_ = 0L;

      hostnqn_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.BackendNvmeTcpProto.internal_static_opi_api_storage_v1_FabricsPath_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.FabricsPath getDefaultInstanceForType() {
      return opi_api.storage.v1.FabricsPath.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.FabricsPath build() {
      opi_api.storage.v1.FabricsPath result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.FabricsPath buildPartial() {
      opi_api.storage.v1.FabricsPath result = new opi_api.storage.v1.FabricsPath(this);
      result.trsvcid_ = trsvcid_;
      result.subnqn_ = subnqn_;
      result.adrfam_ = adrfam_;
      result.sourceTraddr_ = sourceTraddr_;
      result.sourceTrsvcid_ = sourceTrsvcid_;
      result.hostnqn_ = hostnqn_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.FabricsPath) {
        return mergeFrom((opi_api.storage.v1.FabricsPath)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.FabricsPath other) {
      if (other == opi_api.storage.v1.FabricsPath.getDefaultInstance()) return this;
      if (other.getTrsvcid() != 0L) {
        setTrsvcid(other.getTrsvcid());
      }
      if (!other.getSubnqn().isEmpty()) {
        subnqn_ = other.subnqn_;
        onChanged();
      }
      if (other.adrfam_ != 0) {
        setAdrfamValue(other.getAdrfamValue());
      }
      if (!other.getSourceTraddr().isEmpty()) {
        sourceTraddr_ = other.sourceTraddr_;
        onChanged();
      }
      if (other.getSourceTrsvcid() != 0L) {
        setSourceTrsvcid(other.getSourceTrsvcid());
      }
      if (!other.getHostnqn().isEmpty()) {
        hostnqn_ = other.hostnqn_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.FabricsPath parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.FabricsPath) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long trsvcid_ ;
    /**
     * <pre>
     * Destination service id (e.g. Port)
     * </pre>
     *
     * <code>int64 trsvcid = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The trsvcid.
     */
    @java.lang.Override
    public long getTrsvcid() {
      return trsvcid_;
    }
    /**
     * <pre>
     * Destination service id (e.g. Port)
     * </pre>
     *
     * <code>int64 trsvcid = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The trsvcid to set.
     * @return This builder for chaining.
     */
    public Builder setTrsvcid(long value) {
      
      trsvcid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Destination service id (e.g. Port)
     * </pre>
     *
     * <code>int64 trsvcid = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrsvcid() {
      
      trsvcid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object subnqn_ = "";
    /**
     * <pre>
     * Subsystem NQN
     * </pre>
     *
     * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The subnqn.
     */
    public java.lang.String getSubnqn() {
      java.lang.Object ref = subnqn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnqn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Subsystem NQN
     * </pre>
     *
     * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for subnqn.
     */
    public com.google.protobuf.ByteString
        getSubnqnBytes() {
      java.lang.Object ref = subnqn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subnqn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Subsystem NQN
     * </pre>
     *
     * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The subnqn to set.
     * @return This builder for chaining.
     */
    public Builder setSubnqn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subnqn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subsystem NQN
     * </pre>
     *
     * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubnqn() {
      
      subnqn_ = getDefaultInstance().getSubnqn();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Subsystem NQN
     * </pre>
     *
     * <code>string subnqn = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for subnqn to set.
     * @return This builder for chaining.
     */
    public Builder setSubnqnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subnqn_ = value;
      onChanged();
      return this;
    }

    private int adrfam_ = 0;
    /**
     * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for adrfam.
     */
    @java.lang.Override public int getAdrfamValue() {
      return adrfam_;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for adrfam to set.
     * @return This builder for chaining.
     */
    public Builder setAdrfamValue(int value) {
      
      adrfam_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The adrfam.
     */
    @java.lang.Override
    public opi_api.storage.v1.NvmeAddressFamily getAdrfam() {
      @SuppressWarnings("deprecation")
      opi_api.storage.v1.NvmeAddressFamily result = opi_api.storage.v1.NvmeAddressFamily.valueOf(adrfam_);
      return result == null ? opi_api.storage.v1.NvmeAddressFamily.UNRECOGNIZED : result;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The adrfam to set.
     * @return This builder for chaining.
     */
    public Builder setAdrfam(opi_api.storage.v1.NvmeAddressFamily value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      adrfam_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdrfam() {
      
      adrfam_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sourceTraddr_ = "";
    /**
     * <pre>
     * Source address (e.g. IP of local NIC)
     * </pre>
     *
     * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The sourceTraddr.
     */
    public java.lang.String getSourceTraddr() {
      java.lang.Object ref = sourceTraddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceTraddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Source address (e.g. IP of local NIC)
     * </pre>
     *
     * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for sourceTraddr.
     */
    public com.google.protobuf.ByteString
        getSourceTraddrBytes() {
      java.lang.Object ref = sourceTraddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceTraddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Source address (e.g. IP of local NIC)
     * </pre>
     *
     * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The sourceTraddr to set.
     * @return This builder for chaining.
     */
    public Builder setSourceTraddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceTraddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source address (e.g. IP of local NIC)
     * </pre>
     *
     * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceTraddr() {
      
      sourceTraddr_ = getDefaultInstance().getSourceTraddr();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source address (e.g. IP of local NIC)
     * </pre>
     *
     * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for sourceTraddr to set.
     * @return This builder for chaining.
     */
    public Builder setSourceTraddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceTraddr_ = value;
      onChanged();
      return this;
    }

    private long sourceTrsvcid_ ;
    /**
     * <pre>
     * Source port (e.g. Port of local NIC)
     * </pre>
     *
     * <code>int64 source_trsvcid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The sourceTrsvcid.
     */
    @java.lang.Override
    public long getSourceTrsvcid() {
      return sourceTrsvcid_;
    }
    /**
     * <pre>
     * Source port (e.g. Port of local NIC)
     * </pre>
     *
     * <code>int64 source_trsvcid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The sourceTrsvcid to set.
     * @return This builder for chaining.
     */
    public Builder setSourceTrsvcid(long value) {
      
      sourceTrsvcid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source port (e.g. Port of local NIC)
     * </pre>
     *
     * <code>int64 source_trsvcid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceTrsvcid() {
      
      sourceTrsvcid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object hostnqn_ = "";
    /**
     * <pre>
     * Host NQN
     * </pre>
     *
     * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The hostnqn.
     */
    public java.lang.String getHostnqn() {
      java.lang.Object ref = hostnqn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostnqn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Host NQN
     * </pre>
     *
     * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for hostnqn.
     */
    public com.google.protobuf.ByteString
        getHostnqnBytes() {
      java.lang.Object ref = hostnqn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostnqn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Host NQN
     * </pre>
     *
     * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The hostnqn to set.
     * @return This builder for chaining.
     */
    public Builder setHostnqn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostnqn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host NQN
     * </pre>
     *
     * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearHostnqn() {
      
      hostnqn_ = getDefaultInstance().getHostnqn();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Host NQN
     * </pre>
     *
     * <code>string hostnqn = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for hostnqn to set.
     * @return This builder for chaining.
     */
    public Builder setHostnqnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostnqn_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.FabricsPath)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.FabricsPath)
  private static final opi_api.storage.v1.FabricsPath DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.FabricsPath();
  }

  public static opi_api.storage.v1.FabricsPath getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FabricsPath>
      PARSER = new com.google.protobuf.AbstractParser<FabricsPath>() {
    @java.lang.Override
    public FabricsPath parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FabricsPath(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FabricsPath> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FabricsPath> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.FabricsPath getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

