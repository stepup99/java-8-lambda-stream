package com.example.demo_java_8_stream_lambda.optional;

import java.util.Optional;

public class OptionalPresentExample {
  public static void main(String[] args) {

    Optional<String> optional = Optional.ofNullable("hello Optional");
    System.out.println("-----------------");
    System.out.println(optional.isPresent());

    optional.ifPresent(s -> System.out.println(s.toUpperCase()));

  }

}
