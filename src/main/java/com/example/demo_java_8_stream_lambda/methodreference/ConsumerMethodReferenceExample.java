package com.example.demo_java_8_stream_lambda.methodreference;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    /*
    *
    * classname::methodName
    *
    * */



    /*
    *
    *
    * ClassName::InstanceMethod
    *
    *
    * */



    static Consumer<Student> c1 = System.out::println;


    static  Consumer<Student> c2 = s->s.printListOfActivities();
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);

        StudentDataBase.getAllStudents().forEach(c2);

    }
}
