package com.example.demo_java_8_stream_lambda.parallelstream;

import java.util.stream.IntStream;

public class SumClient {
  public static void main(String[] args) {
    System.out.println("-------------");
    Sum sum = new Sum();
    IntStream.rangeClosed(1, 1000)
        .parallel()
        .forEach(sum::performSum);

    // 495243
    // 497819
    System.out.println(sum.getTotal());
  }
}
