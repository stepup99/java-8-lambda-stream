package com.example.demo_java_8_stream_lambda.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println(intStream.count());
        IntStream.range(1, 50)
                .forEach(value -> System.out.println(value+","));
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value));
        System.out.println("-----------------------");
        LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value));
        System.out.println("--------- as double stream");
        IntStream.range(1, 50).asLongStream().forEach(value -> System.out.println(value));
    }
}
