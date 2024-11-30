package com.example.demo_java_8_stream_lambda.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing {

    public  static List<Integer> boxing(){
        // primitive to wrapper
        return  IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());

    }

    public static int unBoxing(List<Integer> integerList){
        // wrapper to primitives
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing : "+boxing());
        System.out.println("UnBoxing : "+unBoxing(boxing()));
    }
}
