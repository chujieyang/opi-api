# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: inventory.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0finventory.proto\x12\x14opi_api.inventory.v1\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\"9\n\x08\x42IOSInfo\x12\x0e\n\x06vendor\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\x0c\n\x04\x64\x61te\x18\x03 \x01(\t\"}\n\nSystemInfo\x12\x0e\n\x06\x66\x61mily\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x0e\n\x06vendor\x18\x03 \x01(\t\x12\x15\n\rserial_number\x18\x04 \x01(\t\x12\x0c\n\x04uuid\x18\x05 \x01(\t\x12\x0b\n\x03sku\x18\x06 \x01(\t\x12\x0f\n\x07version\x18\x07 \x01(\t\"\x80\x01\n\x0b\x43hassisInfo\x12\x11\n\tasset_tag\x18\x01 \x01(\t\x12\x15\n\rserial_number\x18\x02 \x01(\t\x12\x0c\n\x04type\x18\x03 \x01(\t\x12\x18\n\x10type_description\x18\x04 \x01(\t\x12\x0e\n\x06vendor\x18\x05 \x01(\t\x12\x0f\n\x07version\x18\x06 \x01(\t\"k\n\rBaseboardInfo\x12\x11\n\tasset_tag\x18\x01 \x01(\t\x12\x15\n\rserial_number\x18\x02 \x01(\t\x12\x0e\n\x06vendor\x18\x03 \x01(\t\x12\x0f\n\x07version\x18\x04 \x01(\t\x12\x0f\n\x07product\x18\x05 \x01(\t\"5\n\x07\x43PUInfo\x12\x13\n\x0btotal_cores\x18\x01 \x01(\x05\x12\x15\n\rtotal_threads\x18\x02 \x01(\x05\"F\n\nMemoryInfo\x12\x1c\n\x14total_physical_bytes\x18\x01 \x01(\x03\x12\x1a\n\x12total_usable_bytes\x18\x02 \x01(\x03\"\x98\x01\n\x0ePCIeDeviceInfo\x12\x0e\n\x06\x64river\x18\x01 \x01(\t\x12\x0f\n\x07\x61\x64\x64ress\x18\x02 \x01(\t\x12\x0e\n\x06vendor\x18\x03 \x01(\t\x12\x0f\n\x07product\x18\x04 \x01(\t\x12\x10\n\x08revision\x18\x05 \x01(\t\x12\x11\n\tsubsystem\x18\x06 \x01(\t\x12\r\n\x05\x63lass\x18\x07 \x01(\t\x12\x10\n\x08subclass\x18\x08 \x01(\t\"H\n\x13GetInventoryRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1bopi_api.common.v1/Inventory\"\xee\x02\n\tInventory\x12,\n\x04\x62ios\x18\x01 \x01(\x0b\x32\x1e.opi_api.inventory.v1.BIOSInfo\x12\x30\n\x06system\x18\x02 \x01(\x0b\x32 .opi_api.inventory.v1.SystemInfo\x12\x36\n\tbaseboard\x18\x03 \x01(\x0b\x32#.opi_api.inventory.v1.BaseboardInfo\x12\x32\n\x07\x63hassis\x18\x04 \x01(\x0b\x32!.opi_api.inventory.v1.ChassisInfo\x12\x30\n\tprocessor\x18\x05 \x01(\x0b\x32\x1d.opi_api.inventory.v1.CPUInfo\x12\x30\n\x06memory\x18\x06 \x01(\x0b\x32 .opi_api.inventory.v1.MemoryInfo\x12\x31\n\x03pci\x18\x07 \x03(\x0b\x32$.opi_api.inventory.v1.PCIeDeviceInfo2\x9e\x01\n\x0cInventorySvc\x12\x8d\x01\n\x0cGetInventory\x12).opi_api.inventory.v1.GetInventoryRequest\x1a\x1f.opi_api.inventory.v1.Inventory\"1\x82\xd3\xe4\x93\x02$\x12\"/v1/{name=inventory/*/inventory/*}\xda\x41\x04nameBX\n\x14opi_api.inventory.v1B\x0eInventoryProtoP\x01Z.github.com/opiproject/opi-api/common/v1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'inventory_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024opi_api.inventory.v1B\016InventoryProtoP\001Z.github.com/opiproject/opi-api/common/v1/gen/go'
  _GETINVENTORYREQUEST.fields_by_name['name']._options = None
  _GETINVENTORYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033opi_api.common.v1/Inventory'
  _INVENTORYSVC.methods_by_name['GetInventory']._options = None
  _INVENTORYSVC.methods_by_name['GetInventory']._serialized_options = b'\202\323\344\223\002$\022\"/v1/{name=inventory/*/inventory/*}\332A\004name'
  _BIOSINFO._serialized_start=156
  _BIOSINFO._serialized_end=213
  _SYSTEMINFO._serialized_start=215
  _SYSTEMINFO._serialized_end=340
  _CHASSISINFO._serialized_start=343
  _CHASSISINFO._serialized_end=471
  _BASEBOARDINFO._serialized_start=473
  _BASEBOARDINFO._serialized_end=580
  _CPUINFO._serialized_start=582
  _CPUINFO._serialized_end=635
  _MEMORYINFO._serialized_start=637
  _MEMORYINFO._serialized_end=707
  _PCIEDEVICEINFO._serialized_start=710
  _PCIEDEVICEINFO._serialized_end=862
  _GETINVENTORYREQUEST._serialized_start=864
  _GETINVENTORYREQUEST._serialized_end=936
  _INVENTORY._serialized_start=939
  _INVENTORY._serialized_end=1305
  _INVENTORYSVC._serialized_start=1308
  _INVENTORYSVC._serialized_end=1466
# @@protoc_insertion_point(module_scope)
