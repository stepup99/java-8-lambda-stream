package com.example.demo_java_8_stream_lambda.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("sum -------- "+sum);


        System.out.println("max --------- "+IntStream.rangeClosed(1, 50).max());
        System.out.println("--------- longstream ------ "+LongStream.rangeClosed(50, 100).min());
        System.out.println("-------------average -------------- "+IntStream.rangeClosed(1, 50).average());
    }
}
