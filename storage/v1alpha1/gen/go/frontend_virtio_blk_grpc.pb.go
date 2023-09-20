// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.6
// source: frontend_virtio_blk.proto

package _go

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// FrontendVirtioBlkServiceClient is the client API for FrontendVirtioBlkService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type FrontendVirtioBlkServiceClient interface {
	// Create an Virtio Blk
	CreateVirtioBlk(ctx context.Context, in *CreateVirtioBlkRequest, opts ...grpc.CallOption) (*VirtioBlk, error)
	// Delete an Virtio Blk
	DeleteVirtioBlk(ctx context.Context, in *DeleteVirtioBlkRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	// Update an Virtio Blk
	UpdateVirtioBlk(ctx context.Context, in *UpdateVirtioBlkRequest, opts ...grpc.CallOption) (*VirtioBlk, error)
	// List Virtio Blks
	ListVirtioBlks(ctx context.Context, in *ListVirtioBlksRequest, opts ...grpc.CallOption) (*ListVirtioBlksResponse, error)
	// Get an Virtio Blk
	GetVirtioBlk(ctx context.Context, in *GetVirtioBlkRequest, opts ...grpc.CallOption) (*VirtioBlk, error)
	// Get an Virtio Blk statistics
	StatsVirtioBlk(ctx context.Context, in *StatsVirtioBlkRequest, opts ...grpc.CallOption) (*StatsVirtioBlkResponse, error)
}

type frontendVirtioBlkServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewFrontendVirtioBlkServiceClient(cc grpc.ClientConnInterface) FrontendVirtioBlkServiceClient {
	return &frontendVirtioBlkServiceClient{cc}
}

