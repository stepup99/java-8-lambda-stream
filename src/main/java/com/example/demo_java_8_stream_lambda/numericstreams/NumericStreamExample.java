package com.example.demo_java_8_stream_lambda.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {
    public  static int sumOfNNumbers(List<Integer> integerList){
        return integerList
                .stream()
                .reduce(0, Integer::sum);
    }

    public static int sumOfNNumbersIntStream(){
        return IntStream.rangeClosed(1, 6)
                // 1, 2, 3, 4, 5, 6, 7
                .sum();
    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8 );
        System.out.println("sum of numbers -> "+sumOfNNumbers(integerList));
        System.out.println("sum of n numbers int Stream"+sumOfNNumbersIntStream());
    }
}
