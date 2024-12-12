package com.example.demo_java_8_stream_lambda.optional;

import java.util.Optional;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

public class OptionalOrElseExample {

  // orElse
  // orElseGet
  // orElseThrow

  public static String optionalOrElse() {
    // Optional<Student> studenOptional =
    // Optional.ofNullable(StudentDataBase.studentSupplier.get());
    // String name = studenOptional.map(Student::getName).orElse("Default");
    Optional<Student> studenOptional = Optional.ofNullable(null);
    String name = studenOptional.map(Student::getName).orElse("Default");

    return name;
  }

  public static String optionalOrElseGet() {
    Optional<Student> studenOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
    String name = studenOptional.map(Student::getName).orElseGet(() -> "Default");

    return name;
  }

  public static String optionalOrElseThrow() {
    Optional<Student> studenOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
    String name = studenOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("no data available"));

    return name;
  }

  public static void main(String[] args) {
    System.out.println("-------------- optionalOrElse() " + optionalOrElse());
    System.out.println("optionalOrElseGet ------- " + optionalOrElseGet());
    System.out.println("optionalOrElseThrow ------- " + optionalOrElseThrow());
  }
}
