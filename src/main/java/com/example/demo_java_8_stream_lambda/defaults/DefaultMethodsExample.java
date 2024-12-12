package com.example.demo_java_8_stream_lambda.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {
  public static void main(String[] args) {
    /*
     * Sort the list name in alphabetical order
     * 
     * 
     */

    List<String> stringList = Arrays.asList("Adam", "Jenny", "Pooja", "Demo");

    /*
     * 
     * 
     * Java 8
     * 
     * 
     * 
     */

    stringList.sort(Comparator.reverseOrder());
    System.out.println("stringList --------- " + stringList);

  }
}
