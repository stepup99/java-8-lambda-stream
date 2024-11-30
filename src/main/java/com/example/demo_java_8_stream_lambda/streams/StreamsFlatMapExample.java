package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public  static List<String> printStudentActivities(){
//        return StudentDataBase.getAllStudents().stream() // Stream<Student>
//                .map(Student::getActivities) // Stream<List<String>>
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    };

    public  static long printStudentActivitiesCount(){
//        return StudentDataBase.getAllStudents().stream() // Stream<Student>
//                .map(Student::getActivities) // Stream<List<String>>
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(Collection::stream)
                .distinct()
                .count();
    };



    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println("System.out.println(printStudentActivities()); >>>>>>> "+printStudentActivitiesCount());
    }
}
