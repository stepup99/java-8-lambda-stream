package com.example.demo_java_8_stream_lambda.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
  public static void main(String[] args) {
    Multiplier multiplier = new MultiplierImpl();
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
    System.out.println("Result is " + multiplier.multiply(integerList));
    System.out.println("Result is size -------- " + multiplier.size(integerList));
    System.out.println("Result is Empty " + Multiplier.isEmpty(integerList));
  }
}
