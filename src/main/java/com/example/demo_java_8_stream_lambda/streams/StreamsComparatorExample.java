package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public  static  List<Student> sortStudentName(){
        System.out.println("sortStudentName ----------- >>>>>> ");
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public  static  List<Student> sortStudentNameReversed(){
        System.out.println("sortStudentNameReversed ----------- >>>>>> ");
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }

    public  static List<Student> sortStudentByGpa(){
        System.out.println("sortStudentByGpa >>>>>.---------- ");
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

    }



    public  static List<Student> sortStudentByGpaReversed(){
        System.out.println("sortStudentByGpaReversed >>>>>.---------- ");
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(sortStudentByGpa());
        System.out.println(sortStudentName());
        System.out.println(sortStudentNameReversed());
        System.out.println(sortStudentByGpaReversed());
    }
}