func (c *frontendVirtioBlkServiceClient) CreateVirtioBlk(ctx context.Context, in *CreateVirtioBlkRequest, opts ...grpc.CallOption) (*VirtioBlk, error) {
	out := new(VirtioBlk)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendVirtioBlkService/CreateVirtioBlk", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioBlkServiceClient) DeleteVirtioBlk(ctx context.Context, in *DeleteVirtioBlkRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendVirtioBlkService/DeleteVirtioBlk", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioBlkServiceClient) UpdateVirtioBlk(ctx context.Context, in *UpdateVirtioBlkRequest, opts ...grpc.CallOption) (*VirtioBlk, error) {
	out := new(VirtioBlk)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendVirtioBlkService/UpdateVirtioBlk", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioBlkServiceClient) ListVirtioBlks(ctx context.Context, in *ListVirtioBlksRequest, opts ...grpc.CallOption) (*ListVirtioBlksResponse, error) {
	out := new(ListVirtioBlksResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendVirtioBlkService/ListVirtioBlks", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioBlkServiceClient) GetVirtioBlk(ctx context.Context, in *GetVirtioBlkRequest, opts ...grpc.CallOption) (*VirtioBlk, error) {
	out := new(VirtioBlk)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendVirtioBlkService/GetVirtioBlk", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendVirtioBlkServiceClient) StatsVirtioBlk(ctx context.Context, in *StatsVirtioBlkRequest, opts ...grpc.CallOption) (*StatsVirtioBlkResponse, error) {
	out := new(StatsVirtioBlkResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendVirtioBlkService/StatsVirtioBlk", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// FrontendVirtioBlkServiceServer is the server API for FrontendVirtioBlkService service.
// All implementations should embed UnimplementedFrontendVirtioBlkServiceServer
// for forward compatibility
type FrontendVirtioBlkServiceServer interface {
	// Create an Virtio Blk
	CreateVirtioBlk(context.Context, *CreateVirtioBlkRequest) (*VirtioBlk, error)
	// Delete an Virtio Blk
	DeleteVirtioBlk(context.Context, *DeleteVirtioBlkRequest) (*emptypb.Empty, error)
	// Update an Virtio Blk
	UpdateVirtioBlk(context.Context, *UpdateVirtioBlkRequest) (*VirtioBlk, error)
	// List Virtio Blks
	ListVirtioBlks(context.Context, *ListVirtioBlksRequest) (*ListVirtioBlksResponse, error)
	// Get an Virtio Blk
	GetVirtioBlk(context.Context, *GetVirtioBlkRequest) (*VirtioBlk, error)
	// Get an Virtio Blk statistics
	StatsVirtioBlk(context.Context, *StatsVirtioBlkRequest) (*StatsVirtioBlkResponse, error)
}

// UnimplementedFrontendVirtioBlkServiceServer should be embedded to have forward compatible implementations.
type UnimplementedFrontendVirtioBlkServiceServer struct {
}

func (UnimplementedFrontendVirtioBlkServiceServer) CreateVirtioBlk(context.Context, *CreateVirtioBlkRequest) (*VirtioBlk, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateVirtioBlk not implemented")
}
func (UnimplementedFrontendVirtioBlkServiceServer) DeleteVirtioBlk(context.Context, *DeleteVirtioBlkRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteVirtioBlk not implemented")
}
func (UnimplementedFrontendVirtioBlkServiceServer) UpdateVirtioBlk(context.Context, *UpdateVirtioBlkRequest) (*VirtioBlk, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateVirtioBlk not implemented")
}
func (UnimplementedFrontendVirtioBlkServiceServer) ListVirtioBlks(context.Context, *ListVirtioBlksRequest) (*ListVirtioBlksResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListVirtioBlks not implemented")
}
func (UnimplementedFrontendVirtioBlkServiceServer) GetVirtioBlk(context.Context, *GetVirtioBlkRequest) (*VirtioBlk, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetVirtioBlk not implemented")
}
func (UnimplementedFrontendVirtioBlkServiceServer) StatsVirtioBlk(context.Context, *StatsVirtioBlkRequest) (*StatsVirtioBlkResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsVirtioBlk not implemented")
}

// UnsafeFrontendVirtioBlkServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to FrontendVirtioBlkServiceServer will
// result in compilation errors.
type UnsafeFrontendVirtioBlkServiceServer interface {
	mustEmbedUnimplementedFrontendVirtioBlkServiceServer()
}

func RegisterFrontendVirtioBlkServiceServer(s grpc.ServiceRegistrar, srv FrontendVirtioBlkServiceServer) {
	s.RegisterService(&FrontendVirtioBlkService_ServiceDesc, srv)
}

func _FrontendVirtioBlkService_CreateVirtioBlk_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateVirtioBlkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioBlkServiceServer).CreateVirtioBlk(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendVirtioBlkService/CreateVirtioBlk",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioBlkServiceServer).CreateVirtioBlk(ctx, req.(*CreateVirtioBlkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioBlkService_DeleteVirtioBlk_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteVirtioBlkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioBlkServiceServer).DeleteVirtioBlk(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendVirtioBlkService/DeleteVirtioBlk",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioBlkServiceServer).DeleteVirtioBlk(ctx, req.(*DeleteVirtioBlkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioBlkService_UpdateVirtioBlk_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateVirtioBlkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioBlkServiceServer).UpdateVirtioBlk(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendVirtioBlkService/UpdateVirtioBlk",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioBlkServiceServer).UpdateVirtioBlk(ctx, req.(*UpdateVirtioBlkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioBlkService_ListVirtioBlks_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListVirtioBlksRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioBlkServiceServer).ListVirtioBlks(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendVirtioBlkService/ListVirtioBlks",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioBlkServiceServer).ListVirtioBlks(ctx, req.(*ListVirtioBlksRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioBlkService_GetVirtioBlk_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetVirtioBlkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioBlkServiceServer).GetVirtioBlk(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendVirtioBlkService/GetVirtioBlk",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioBlkServiceServer).GetVirtioBlk(ctx, req.(*GetVirtioBlkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendVirtioBlkService_StatsVirtioBlk_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsVirtioBlkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendVirtioBlkServiceServer).StatsVirtioBlk(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendVirtioBlkService/StatsVirtioBlk",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendVirtioBlkServiceServer).StatsVirtioBlk(ctx, req.(*StatsVirtioBlkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// FrontendVirtioBlkService_ServiceDesc is the grpc.ServiceDesc for FrontendVirtioBlkService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var FrontendVirtioBlkService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.storage.v1.FrontendVirtioBlkService",
	HandlerType: (*FrontendVirtioBlkServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateVirtioBlk",
			Handler:    _FrontendVirtioBlkService_CreateVirtioBlk_Handler,
		},
		{
			MethodName: "DeleteVirtioBlk",
			Handler:    _FrontendVirtioBlkService_DeleteVirtioBlk_Handler,
		},
		{
			MethodName: "UpdateVirtioBlk",
			Handler:    _FrontendVirtioBlkService_UpdateVirtioBlk_Handler,
		},
		{
			MethodName: "ListVirtioBlks",
			Handler:    _FrontendVirtioBlkService_ListVirtioBlks_Handler,
		},
		{
			MethodName: "GetVirtioBlk",
			Handler:    _FrontendVirtioBlkService_GetVirtioBlk_Handler,
		},
		{
			MethodName: "StatsVirtioBlk",
			Handler:    _FrontendVirtioBlkService_StatsVirtioBlk_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "frontend_virtio_blk.proto",
}
