package com.example.demo_java_8_stream_lambda.streams_terminal;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartiotioningByExample {

    public  static void partiotionigBy_1(){
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

        Map<Boolean, List<Student>> s = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy((gpaPredicate)));
        System.out.println("------------ "+s);
    }

    public  static void partiotionigBy_2(){
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

        Map<Boolean, Set<Student>> s = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
        System.out.println("------------ "+s);
    }



    public static void main(String[] args) {
//        partiotionigBy_1();
        partiotionigBy_2();
    }
}
