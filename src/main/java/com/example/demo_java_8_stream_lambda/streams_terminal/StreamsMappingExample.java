package com.example.demo_java_8_stream_lambda.streams_terminal;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    public static void main(String[] args) {
        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        Set<String> namesSet = StudentDataBase.getAllStudents()
                        .stream()
                                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));
        System.out.println("nameList --------- "+namesList);
        System.out.println("namesSet --------- "+ namesSet);
    }
}
