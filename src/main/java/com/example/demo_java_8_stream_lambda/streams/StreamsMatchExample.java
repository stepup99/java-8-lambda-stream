package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

public class StreamsMatchExample {
    public static boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa()>=1);
    }

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa()<=-1);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa()<=-1);
    }


    public static void main(String[] args) {
        System.out.println("allMatch : "+allMatch());
        System.out.println("anyMatch : "+anyMatch());
        System.out.println("noneMatch : "+noneMatch());
    }
}
