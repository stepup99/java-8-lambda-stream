package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {
    public  static  void nameAndActivities(){
        System.out.println("nameAndActivities");
        BiConsumer<String, List<String>> biConsumer = (name , activities) -> System.out.println(name+" : "+activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }



    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a+" <<<<<<<hs s >>>>>>>"+b);
        biConsumer.accept("mack", "data");
        Consumer<Student> s1 = (a) -> System.out.println(a);
        biConsumer.accept("kkk", "ggg");
        BiConsumer<Integer , Integer> multiply = (a,b)->{
            System.out.println("multiplation ------ "+a*b);
        };
        BiConsumer<Integer, Integer> division = (a, b)->{
            System.out.println("division -------- "+a/b);
        };

        multiply.andThen(division).accept(10, 5);
        nameAndActivities();
    }
}
