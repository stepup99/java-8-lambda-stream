package com.example.demo_java_8_stream_lambda.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");
        names.remove(0);
        System.out.println("names : "+names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println); // already run and closed.
    }
}
