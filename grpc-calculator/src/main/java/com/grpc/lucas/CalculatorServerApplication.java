package com.grpc.lucas;

import com.grpc.lucas.services.CalculatorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;
public class CalculatorServerApplication {

    private static final Logger logger = Logger
            .getLogger(CalculatorServerApplication.class.getName());

    public static void main(String args[]) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9090)
                .addService(new CalculatorService()).build();

        server.start();

        logger.info("Serve started on " + server.getPort());

        server.awaitTermination();

    }

}
