package com.example.demo_java_8_stream_lambda.streams_terminal;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
    public  static  void  groupStudentsByGender(){
        System.out.println("groupStudentsByGender ------------- ");
        Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println("student map ------------- "+studentMap);
    }



    public  static  void  customizedGroupingBy(){
        System.out.println("customizedGroupingBy -------------- ");
        Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8?"OUTSTANDING":"AVERAGE"));
        System.out.println("student map ------------- "+studentMap);
    }

    public  static  void  twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> student = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getGradeLevel,
                                Collectors.groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")
                        )
                );

        System.out.println(student);
     }

    public  static  void  twoLevelGrouping_2(){
        Map<Double, Integer> student = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getGpa,
                                Collectors.summingInt(Student::getGradeLevel)
                        )
                );

        System.out.println(student);
    }


    public  static void  threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

        System.out.println(studentLinkedHashMap);
    }



    public  static  void calculateTopGpa(){

       Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                Collectors.maxBy(Comparator.comparing(Student::getGpa))
                ));


        System.out.println("studentMapOptional ----------- "+studentMapOptional);


        Map<Integer, Student> studentMapOptional1 = StudentDataBase
                .getAllStudents()
                .stream()
                .collect(
                        Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)
                ));
        System.out.println("studentMapOptional1 ----------- "+studentMapOptional1);
    }



    public  static  void calculateLeastGpa() {

        Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.minBy(Comparator.comparing(Student::getGpa))
                ));


        System.out.println("studentMapOptional ----------- " + studentMapOptional);

    }








        public static void main(String[] args) {
        // groupStudentsByGender();
//        customizedGroupingBy();
//        twoLevelGrouping_1();
//        twoLevelGrouping_2();
//        threeArgumentGroupBy();
//        calculateTopGpa();


            calculateLeastGpa();
    }

}
