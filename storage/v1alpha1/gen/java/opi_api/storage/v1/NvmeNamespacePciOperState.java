// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Namespace PCIe operational states
 * </pre>
 *
 * Protobuf enum {@code opi_api.storage.v1.NvmeNamespacePciOperState}
 */
public enum NvmeNamespacePciOperState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>NVME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED = 0;</code>
   */
  NVME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * namespace is online and operational
   * </pre>
   *
   * <code>NVME_NAMESPACE_PCI_OPER_STATE_ONLINE = 1;</code>
   */
  NVME_NAMESPACE_PCI_OPER_STATE_ONLINE(1),
  /**
   * <pre>
   * namespace is offline
   * </pre>
   *
   * <code>NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE = 2;</code>
   */
  NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>NVME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int NVME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * namespace is online and operational
   * </pre>
   *
   * <code>NVME_NAMESPACE_PCI_OPER_STATE_ONLINE = 1;</code>
   */
  public static final int NVME_NAMESPACE_PCI_OPER_STATE_ONLINE_VALUE = 1;
  /**
   * <pre>
   * namespace is offline
   * </pre>
   *
   * <code>NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE = 2;</code>
   */
  public static final int NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NvmeNamespacePciOperState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NvmeNamespacePciOperState forNumber(int value) {
    switch (value) {
      case 0: return NVME_NAMESPACE_PCI_OPER_STATE_UNSPECIFIED;
      case 1: return NVME_NAMESPACE_PCI_OPER_STATE_ONLINE;
      case 2: return NVME_NAMESPACE_PCI_OPER_STATE_OFFLINE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NvmeNamespacePciOperState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NvmeNamespacePciOperState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NvmeNamespacePciOperState>() {
          public NvmeNamespacePciOperState findValueByNumber(int number) {
            return NvmeNamespacePciOperState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendNvmePcieProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final NvmeNamespacePciOperState[] VALUES = values();

  public static NvmeNamespacePciOperState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NvmeNamespacePciOperState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.storage.v1.NvmeNamespacePciOperState)
}

