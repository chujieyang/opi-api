// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents a request to create an Nvme Controller.
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.CreateNvmeControllerRequest}
 */
public final class CreateNvmeControllerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.CreateNvmeControllerRequest)
    CreateNvmeControllerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateNvmeControllerRequest.newBuilder() to construct.
  private CreateNvmeControllerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateNvmeControllerRequest() {
    parent_ = "";
    nvmeControllerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateNvmeControllerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateNvmeControllerRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            opi_api.storage.v1.NvmeController.Builder subBuilder = null;
            if (nvmeController_ != null) {
              subBuilder = nvmeController_.toBuilder();
            }
            nvmeController_ = input.readMessage(opi_api.storage.v1.NvmeController.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(nvmeController_);
              nvmeController_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nvmeControllerId_ = s;
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
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeControllerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeControllerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.CreateNvmeControllerRequest.class, opi_api.storage.v1.CreateNvmeControllerRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NVME_CONTROLLER_FIELD_NUMBER = 2;
  private opi_api.storage.v1.NvmeController nvmeController_;
  /**
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nvmeController field is set.
   */
  @java.lang.Override
  public boolean hasNvmeController() {
    return nvmeController_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nvmeController.
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeController getNvmeController() {
    return nvmeController_ == null ? opi_api.storage.v1.NvmeController.getDefaultInstance() : nvmeController_;
  }
  /**
   * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.NvmeControllerOrBuilder getNvmeControllerOrBuilder() {
    return getNvmeController();
  }

  public static final int NVME_CONTROLLER_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object nvmeControllerId_;
  /**
   * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nvmeControllerId.
   */
  @java.lang.Override
  public java.lang.String getNvmeControllerId() {
    java.lang.Object ref = nvmeControllerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nvmeControllerId_ = s;
      return s;
    }
  }
  /**
   * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nvmeControllerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNvmeControllerIdBytes() {
    java.lang.Object ref = nvmeControllerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nvmeControllerId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (nvmeController_ != null) {
      output.writeMessage(2, getNvmeController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmeControllerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nvmeControllerId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (nvmeController_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNvmeController());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nvmeControllerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nvmeControllerId_);
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
    if (!(obj instanceof opi_api.storage.v1.CreateNvmeControllerRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.CreateNvmeControllerRequest other = (opi_api.storage.v1.CreateNvmeControllerRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasNvmeController() != other.hasNvmeController()) return false;
    if (hasNvmeController()) {
      if (!getNvmeController()
          .equals(other.getNvmeController())) return false;
    }
    if (!getNvmeControllerId()
        .equals(other.getNvmeControllerId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasNvmeController()) {
      hash = (37 * hash) + NVME_CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getNvmeController().hashCode();
    }
    hash = (37 * hash) + NVME_CONTROLLER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNvmeControllerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.CreateNvmeControllerRequest parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.CreateNvmeControllerRequest prototype) {
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
   * <pre>
   * Represents a request to create an Nvme Controller.
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.CreateNvmeControllerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.CreateNvmeControllerRequest)
      opi_api.storage.v1.CreateNvmeControllerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeControllerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeControllerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.CreateNvmeControllerRequest.class, opi_api.storage.v1.CreateNvmeControllerRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.CreateNvmeControllerRequest.newBuilder()
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
      parent_ = "";

      if (nvmeControllerBuilder_ == null) {
        nvmeController_ = null;
      } else {
        nvmeController_ = null;
        nvmeControllerBuilder_ = null;
      }
      nvmeControllerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmePcieProto.internal_static_opi_api_storage_v1_CreateNvmeControllerRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeControllerRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.CreateNvmeControllerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeControllerRequest build() {
      opi_api.storage.v1.CreateNvmeControllerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.CreateNvmeControllerRequest buildPartial() {
      opi_api.storage.v1.CreateNvmeControllerRequest result = new opi_api.storage.v1.CreateNvmeControllerRequest(this);
      result.parent_ = parent_;
      if (nvmeControllerBuilder_ == null) {
        result.nvmeController_ = nvmeController_;
      } else {
        result.nvmeController_ = nvmeControllerBuilder_.build();
      }
      result.nvmeControllerId_ = nvmeControllerId_;
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
      if (other instanceof opi_api.storage.v1.CreateNvmeControllerRequest) {
        return mergeFrom((opi_api.storage.v1.CreateNvmeControllerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.CreateNvmeControllerRequest other) {
      if (other == opi_api.storage.v1.CreateNvmeControllerRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasNvmeController()) {
        mergeNvmeController(other.getNvmeController());
      }
      if (!other.getNvmeControllerId().isEmpty()) {
        nvmeControllerId_ = other.nvmeControllerId_;
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
      opi_api.storage.v1.CreateNvmeControllerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.CreateNvmeControllerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private opi_api.storage.v1.NvmeController nvmeController_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeController, opi_api.storage.v1.NvmeController.Builder, opi_api.storage.v1.NvmeControllerOrBuilder> nvmeControllerBuilder_;
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the nvmeController field is set.
     */
    public boolean hasNvmeController() {
      return nvmeControllerBuilder_ != null || nvmeController_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The nvmeController.
     */
    public opi_api.storage.v1.NvmeController getNvmeController() {
      if (nvmeControllerBuilder_ == null) {
        return nvmeController_ == null ? opi_api.storage.v1.NvmeController.getDefaultInstance() : nvmeController_;
      } else {
        return nvmeControllerBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmeController(opi_api.storage.v1.NvmeController value) {
      if (nvmeControllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nvmeController_ = value;
        onChanged();
      } else {
        nvmeControllerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNvmeController(
        opi_api.storage.v1.NvmeController.Builder builderForValue) {
      if (nvmeControllerBuilder_ == null) {
        nvmeController_ = builderForValue.build();
        onChanged();
      } else {
        nvmeControllerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNvmeController(opi_api.storage.v1.NvmeController value) {
      if (nvmeControllerBuilder_ == null) {
        if (nvmeController_ != null) {
          nvmeController_ =
            opi_api.storage.v1.NvmeController.newBuilder(nvmeController_).mergeFrom(value).buildPartial();
        } else {
          nvmeController_ = value;
        }
        onChanged();
      } else {
        nvmeControllerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNvmeController() {
      if (nvmeControllerBuilder_ == null) {
        nvmeController_ = null;
        onChanged();
      } else {
        nvmeController_ = null;
        nvmeControllerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmeController.Builder getNvmeControllerBuilder() {
      
      onChanged();
      return getNvmeControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public opi_api.storage.v1.NvmeControllerOrBuilder getNvmeControllerOrBuilder() {
      if (nvmeControllerBuilder_ != null) {
        return nvmeControllerBuilder_.getMessageOrBuilder();
      } else {
        return nvmeController_ == null ?
            opi_api.storage.v1.NvmeController.getDefaultInstance() : nvmeController_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.NvmeController nvme_controller = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.NvmeController, opi_api.storage.v1.NvmeController.Builder, opi_api.storage.v1.NvmeControllerOrBuilder> 
        getNvmeControllerFieldBuilder() {
      if (nvmeControllerBuilder_ == null) {
        nvmeControllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.NvmeController, opi_api.storage.v1.NvmeController.Builder, opi_api.storage.v1.NvmeControllerOrBuilder>(
                getNvmeController(),
                getParentForChildren(),
                isClean());
        nvmeController_ = null;
      }
      return nvmeControllerBuilder_;
    }

    private java.lang.Object nvmeControllerId_ = "";
    /**
     * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The nvmeControllerId.
     */
    public java.lang.String getNvmeControllerId() {
      java.lang.Object ref = nvmeControllerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nvmeControllerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for nvmeControllerId.
     */
    public com.google.protobuf.ByteString
        getNvmeControllerIdBytes() {
      java.lang.Object ref = nvmeControllerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nvmeControllerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The nvmeControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmeControllerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nvmeControllerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearNvmeControllerId() {
      
      nvmeControllerId_ = getDefaultInstance().getNvmeControllerId();
      onChanged();
      return this;
    }
    /**
     * <code>string nvme_controller_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for nvmeControllerId to set.
     * @return This builder for chaining.
     */
    public Builder setNvmeControllerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nvmeControllerId_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.CreateNvmeControllerRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.CreateNvmeControllerRequest)
  private static final opi_api.storage.v1.CreateNvmeControllerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.CreateNvmeControllerRequest();
  }

  public static opi_api.storage.v1.CreateNvmeControllerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNvmeControllerRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateNvmeControllerRequest>() {
    @java.lang.Override
    public CreateNvmeControllerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateNvmeControllerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateNvmeControllerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNvmeControllerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.CreateNvmeControllerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

