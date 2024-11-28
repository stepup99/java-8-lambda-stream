package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1 = System.out::println;
    static  Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }

    public  static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }

    public  static void printNameAndActivitiesUsingConditions(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(student.getGradeLevel()>= 4 && student.getGpa()>=3.9){
                c3.andThen(c4).accept(student);
            }
        });
    }



    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("mack");
//        printName();
//        printNameAndActivities(); // consumer chaninig
        printNameAndActivitiesUsingConditions();
    }
}
