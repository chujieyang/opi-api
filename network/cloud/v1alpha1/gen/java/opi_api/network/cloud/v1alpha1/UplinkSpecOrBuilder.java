// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interface.proto

package opi_api.network.cloud.v1alpha1;

public interface UplinkSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.UplinkSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * physical port id corresponding to this interface
   * </pre>
   *
   * <code>string port_name_ref = 1;</code>
   * @return The portNameRef.
   */
  java.lang.String getPortNameRef();
  /**
   * <pre>
   * physical port id corresponding to this interface
   * </pre>
   *
   * <code>string port_name_ref = 1;</code>
   * @return The bytes for portNameRef.
   */
  com.google.protobuf.ByteString
      getPortNameRefBytes();

  /**
   * <pre>
   * native vlan-id, untagged rx/tx vlan id
   * </pre>
   *
   * <code>int32 native_vlanid = 2;</code>
   * @return The nativeVlanid.
   */
  int getNativeVlanid();
}
