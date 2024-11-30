package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {


    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa()>=3.9)
                .toList();
    }


    public static void main(String[] args) {
//        System.out.println("filterStudents ------------ "+filterStudents());
        filterStudents().forEach(System.out::println);
    }
}
