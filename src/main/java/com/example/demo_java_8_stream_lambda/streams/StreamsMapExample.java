package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static List<String> namesList(){

                return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                        .map(String::toUpperCase)
                .collect(Collectors.toList());

    }


    public static Set<String> namesSet(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

    }



    public static void main(String[] args) {
        System.out.println("names list ----------- > "+namesList());
        System.out.println("names set ------------> "+namesSet());
    }
}
