package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentsByGpa();
        filterStudent();
    }

    public  static void filterStudentByGradeLevel(){
        System.out.println("filterStudentByGradeLevel >>>>>>>> ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public  static void  filterStudentsByGpa(){
        System.out.println("filterStudentsByGpa >>>>>>>>>> ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    public  static  void filterStudent(){
        System.out.println(" >>>>>>>>>>> filterStudent");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.and(p2).negate().test(student)){
                System.out.println(student);
            }
        }));
    }
}
