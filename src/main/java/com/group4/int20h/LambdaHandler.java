package com.group4.int20h;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.internal.LambdaContainerHandler;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
import com.amazonaws.serverless.proxy.spring.SpringBootProxyHandlerBuilder;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.time.Instant;

public class LambdaHandler implements RequestStreamHandler {
  private static SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;


  static {
    try {
//       For applications that take longer than 10 seconds to start, use the async builder:
      long startTime = Instant.now().toEpochMilli();
      LambdaContainerHandler.getContainerConfig().setDefaultContentCharset(StandardCharsets.UTF_8.name());
      handler = new SpringBootProxyHandlerBuilder()
          .defaultProxy()
          .asyncInit(startTime)
          .springBootApplication(Int20hApplication.class)
          .buildAndInitialize();

    } catch (ContainerInitializationException e) {
      // if we fail here. We re-throw the exception to force another cold start
      e.printStackTrace();
      throw new RuntimeException("Could not initialize Spring Boot application", e);
    }
  }

  @Override
  public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
      throws IOException {
    handler.proxyStream(inputStream, outputStream, context);
  }
}