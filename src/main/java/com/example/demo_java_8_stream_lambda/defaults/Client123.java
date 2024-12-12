package com.example.demo_java_8_stream_lambda.defaults;

public class Client123 implements interface1, interface2, interface3 {

  @Override
  public void methodA() {
    System.out.println("inside method A" + Client123.class);
  }

  // 1 -> class the implements the inerface
  // 2 -> the sub interface that extends the interfce

  public static void main(String[] args) {
    Client123 client123 = new Client123();
    client123.methodA();
    client123.methodB();
    client123.methodC();
  }
}
