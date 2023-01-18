package com.grpc.lucas.domain;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: calculator.proto")
public final class calculatorGrpc {

  private calculatorGrpc() {}

  public static final String SERVICE_NAME = "calculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = com.grpc.lucas.domain.NumbersToOperate.class,
      responseType = com.grpc.lucas.domain.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse> getSumMethod;
    if ((getSumMethod = calculatorGrpc.getSumMethod) == null) {
      synchronized (calculatorGrpc.class) {
        if ((getSumMethod = calculatorGrpc.getSumMethod) == null) {
          calculatorGrpc.getSumMethod = getSumMethod = 
              io.grpc.MethodDescriptor.<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator", "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.NumbersToOperate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new calculatorMethodDescriptorSupplier("sum"))
                  .build();
          }
        }
     }
     return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getDifferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "difference",
      requestType = com.grpc.lucas.domain.NumbersToOperate.class,
      responseType = com.grpc.lucas.domain.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getDifferenceMethod() {
    io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse> getDifferenceMethod;
    if ((getDifferenceMethod = calculatorGrpc.getDifferenceMethod) == null) {
      synchronized (calculatorGrpc.class) {
        if ((getDifferenceMethod = calculatorGrpc.getDifferenceMethod) == null) {
          calculatorGrpc.getDifferenceMethod = getDifferenceMethod = 
              io.grpc.MethodDescriptor.<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator", "difference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.NumbersToOperate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new calculatorMethodDescriptorSupplier("difference"))
                  .build();
          }
        }
     }
     return getDifferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getMultiplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiplication",
      requestType = com.grpc.lucas.domain.NumbersToOperate.class,
      responseType = com.grpc.lucas.domain.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getMultiplicationMethod() {
    io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse> getMultiplicationMethod;
    if ((getMultiplicationMethod = calculatorGrpc.getMultiplicationMethod) == null) {
      synchronized (calculatorGrpc.class) {
        if ((getMultiplicationMethod = calculatorGrpc.getMultiplicationMethod) == null) {
          calculatorGrpc.getMultiplicationMethod = getMultiplicationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator", "multiplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.NumbersToOperate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new calculatorMethodDescriptorSupplier("multiplication"))
                  .build();
          }
        }
     }
     return getMultiplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getDivisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "division",
      requestType = com.grpc.lucas.domain.NumbersToOperate.class,
      responseType = com.grpc.lucas.domain.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate,
      com.grpc.lucas.domain.APIResponse> getDivisionMethod() {
    io.grpc.MethodDescriptor<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse> getDivisionMethod;
    if ((getDivisionMethod = calculatorGrpc.getDivisionMethod) == null) {
      synchronized (calculatorGrpc.class) {
        if ((getDivisionMethod = calculatorGrpc.getDivisionMethod) == null) {
          calculatorGrpc.getDivisionMethod = getDivisionMethod = 
              io.grpc.MethodDescriptor.<com.grpc.lucas.domain.NumbersToOperate, com.grpc.lucas.domain.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator", "division"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.NumbersToOperate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.lucas.domain.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new calculatorMethodDescriptorSupplier("division"))
                  .build();
          }
        }
     }
     return getDivisionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static calculatorStub newStub(io.grpc.Channel channel) {
    return new calculatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static calculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new calculatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static calculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new calculatorFutureStub(channel);
  }

  /**
   */
  public static abstract class calculatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void difference(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDifferenceMethod(), responseObserver);
    }

    /**
     */
    public void multiplication(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiplicationMethod(), responseObserver);
    }

    /**
     */
    public void division(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDivisionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.lucas.domain.NumbersToOperate,
                com.grpc.lucas.domain.APIResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getDifferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.lucas.domain.NumbersToOperate,
                com.grpc.lucas.domain.APIResponse>(
                  this, METHODID_DIFFERENCE)))
          .addMethod(
            getMultiplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.lucas.domain.NumbersToOperate,
                com.grpc.lucas.domain.APIResponse>(
                  this, METHODID_MULTIPLICATION)))
          .addMethod(
            getDivisionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.lucas.domain.NumbersToOperate,
                com.grpc.lucas.domain.APIResponse>(
                  this, METHODID_DIVISION)))
          .build();
    }
  }

  /**
   */
  public static final class calculatorStub extends io.grpc.stub.AbstractStub<calculatorStub> {
    private calculatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calculatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calculatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calculatorStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void difference(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDifferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiplication(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void division(com.grpc.lucas.domain.NumbersToOperate request,
        io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDivisionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class calculatorBlockingStub extends io.grpc.stub.AbstractStub<calculatorBlockingStub> {
    private calculatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calculatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calculatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.lucas.domain.APIResponse sum(com.grpc.lucas.domain.NumbersToOperate request) {
      return blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.lucas.domain.APIResponse difference(com.grpc.lucas.domain.NumbersToOperate request) {
      return blockingUnaryCall(
          getChannel(), getDifferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.lucas.domain.APIResponse multiplication(com.grpc.lucas.domain.NumbersToOperate request) {
      return blockingUnaryCall(
          getChannel(), getMultiplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.lucas.domain.APIResponse division(com.grpc.lucas.domain.NumbersToOperate request) {
      return blockingUnaryCall(
          getChannel(), getDivisionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class calculatorFutureStub extends io.grpc.stub.AbstractStub<calculatorFutureStub> {
    private calculatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private calculatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected calculatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new calculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.lucas.domain.APIResponse> sum(
        com.grpc.lucas.domain.NumbersToOperate request) {
      return futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.lucas.domain.APIResponse> difference(
        com.grpc.lucas.domain.NumbersToOperate request) {
      return futureUnaryCall(
          getChannel().newCall(getDifferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.lucas.domain.APIResponse> multiplication(
        com.grpc.lucas.domain.NumbersToOperate request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.lucas.domain.APIResponse> division(
        com.grpc.lucas.domain.NumbersToOperate request) {
      return futureUnaryCall(
          getChannel().newCall(getDivisionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_DIFFERENCE = 1;
  private static final int METHODID_MULTIPLICATION = 2;
  private static final int METHODID_DIVISION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final calculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(calculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.grpc.lucas.domain.NumbersToOperate) request,
              (io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse>) responseObserver);
          break;
        case METHODID_DIFFERENCE:
          serviceImpl.difference((com.grpc.lucas.domain.NumbersToOperate) request,
              (io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse>) responseObserver);
          break;
        case METHODID_MULTIPLICATION:
          serviceImpl.multiplication((com.grpc.lucas.domain.NumbersToOperate) request,
              (io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse>) responseObserver);
          break;
        case METHODID_DIVISION:
          serviceImpl.division((com.grpc.lucas.domain.NumbersToOperate) request,
              (io.grpc.stub.StreamObserver<com.grpc.lucas.domain.APIResponse>) responseObserver);
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

  private static abstract class calculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    calculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.lucas.domain.CalculatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("calculator");
    }
  }

  private static final class calculatorFileDescriptorSupplier
      extends calculatorBaseDescriptorSupplier {
    calculatorFileDescriptorSupplier() {}
  }

  private static final class calculatorMethodDescriptorSupplier
      extends calculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    calculatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (calculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new calculatorFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getDifferenceMethod())
              .addMethod(getMultiplicationMethod())
              .addMethod(getDivisionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
