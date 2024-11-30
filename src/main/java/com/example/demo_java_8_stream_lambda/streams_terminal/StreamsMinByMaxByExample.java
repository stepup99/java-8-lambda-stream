package com.example.demo_java_8_stream_lambda.streams_terminal;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public  static Optional<Student> minBy_example(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }


    public  static Optional<Student> maxBy_example(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("---------------- minBy_example "+minBy_example());
        System.out.println("---------------- maxBy_example "+maxBy_example());
    }
}
