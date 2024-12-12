package com.example.demo_java_8_stream_lambda.defaults;

public interface interface2 extends interface1 {
  default void methodB() {
    System.out.println("inside interfcae methodB");
  }

  @Override
  default void methodA() {
    System.out.println("inside method A" + interface2.class);
  }
}
