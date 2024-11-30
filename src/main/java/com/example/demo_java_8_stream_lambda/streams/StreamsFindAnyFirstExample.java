package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public  static Optional<Student> findAnyStudent(){
        return StudentDataBase.getOptionalStudent()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public  static Optional<Student> findFirstStudent(){
        return StudentDataBase.getOptionalStudent()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }



    public static void main(String[] args) {
        System.out.println("findAnyStudent() ----------- "+findAnyStudent());
        System.out.println("findFirstStudent() ----------- "+findFirstStudent());
    }
}
