package com.example.demo_java_8_stream_lambda.ConstructorReference;

import com.example.demo_java_8_stream_lambda.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> studntSupplier = Student::new;

    static Function<String, Student> studentFunction = Student::new;

    public static void main(String[] args) {
        System.out.println("student supplier obj ->>>>>> : "+studntSupplier.get());
        System.out.println(studentFunction.apply("ABC"));

    }
}
