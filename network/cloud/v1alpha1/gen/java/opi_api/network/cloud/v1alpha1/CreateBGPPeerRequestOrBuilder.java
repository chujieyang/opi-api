// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface CreateBGPPeerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * parent
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * bgppeer
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the bgppeer field is set.
   */
  boolean hasBgppeer();
  /**
   * <pre>
   * bgppeer
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bgppeer.
   */
  opi_api.network.cloud.v1alpha1.BGPPeer getBgppeer();
  /**
   * <pre>
   * bgppeer
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeer bgppeer = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.cloud.v1alpha1.BGPPeerOrBuilder getBgppeerOrBuilder();

  /**
   * <pre>
   * bgppeer_id
   * </pre>
   *
   * <code>string bgppeer_id = 3;</code>
   * @return The bgppeerId.
   */
  java.lang.String getBgppeerId();
  /**
   * <pre>
   * bgppeer_id
   * </pre>
   *
   * <code>string bgppeer_id = 3;</code>
   * @return The bytes for bgppeerId.
   */
  com.google.protobuf.ByteString
      getBgppeerIdBytes();
}
