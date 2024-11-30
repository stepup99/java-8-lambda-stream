package com.example.demo_java_8_stream_lambda.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {


    public  static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                // 6 -> y
                // 7 -> y
                // 8 -> y
                // 9 -> y
                // 10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce(0, (x, y)-> x>y?x:y);
    }



    public  static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return integerList.stream()
                // 6 -> y
                // 7 -> y
                // 8 -> y
                // 9 -> y
                // 10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce((x, y)-> x>y?x:y);
    }


    public  static int findMinValue(List<Integer> integerList){
        return integerList.stream()
                // 6 -> y
                // 7 -> y
                // 8 -> y
                // 9 -> y
                // 10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce(0, (x, y)-> x<y?x:y);
    }

    public  static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return integerList.stream()
                // 6 -> y
                // 7 -> y
                // 8 -> y
                // 9 -> y
                // 10 -> y
                // x variable holds the max value for each element in the iteration
                .reduce((x, y)-> x<y?x:y);
    }



    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8,9, 10);
        List<Integer> integerList1 = new ArrayList<>();
        System.out.println("findMaxValue() 1 : "+ findMaxValue(integerList));
        System.out.println("findMaxValue() 2 : "+ findMaxValue(integerList1));
        System.out.println("findMaxValue() optional 3 : "+ findMaxValueOptional(integerList));
        System.out.println("findMinValue() 1 : "+ findMinValue(integerList));
        System.out.println("findMinValue() 2 optional : "+ findMinValueOptional(integerList));
    }
}
