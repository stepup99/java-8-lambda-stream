package com.example.demo_java_8_stream_lambda.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> toUpperCaseLambda = String::toUpperCase;

    public static void main(String[] args) {
            toUpperCaseLambda.apply("data");
    }
}
