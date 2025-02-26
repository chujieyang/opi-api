// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * List underlayroute response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse}
 */
public final class ListUnderlayRoutesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse)
    ListUnderlayRoutesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUnderlayRoutesResponse.newBuilder() to construct.
  private ListUnderlayRoutesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUnderlayRoutesResponse() {
    underlayroute_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUnderlayRoutesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListUnderlayRoutesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              underlayroute_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.UnderlayRoute>();
              mutable_bitField0_ |= 0x00000001;
            }
            underlayroute_.add(
                input.readMessage(opi_api.network.cloud.v1alpha1.UnderlayRoute.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        underlayroute_ = java.util.Collections.unmodifiableList(underlayroute_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListUnderlayRoutesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListUnderlayRoutesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.class, opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.Builder.class);
  }

  public static final int UNDERLAYROUTE_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.cloud.v1alpha1.UnderlayRoute> underlayroute_;
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.cloud.v1alpha1.UnderlayRoute> getUnderlayrouteList() {
    return underlayroute_;
  }
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder> 
      getUnderlayrouteOrBuilderList() {
    return underlayroute_;
  }
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  @java.lang.Override
  public int getUnderlayrouteCount() {
    return underlayroute_.size();
  }
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.UnderlayRoute getUnderlayroute(int index) {
    return underlayroute_.get(index);
  }
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder getUnderlayrouteOrBuilder(
      int index) {
    return underlayroute_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < underlayroute_.size(); i++) {
      output.writeMessage(1, underlayroute_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < underlayroute_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, underlayroute_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse other = (opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse) obj;

    if (!getUnderlayrouteList()
        .equals(other.getUnderlayrouteList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getUnderlayrouteCount() > 0) {
      hash = (37 * hash) + UNDERLAYROUTE_FIELD_NUMBER;
      hash = (53 * hash) + getUnderlayrouteList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse prototype) {
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
   * List underlayroute response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse)
      opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListUnderlayRoutesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListUnderlayRoutesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.class, opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.newBuilder()
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
        getUnderlayrouteFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (underlayrouteBuilder_ == null) {
        underlayroute_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        underlayrouteBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListUnderlayRoutesResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse build() {
      opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse buildPartial() {
      opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse result = new opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse(this);
      int from_bitField0_ = bitField0_;
      if (underlayrouteBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          underlayroute_ = java.util.Collections.unmodifiableList(underlayroute_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.underlayroute_ = underlayroute_;
      } else {
        result.underlayroute_ = underlayrouteBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse other) {
      if (other == opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.getDefaultInstance()) return this;
      if (underlayrouteBuilder_ == null) {
        if (!other.underlayroute_.isEmpty()) {
          if (underlayroute_.isEmpty()) {
            underlayroute_ = other.underlayroute_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnderlayrouteIsMutable();
            underlayroute_.addAll(other.underlayroute_);
          }
          onChanged();
        }
      } else {
        if (!other.underlayroute_.isEmpty()) {
          if (underlayrouteBuilder_.isEmpty()) {
            underlayrouteBuilder_.dispose();
            underlayrouteBuilder_ = null;
            underlayroute_ = other.underlayroute_;
            bitField0_ = (bitField0_ & ~0x00000001);
            underlayrouteBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUnderlayrouteFieldBuilder() : null;
          } else {
            underlayrouteBuilder_.addAllMessages(other.underlayroute_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.cloud.v1alpha1.UnderlayRoute> underlayroute_ =
      java.util.Collections.emptyList();
    private void ensureUnderlayrouteIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        underlayroute_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.UnderlayRoute>(underlayroute_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.UnderlayRoute, opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder, opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder> underlayrouteBuilder_;

    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.UnderlayRoute> getUnderlayrouteList() {
      if (underlayrouteBuilder_ == null) {
        return java.util.Collections.unmodifiableList(underlayroute_);
      } else {
        return underlayrouteBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public int getUnderlayrouteCount() {
      if (underlayrouteBuilder_ == null) {
        return underlayroute_.size();
      } else {
        return underlayrouteBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRoute getUnderlayroute(int index) {
      if (underlayrouteBuilder_ == null) {
        return underlayroute_.get(index);
      } else {
        return underlayrouteBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder setUnderlayroute(
        int index, opi_api.network.cloud.v1alpha1.UnderlayRoute value) {
      if (underlayrouteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnderlayrouteIsMutable();
        underlayroute_.set(index, value);
        onChanged();
      } else {
        underlayrouteBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder setUnderlayroute(
        int index, opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder builderForValue) {
      if (underlayrouteBuilder_ == null) {
        ensureUnderlayrouteIsMutable();
        underlayroute_.set(index, builderForValue.build());
        onChanged();
      } else {
        underlayrouteBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder addUnderlayroute(opi_api.network.cloud.v1alpha1.UnderlayRoute value) {
      if (underlayrouteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnderlayrouteIsMutable();
        underlayroute_.add(value);
        onChanged();
      } else {
        underlayrouteBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder addUnderlayroute(
        int index, opi_api.network.cloud.v1alpha1.UnderlayRoute value) {
      if (underlayrouteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUnderlayrouteIsMutable();
        underlayroute_.add(index, value);
        onChanged();
      } else {
        underlayrouteBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder addUnderlayroute(
        opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder builderForValue) {
      if (underlayrouteBuilder_ == null) {
        ensureUnderlayrouteIsMutable();
        underlayroute_.add(builderForValue.build());
        onChanged();
      } else {
        underlayrouteBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder addUnderlayroute(
        int index, opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder builderForValue) {
      if (underlayrouteBuilder_ == null) {
        ensureUnderlayrouteIsMutable();
        underlayroute_.add(index, builderForValue.build());
        onChanged();
      } else {
        underlayrouteBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder addAllUnderlayroute(
        java.lang.Iterable<? extends opi_api.network.cloud.v1alpha1.UnderlayRoute> values) {
      if (underlayrouteBuilder_ == null) {
        ensureUnderlayrouteIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, underlayroute_);
        onChanged();
      } else {
        underlayrouteBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder clearUnderlayroute() {
      if (underlayrouteBuilder_ == null) {
        underlayroute_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        underlayrouteBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public Builder removeUnderlayroute(int index) {
      if (underlayrouteBuilder_ == null) {
        ensureUnderlayrouteIsMutable();
        underlayroute_.remove(index);
        onChanged();
      } else {
        underlayrouteBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder getUnderlayrouteBuilder(
        int index) {
      return getUnderlayrouteFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder getUnderlayrouteOrBuilder(
        int index) {
      if (underlayrouteBuilder_ == null) {
        return underlayroute_.get(index);  } else {
        return underlayrouteBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public java.util.List<? extends opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder> 
         getUnderlayrouteOrBuilderList() {
      if (underlayrouteBuilder_ != null) {
        return underlayrouteBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(underlayroute_);
      }
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder addUnderlayrouteBuilder() {
      return getUnderlayrouteFieldBuilder().addBuilder(
          opi_api.network.cloud.v1alpha1.UnderlayRoute.getDefaultInstance());
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder addUnderlayrouteBuilder(
        int index) {
      return getUnderlayrouteFieldBuilder().addBuilder(
          index, opi_api.network.cloud.v1alpha1.UnderlayRoute.getDefaultInstance());
    }
    /**
     * <pre>
     * list of underlayroutes
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder> 
         getUnderlayrouteBuilderList() {
      return getUnderlayrouteFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.UnderlayRoute, opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder, opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder> 
        getUnderlayrouteFieldBuilder() {
      if (underlayrouteBuilder_ == null) {
        underlayrouteBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.UnderlayRoute, opi_api.network.cloud.v1alpha1.UnderlayRoute.Builder, opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder>(
                underlayroute_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        underlayroute_ = null;
      }
      return underlayrouteBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse)
  private static final opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse();
  }

  public static opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUnderlayRoutesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListUnderlayRoutesResponse>() {
    @java.lang.Override
    public ListUnderlayRoutesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListUnderlayRoutesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListUnderlayRoutesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUnderlayRoutesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

