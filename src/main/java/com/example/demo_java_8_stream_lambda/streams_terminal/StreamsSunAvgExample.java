package com.example.demo_java_8_stream_lambda.streams_terminal;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSunAvgExample {

    public  static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getGradeLevel));

    }


    public  static  double average(){
        return  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("sum -  ------------ "+sum());
        System.out.println("average ----------- "+average());
    }
}
