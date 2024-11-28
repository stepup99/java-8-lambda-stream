package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = ()->{
          return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimiing", "baskeball"));
        };
        System.out.println("Student is : "+studentSupplier.get());
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Student is list : "+listSupplier.get());
    }
}
