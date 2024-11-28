package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (i) -> i%2==0;
        Predicate<Integer> p2 = (i) -> i%9==0;
        System.out.println("this si : "+p1.test(10));
        System.out.println("And ------------- >>>>>>>> p1 and p2 : "+p1.and(p2).test(10));
        System.out.println("Or --------------- p1 and p2 : "+p1.or(p2).test(10));
        System.out.println("Negate --------------- p1 and p2 : "+p1.and(p2).negate().test(10));
    }






}
