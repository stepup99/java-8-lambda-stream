package com.example.demo_java_8_stream_lambda.defaults;

public interface interface1 {
  default void methodA() {
    System.out.println("Inside method A--------" + interface1.class);
  }
}
