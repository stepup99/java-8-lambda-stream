package com.example.demo_java_8_stream_lambda.defaults;

public interface interface3 extends interface2 {
  default void methodC() {
    System.out.println("inside Method C");
  }

  @Override
  default void methodB() {
    System.out.println("inside Method B" + interface3.class);
  }
}
