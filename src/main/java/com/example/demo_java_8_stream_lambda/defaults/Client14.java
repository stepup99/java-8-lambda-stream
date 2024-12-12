package com.example.demo_java_8_stream_lambda.defaults;

public class Client14 implements interface1, interface4 {

  @Override
  public void methodA() {
    System.out.println("Iinside method A ----- " + Client14.class);
  }

  public static void main(String[] args) {
    Client14 client14 = new Client14();
    client14.methodA();
  }
}
