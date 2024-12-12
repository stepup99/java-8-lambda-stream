package com.example.demo_java_8_stream_lambda.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

  @Override
  public int multiply(List<Integer> integerList) {
    return integerList.stream()
        .reduce(1, (x, y) -> x * y);
  }

  @Override
  public int size(List<Integer> integerList) {
    // TODO Auto-generated method stub
    System.out.println("inside muliplierImpl ----- ");
    return integerList.size();
  }
}
