package com.example.demo_java_8_stream_lambda.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

  public static Optional<String> ofNullable() {
    Optional<String> stringOptional = Optional.ofNullable(null);
    return stringOptional;
  }

  public static Optional<String> of() {
    Optional<String> stringOptional = Optional.of("hello");
    return stringOptional;
  }

  public static Optional<String> empty() {
    return Optional.empty();
  }

  public static void main(String[] args) {
    // System.out.println("lllllllllllll ------------ " + ofNullable().get());
    // if (ofNullable().isPresent()) {
    // System.out.println("--------- lll " + ofNullable().get());
    // } else {
    // System.out.println(" not found ---------- " + ofNullable());
    // }
    System.out.println("----------------");
    System.out.println("OfNullable" + ofNullable());
    System.out.println("of " + of());
    System.out.println("empty " + empty());
  }
}
