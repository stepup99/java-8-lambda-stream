package com.example.demo_java_8_stream_lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                // 6
                // 7
                // 8
                // 9
                // 10
                .limit(2)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()
                // 6
                // 7
                // 8
                // 9
                // 10
                .skip(3)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println("------------ > limit "+limit(integers));
        System.out.println("------------ > skip "+skip(integers));
    }
}
