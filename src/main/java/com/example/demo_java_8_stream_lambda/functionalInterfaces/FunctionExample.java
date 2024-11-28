package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, String> function = name -> name.toUpperCase();
    static  Function<String, String> addSomething = name -> name.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println("andthen function >>>>>>>> "+function.apply("mack"));
        System.out.println("andthen function >>>>>>>> "+function.andThen(addSomething).apply("java8"));
        System.out.println("compose function >>>>>>>>>> "+function.compose(addSomething).apply("java8"));
    }
}
