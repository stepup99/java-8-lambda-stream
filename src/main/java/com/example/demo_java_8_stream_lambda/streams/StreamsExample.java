package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    // student name and their activities in a map
    public static void main(String[] args) {
        Predicate<Student> studentPredicate = s -> s.getGradeLevel()>=3;
        Predicate<Student> studentPredicate1 = s -> s.getGpa()>=3.9;
       Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
               .peek(System.out::println)
//                .filter(s-> s.getGradeLevel()>=3)
               .filter(studentPredicate)
               .peek(st-> System.out.println("after first filter :  "+st))
               .filter(studentPredicate1)
               .peek(st-> System.out.println("after second filter :  "+st))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println("stuent Map : "+studentMap);
    }
}
