package streaming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: single-movie.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SingleMovieGrpc {

  private SingleMovieGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Streaming.SingleMovie";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetTitleRequest,
      streaming.SingleMovieOuterClass.GetTitleReply> getGetTitleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTitle",
      requestType = streaming.SingleMovieOuterClass.GetTitleRequest.class,
      responseType = streaming.SingleMovieOuterClass.GetTitleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetTitleRequest,
      streaming.SingleMovieOuterClass.GetTitleReply> getGetTitleMethod() {
    io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetTitleRequest, streaming.SingleMovieOuterClass.GetTitleReply> getGetTitleMethod;
    if ((getGetTitleMethod = SingleMovieGrpc.getGetTitleMethod) == null) {
      synchronized (SingleMovieGrpc.class) {
        if ((getGetTitleMethod = SingleMovieGrpc.getGetTitleMethod) == null) {
          SingleMovieGrpc.getGetTitleMethod = getGetTitleMethod =
              io.grpc.MethodDescriptor.<streaming.SingleMovieOuterClass.GetTitleRequest, streaming.SingleMovieOuterClass.GetTitleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTitle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.SingleMovieOuterClass.GetTitleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.SingleMovieOuterClass.GetTitleReply.getDefaultInstance()))
              .setSchemaDescriptor(new SingleMovieMethodDescriptorSupplier("GetTitle"))
              .build();
        }
      }
    }
    return getGetTitleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetLengthRequest,
      streaming.SingleMovieOuterClass.GetLengthReply> getGetLengthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLength",
      requestType = streaming.SingleMovieOuterClass.GetLengthRequest.class,
      responseType = streaming.SingleMovieOuterClass.GetLengthReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetLengthRequest,
      streaming.SingleMovieOuterClass.GetLengthReply> getGetLengthMethod() {
    io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetLengthRequest, streaming.SingleMovieOuterClass.GetLengthReply> getGetLengthMethod;
    if ((getGetLengthMethod = SingleMovieGrpc.getGetLengthMethod) == null) {
      synchronized (SingleMovieGrpc.class) {
        if ((getGetLengthMethod = SingleMovieGrpc.getGetLengthMethod) == null) {
          SingleMovieGrpc.getGetLengthMethod = getGetLengthMethod =
              io.grpc.MethodDescriptor.<streaming.SingleMovieOuterClass.GetLengthRequest, streaming.SingleMovieOuterClass.GetLengthReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLength"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.SingleMovieOuterClass.GetLengthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.SingleMovieOuterClass.GetLengthReply.getDefaultInstance()))
              .setSchemaDescriptor(new SingleMovieMethodDescriptorSupplier("GetLength"))
              .build();
        }
      }
    }
    return getGetLengthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetFramesRequest,
      streaming.SingleMovieOuterClass.GetFramesReply> getGetFramesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFrames",
      requestType = streaming.SingleMovieOuterClass.GetFramesRequest.class,
      responseType = streaming.SingleMovieOuterClass.GetFramesReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetFramesRequest,
      streaming.SingleMovieOuterClass.GetFramesReply> getGetFramesMethod() {
    io.grpc.MethodDescriptor<streaming.SingleMovieOuterClass.GetFramesRequest, streaming.SingleMovieOuterClass.GetFramesReply> getGetFramesMethod;
    if ((getGetFramesMethod = SingleMovieGrpc.getGetFramesMethod) == null) {
      synchronized (SingleMovieGrpc.class) {
        if ((getGetFramesMethod = SingleMovieGrpc.getGetFramesMethod) == null) {
          SingleMovieGrpc.getGetFramesMethod = getGetFramesMethod =
              io.grpc.MethodDescriptor.<streaming.SingleMovieOuterClass.GetFramesRequest, streaming.SingleMovieOuterClass.GetFramesReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFrames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.SingleMovieOuterClass.GetFramesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  streaming.SingleMovieOuterClass.GetFramesReply.getDefaultInstance()))
              .setSchemaDescriptor(new SingleMovieMethodDescriptorSupplier("GetFrames"))
              .build();
        }
      }
    }
    return getGetFramesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SingleMovieStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SingleMovieStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SingleMovieStub>() {
        @java.lang.Override
        public SingleMovieStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SingleMovieStub(channel, callOptions);
        }
      };
    return SingleMovieStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SingleMovieBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SingleMovieBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SingleMovieBlockingStub>() {
        @java.lang.Override
        public SingleMovieBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SingleMovieBlockingStub(channel, callOptions);
        }
      };
    return SingleMovieBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SingleMovieFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SingleMovieFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SingleMovieFutureStub>() {
        @java.lang.Override
        public SingleMovieFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SingleMovieFutureStub(channel, callOptions);
        }
      };
    return SingleMovieFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTitle(streaming.SingleMovieOuterClass.GetTitleRequest request,
        io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetTitleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTitleMethod(), responseObserver);
    }

    /**
     */
    default void getLength(streaming.SingleMovieOuterClass.GetLengthRequest request,
        io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetLengthReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLengthMethod(), responseObserver);
    }

    /**
     */
    default void getFrames(streaming.SingleMovieOuterClass.GetFramesRequest request,
        io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetFramesReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFramesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SingleMovie.
   */
  public static abstract class SingleMovieImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SingleMovieGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SingleMovie.
   */
  public static final class SingleMovieStub
      extends io.grpc.stub.AbstractAsyncStub<SingleMovieStub> {
    private SingleMovieStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SingleMovieStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SingleMovieStub(channel, callOptions);
    }

    /**
     */
    public void getTitle(streaming.SingleMovieOuterClass.GetTitleRequest request,
        io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetTitleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTitleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLength(streaming.SingleMovieOuterClass.GetLengthRequest request,
        io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetLengthReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLengthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFrames(streaming.SingleMovieOuterClass.GetFramesRequest request,
        io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetFramesReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFramesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SingleMovie.
   */
  public static final class SingleMovieBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SingleMovieBlockingStub> {
    private SingleMovieBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SingleMovieBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SingleMovieBlockingStub(channel, callOptions);
    }

    /**
     */
    public streaming.SingleMovieOuterClass.GetTitleReply getTitle(streaming.SingleMovieOuterClass.GetTitleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTitleMethod(), getCallOptions(), request);
    }

    /**
     */
    public streaming.SingleMovieOuterClass.GetLengthReply getLength(streaming.SingleMovieOuterClass.GetLengthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLengthMethod(), getCallOptions(), request);
    }

    /**
     */
    public streaming.SingleMovieOuterClass.GetFramesReply getFrames(streaming.SingleMovieOuterClass.GetFramesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFramesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SingleMovie.
   */
  public static final class SingleMovieFutureStub
      extends io.grpc.stub.AbstractFutureStub<SingleMovieFutureStub> {
    private SingleMovieFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SingleMovieFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SingleMovieFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<streaming.SingleMovieOuterClass.GetTitleReply> getTitle(
        streaming.SingleMovieOuterClass.GetTitleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTitleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<streaming.SingleMovieOuterClass.GetLengthReply> getLength(
        streaming.SingleMovieOuterClass.GetLengthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLengthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<streaming.SingleMovieOuterClass.GetFramesReply> getFrames(
        streaming.SingleMovieOuterClass.GetFramesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFramesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TITLE = 0;
  private static final int METHODID_GET_LENGTH = 1;
  private static final int METHODID_GET_FRAMES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TITLE:
          serviceImpl.getTitle((streaming.SingleMovieOuterClass.GetTitleRequest) request,
              (io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetTitleReply>) responseObserver);
          break;
        case METHODID_GET_LENGTH:
          serviceImpl.getLength((streaming.SingleMovieOuterClass.GetLengthRequest) request,
              (io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetLengthReply>) responseObserver);
          break;
        case METHODID_GET_FRAMES:
          serviceImpl.getFrames((streaming.SingleMovieOuterClass.GetFramesRequest) request,
              (io.grpc.stub.StreamObserver<streaming.SingleMovieOuterClass.GetFramesReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTitleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              streaming.SingleMovieOuterClass.GetTitleRequest,
              streaming.SingleMovieOuterClass.GetTitleReply>(
                service, METHODID_GET_TITLE)))
        .addMethod(
          getGetLengthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              streaming.SingleMovieOuterClass.GetLengthRequest,
              streaming.SingleMovieOuterClass.GetLengthReply>(
                service, METHODID_GET_LENGTH)))
        .addMethod(
          getGetFramesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              streaming.SingleMovieOuterClass.GetFramesRequest,
              streaming.SingleMovieOuterClass.GetFramesReply>(
                service, METHODID_GET_FRAMES)))
        .build();
  }

  private static abstract class SingleMovieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SingleMovieBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return streaming.SingleMovieOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SingleMovie");
    }
  }

  private static final class SingleMovieFileDescriptorSupplier
      extends SingleMovieBaseDescriptorSupplier {
    SingleMovieFileDescriptorSupplier() {}
  }

  private static final class SingleMovieMethodDescriptorSupplier
      extends SingleMovieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SingleMovieMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SingleMovieGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SingleMovieFileDescriptorSupplier())
              .addMethod(getGetTitleMethod())
              .addMethod(getGetLengthMethod())
              .addMethod(getGetFramesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
