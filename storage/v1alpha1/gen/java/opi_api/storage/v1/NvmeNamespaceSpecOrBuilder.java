// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeNamespaceSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeNamespaceSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * NSID present to the host by the Nvme PCIe controller.
   * If not provided, then the controller will assign an unused NSID
   * within the max namespace range - auto assigned nsid may not work
   * for live migration
   * </pre>
   *
   * <code>int32 host_nsid = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The hostNsid.
   */
  int getHostNsid();

  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nguid.
   */
  java.lang.String getNguid();
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nguid.
   */
  com.google.protobuf.ByteString
      getNguidBytes();

  /**
   * <pre>
   * 64bit Extended unique identifier for the namespace
   * mandatory if guid is not specified
   * </pre>
   *
   * <code>int64 eui64 = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The eui64.
   */
  long getEui64();

  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the uuid field is set.
   */
  boolean hasUuid();
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The uuid.
   */
  opi_api.common.v1.Uuid getUuid();
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  opi_api.common.v1.UuidOrBuilder getUuidOrBuilder();

  /**
   * <pre>
   * The back/middle-end volume to back this namespace.
   * </pre>
   *
   * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The volumeNameRef.
   */
  java.lang.String getVolumeNameRef();
  /**
   * <pre>
   * The back/middle-end volume to back this namespace.
   * </pre>
   *
   * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for volumeNameRef.
   */
  com.google.protobuf.ByteString
      getVolumeNameRefBytes();
}
