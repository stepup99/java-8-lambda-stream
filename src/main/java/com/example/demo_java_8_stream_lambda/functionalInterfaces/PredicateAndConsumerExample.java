package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = s -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = s -> s.getGpa()>=4;
    static BiConsumer<String, List<String>> studentConsumer = (name, activities) -> System.out.println(name +" : "+activities);
    static Consumer<Student> c1 = (student -> {
       if(p1.and(p2).test(student)){
            studentConsumer.accept(student.getName(), student.getActivities());
       }
    });
    public static void main(String[] args) {
        List<Student> ls = StudentDataBase.getAllStudents();
        ls.forEach(c1);
    }





}
