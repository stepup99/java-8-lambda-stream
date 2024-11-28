package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (a, b)->a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
        System.out.println("Binary Operator  "+binaryOperator.apply(3, 4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

        System.out.println("result of maxBy is :"+maxBy.apply(4, 5));


        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("result of minBy is :"+minBy.apply(4, 5));
    }
}
