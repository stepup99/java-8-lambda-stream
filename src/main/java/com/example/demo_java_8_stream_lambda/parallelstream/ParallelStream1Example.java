package com.example.demo_java_8_stream_lambda.parallelstream;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ParallelStream1Example {

    public  static List<String> sequesntialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline is sequesntial : "+(endTime-startTime));
        return  studentActivities;
    }

    public  static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline is parallel : "+(endTime-startTime));
        return  studentActivities;
    }



    public static void main(String[] args) {
            sequesntialPrintStudentActivities();
            parallelPrintStudentActivities();
    }
}
