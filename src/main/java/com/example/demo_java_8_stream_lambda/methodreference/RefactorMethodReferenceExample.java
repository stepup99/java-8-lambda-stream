package com.example.demo_java_8_stream_lambda.methodreference;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {


    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;
    public  static boolean greaterThanGradeLevel(Student s){
        System.out.println("greaterThanGradeLevel >>>>>>>> ");
        return  s.getGradeLevel()>=3;
    }
    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }
}
