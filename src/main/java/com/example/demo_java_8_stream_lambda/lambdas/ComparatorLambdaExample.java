package com.example.demo_java_8_stream_lambda.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /*
        *
        * prior java 8
        *
        * */


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("this is comparator >>>>>>> "+comparator.compare(3, 2));
        /*
        *
        * java 8
        *
        *
        * */

//        Comparator<Integer> comparatorLambda = (Integer a , Integer b) -> a.compareTo(b);
        Comparator<Integer> comparatorLambda = (a , b) -> a.compareTo(b);
        System.out.println("comparatorLambda.compare >>>>>>>>> "+comparatorLambda.compare(3, 1));

    }
}
