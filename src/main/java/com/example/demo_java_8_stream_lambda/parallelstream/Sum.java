package com.example.demo_java_8_stream_lambda.parallelstream;

public class Sum {
  private int total;

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public void performSum(int input) {
    total += input;
  }

}
