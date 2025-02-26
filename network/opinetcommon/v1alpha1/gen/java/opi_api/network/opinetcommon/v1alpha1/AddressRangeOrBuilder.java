// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

public interface AddressRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.opinetcommon.v1alpha1.AddressRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IPv4 address range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPRange ipv4_range = 1;</code>
   * @return Whether the ipv4Range field is set.
   */
  boolean hasIpv4Range();
  /**
   * <pre>
   * IPv4 address range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPRange ipv4_range = 1;</code>
   * @return The ipv4Range.
   */
  opi_api.network.opinetcommon.v1alpha1.IPRange getIpv4Range();
  /**
   * <pre>
   * IPv4 address range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPRange ipv4_range = 1;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPRangeOrBuilder getIpv4RangeOrBuilder();

  /**
   * <pre>
   * IPv6 address range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPRange ipv6_range = 2;</code>
   * @return Whether the ipv6Range field is set.
   */
  boolean hasIpv6Range();
  /**
   * <pre>
   * IPv6 address range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPRange ipv6_range = 2;</code>
   * @return The ipv6Range.
   */
  opi_api.network.opinetcommon.v1alpha1.IPRange getIpv6Range();
  /**
   * <pre>
   * IPv6 address range
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPRange ipv6_range = 2;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPRangeOrBuilder getIpv6RangeOrBuilder();

  public opi_api.network.opinetcommon.v1alpha1.AddressRange.RangeCase getRangeCase();
}
