package com.example.demo_java_8_stream_lambda.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {


    public  static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < numberOfTimes; i++) {
         supplier.get();
        }
        long stopTime = System.currentTimeMillis();
        return  stopTime-startTime;
    }

    public  static  int sum_sequential_Stream(){
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }


    public  static  int sum_parallel_Stream(){
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }


    public static void main(String[] args) {

        //System.out.println("sum_sequential_Stream ---------- "+sum_sequential_Stream());
        //System.out.println("sum_parallel_Stream-----------   "+sum_parallel_Stream())
        System.out.println("avaialble processor ----------- "+Runtime.getRuntime().availableProcessors());

        System.out.println("--------- ------ sequential : "+checkPerformanceResult(ParallelStreamExample::sum_sequential_Stream, 20));
        System.out.println("--------- ----- parallel : "+checkPerformanceResult(ParallelStreamExample::sum_parallel_Stream, 20));
    }
}
