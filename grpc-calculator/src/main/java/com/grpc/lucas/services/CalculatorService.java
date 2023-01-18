package com.grpc.lucas.services;

import com.grpc.lucas.domain.APIResponse;
import com.grpc.lucas.domain.NumbersToOperate;
import com.grpc.lucas.domain.calculatorGrpc;
import io.grpc.stub.StreamObserver;

public class CalculatorService extends calculatorGrpc.calculatorImplBase {

    @Override
    public void sum(NumbersToOperate request, StreamObserver<APIResponse> responseObserver) {
        int stNumber = request.getFirstNumber();
        int ndNumber = request.getSecondNumber();
        int sum = stNumber + ndNumber;

        APIResponse.Builder response = APIResponse.newBuilder();
        response.setMessage("success!");
        response.setResult(sum);

        responseObserver.onNext(response.build());
    }

    @Override
    public void difference(NumbersToOperate request, StreamObserver<APIResponse> responseObserver) {
        int stNumber = request.getFirstNumber();
        int ndNumber = request.getSecondNumber();
        int difference = stNumber - ndNumber;

        APIResponse.Builder response = APIResponse.newBuilder();
        response.setMessage("success!");
        response.setResult(difference);

        responseObserver.onNext(response.build());
    }

    @Override
    public void multiplication(NumbersToOperate request, StreamObserver<APIResponse> responseObserver) {
        int stNumber = request.getFirstNumber();
        int ndNumber = request.getSecondNumber();
        int result = stNumber * ndNumber;

        APIResponse.Builder response = APIResponse.newBuilder();
        response.setMessage("success!");
        response.setResult(result);

        responseObserver.onNext(response.build());
    }

    @Override
    public void division(NumbersToOperate request, StreamObserver<APIResponse> responseObserver) {
        int stNumber = request.getFirstNumber();
        int ndNumber = request.getSecondNumber();

        APIResponse.Builder response = APIResponse.newBuilder();

        if (ndNumber == 0) {
            response.setMessage("error! you cannot divide by zero");
            response.setResult(0);
        } else {
            int division = stNumber / ndNumber;
            response.setMessage("success!");
            response.setResult(division);
        }

        responseObserver.onNext(response.build());
    }
}
