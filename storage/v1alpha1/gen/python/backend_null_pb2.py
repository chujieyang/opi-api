# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: backend_null.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
import opicommon_pb2 as opicommon__pb2
import uuid_pb2 as uuid__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12\x62\x61\x63kend_null.proto\x12\x12opi_api.storage.v1\x1a\x17google/api/client.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/protobuf/field_mask.proto\x1a\x0fopicommon.proto\x1a\nuuid.proto\"\xf7\x01\n\nNullVolume\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x03\xe0\x41\x05\xfa\x41\x1f\n\x1dopi_api.storage.v1/NullVolume\x12\x17\n\nblock_size\x18\x02 \x01(\x03\x42\x03\xe0\x41\x02\x12\x19\n\x0c\x62locks_count\x18\x03 \x01(\x03\x42\x03\xe0\x41\x02\x12*\n\x04uuid\x18\x04 \x01(\x0b\x32\x17.opi_api.common.v1.UuidB\x03\xe0\x41\x01:Q\xea\x41N\n!storage.opiproject.org/NullVolume\x12\x10volumes/{volume}*\x0bnullVolumes2\nnullVolume\"p\n\x17\x43reateNullVolumeRequest\x12\x38\n\x0bnull_volume\x18\x01 \x01(\x0b\x32\x1e.opi_api.storage.v1.NullVolumeB\x03\xe0\x41\x02\x12\x1b\n\x0enull_volume_id\x18\x02 \x01(\tB\x03\xe0\x41\x01\"j\n\x17\x44\x65leteNullVolumeRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.storage.v1/NullVolume\x12\x1a\n\rallow_missing\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\"\xa5\x01\n\x17UpdateNullVolumeRequest\x12\x38\n\x0bnull_volume\x18\x01 \x01(\x0b\x32\x1e.opi_api.storage.v1.NullVolumeB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12\x1a\n\rallow_missing\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\"\x80\x01\n\x16ListNullVolumesRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.storage.v1/NullVolume\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"h\n\x17ListNullVolumesResponse\x12\x34\n\x0cnull_volumes\x18\x01 \x03(\x0b\x32\x1e.opi_api.storage.v1.NullVolume\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"K\n\x14GetNullVolumeRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.storage.v1/NullVolume\"M\n\x16StatsNullVolumeRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1dopi_api.storage.v1/NullVolume\"I\n\x17StatsNullVolumeResponse\x12.\n\x05stats\x18\x01 \x01(\x0b\x32\x1f.opi_api.storage.v1.VolumeStats2\xa3\x07\n\x11NullVolumeService\x12\x9e\x01\n\x10\x43reateNullVolume\x12+.opi_api.storage.v1.CreateNullVolumeRequest\x1a\x1e.opi_api.storage.v1.NullVolume\"=\x82\xd3\xe4\x93\x02\x1a\"\x0b/v1/volumes:\x0bnull_volume\xda\x41\x1anull_volume,null_volume_id\x12\x80\x01\n\x10\x44\x65leteNullVolume\x12+.opi_api.storage.v1.DeleteNullVolumeRequest\x1a\x16.google.protobuf.Empty\"\'\x82\xd3\xe4\x93\x02\x1a*\x18/v1/{name=NullVolumes/*}\xda\x41\x04name\x12\xb1\x01\n\x10UpdateNullVolume\x12+.opi_api.storage.v1.UpdateNullVolumeRequest\x1a\x1e.opi_api.storage.v1.NullVolume\"P\x82\xd3\xe4\x93\x02\x30\x32!/v1/{null_volume.name=subsystems}:\x0bnull_volume\xda\x41\x17null_volume,update_mask\x12\x94\x01\n\x0fListNullVolumes\x12*.opi_api.storage.v1.ListNullVolumesRequest\x1a+.opi_api.storage.v1.ListNullVolumesResponse\"(\x82\xd3\xe4\x93\x02\x19\x12\x17/v1/{parent=subsystems}\xda\x41\x06parent\x12\x82\x01\n\rGetNullVolume\x12(.opi_api.storage.v1.GetNullVolumeRequest\x1a\x1e.opi_api.storage.v1.NullVolume\"\'\x82\xd3\xe4\x93\x02\x1a\x12\x18/v1/{name=NullVolumes/*}\xda\x41\x04name\x12\x99\x01\n\x0fStatsNullVolume\x12*.opi_api.storage.v1.StatsNullVolumeRequest\x1a+.opi_api.storage.v1.StatsNullVolumeResponse\"-\x82\xd3\xe4\x93\x02 \x12\x1e/v1/{name=NullVolumes/*}:stats\xda\x41\x04nameB_\n\x12opi_api.storage.v1B\x10\x42\x61\x63kendNullProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'backend_null_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\020BackendNullProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _NULLVOLUME.fields_by_name['name']._options = None
  _NULLVOLUME.fields_by_name['name']._serialized_options = b'\340A\003\340A\005\372A\037\n\035opi_api.storage.v1/NullVolume'
  _NULLVOLUME.fields_by_name['block_size']._options = None
  _NULLVOLUME.fields_by_name['block_size']._serialized_options = b'\340A\002'
  _NULLVOLUME.fields_by_name['blocks_count']._options = None
  _NULLVOLUME.fields_by_name['blocks_count']._serialized_options = b'\340A\002'
  _NULLVOLUME.fields_by_name['uuid']._options = None
  _NULLVOLUME.fields_by_name['uuid']._serialized_options = b'\340A\001'
  _NULLVOLUME._options = None
  _NULLVOLUME._serialized_options = b'\352AN\n!storage.opiproject.org/NullVolume\022\020volumes/{volume}*\013nullVolumes2\nnullVolume'
  _CREATENULLVOLUMEREQUEST.fields_by_name['null_volume']._options = None
  _CREATENULLVOLUMEREQUEST.fields_by_name['null_volume']._serialized_options = b'\340A\002'
  _CREATENULLVOLUMEREQUEST.fields_by_name['null_volume_id']._options = None
  _CREATENULLVOLUMEREQUEST.fields_by_name['null_volume_id']._serialized_options = b'\340A\001'
  _DELETENULLVOLUMEREQUEST.fields_by_name['name']._options = None
  _DELETENULLVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035opi_api.storage.v1/NullVolume'
  _DELETENULLVOLUMEREQUEST.fields_by_name['allow_missing']._options = None
  _DELETENULLVOLUMEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _UPDATENULLVOLUMEREQUEST.fields_by_name['null_volume']._options = None
  _UPDATENULLVOLUMEREQUEST.fields_by_name['null_volume']._serialized_options = b'\340A\002'
  _UPDATENULLVOLUMEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATENULLVOLUMEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATENULLVOLUMEREQUEST.fields_by_name['allow_missing']._options = None
  _UPDATENULLVOLUMEREQUEST.fields_by_name['allow_missing']._serialized_options = b'\340A\001'
  _LISTNULLVOLUMESREQUEST.fields_by_name['parent']._options = None
  _LISTNULLVOLUMESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035opi_api.storage.v1/NullVolume'
  _LISTNULLVOLUMESREQUEST.fields_by_name['page_size']._options = None
  _LISTNULLVOLUMESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTNULLVOLUMESREQUEST.fields_by_name['page_token']._options = None
  _LISTNULLVOLUMESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETNULLVOLUMEREQUEST.fields_by_name['name']._options = None
  _GETNULLVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035opi_api.storage.v1/NullVolume'
  _STATSNULLVOLUMEREQUEST.fields_by_name['name']._options = None
  _STATSNULLVOLUMEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035opi_api.storage.v1/NullVolume'
  _NULLVOLUMESERVICE.methods_by_name['CreateNullVolume']._options = None
  _NULLVOLUMESERVICE.methods_by_name['CreateNullVolume']._serialized_options = b'\202\323\344\223\002\032\"\013/v1/volumes:\013null_volume\332A\032null_volume,null_volume_id'
  _NULLVOLUMESERVICE.methods_by_name['DeleteNullVolume']._options = None
  _NULLVOLUMESERVICE.methods_by_name['DeleteNullVolume']._serialized_options = b'\202\323\344\223\002\032*\030/v1/{name=NullVolumes/*}\332A\004name'
  _NULLVOLUMESERVICE.methods_by_name['UpdateNullVolume']._options = None
  _NULLVOLUMESERVICE.methods_by_name['UpdateNullVolume']._serialized_options = b'\202\323\344\223\00202!/v1/{null_volume.name=subsystems}:\013null_volume\332A\027null_volume,update_mask'
  _NULLVOLUMESERVICE.methods_by_name['ListNullVolumes']._options = None
  _NULLVOLUMESERVICE.methods_by_name['ListNullVolumes']._serialized_options = b'\202\323\344\223\002\031\022\027/v1/{parent=subsystems}\332A\006parent'
  _NULLVOLUMESERVICE.methods_by_name['GetNullVolume']._options = None
  _NULLVOLUMESERVICE.methods_by_name['GetNullVolume']._serialized_options = b'\202\323\344\223\002\032\022\030/v1/{name=NullVolumes/*}\332A\004name'
  _NULLVOLUMESERVICE.methods_by_name['StatsNullVolume']._options = None
  _NULLVOLUMESERVICE.methods_by_name['StatsNullVolume']._serialized_options = b'\202\323\344\223\002 \022\036/v1/{name=NullVolumes/*}:stats\332A\004name'
  _NULLVOLUME._serialized_start=250
  _NULLVOLUME._serialized_end=497
  _CREATENULLVOLUMEREQUEST._serialized_start=499
  _CREATENULLVOLUMEREQUEST._serialized_end=611
  _DELETENULLVOLUMEREQUEST._serialized_start=613
  _DELETENULLVOLUMEREQUEST._serialized_end=719
  _UPDATENULLVOLUMEREQUEST._serialized_start=722
  _UPDATENULLVOLUMEREQUEST._serialized_end=887
  _LISTNULLVOLUMESREQUEST._serialized_start=890
  _LISTNULLVOLUMESREQUEST._serialized_end=1018
  _LISTNULLVOLUMESRESPONSE._serialized_start=1020
  _LISTNULLVOLUMESRESPONSE._serialized_end=1124
  _GETNULLVOLUMEREQUEST._serialized_start=1126
  _GETNULLVOLUMEREQUEST._serialized_end=1201
  _STATSNULLVOLUMEREQUEST._serialized_start=1203
  _STATSNULLVOLUMEREQUEST._serialized_end=1280
  _STATSNULLVOLUMERESPONSE._serialized_start=1282
  _STATSNULLVOLUMERESPONSE._serialized_end=1355
  _NULLVOLUMESERVICE._serialized_start=1358
  _NULLVOLUMESERVICE._serialized_end=2289
# @@protoc_insertion_point(module_scope)
