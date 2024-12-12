package com.example.demo_java_8_stream_lambda.optional;

import java.util.Optional;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

public class OptionalExample {

  public static String getStudentName() {
    // Student student = StudentDataBase.studentSupplier.get();
    Student student = null;
    if (student != null) {
      return student.getName();
    }
    return null;
  }

  public static Optional<String> getStudentNameOptional() {
    // Optional<Student> studentOptional =
    // Optional.ofNullable(StudentDataBase.studentSupplier.get());
    Optional<Student> studentOptional = Optional.ofNullable(null);
    if (studentOptional.isPresent()) {
      return studentOptional.map(Student::getName);
    }

    return Optional.empty();

  }

  public static void main(String[] args) {
    System.out.println("-------------------------");
    // String name = getStudentName();
    // if (name != null) {
    // System.out.println("Length of the Student " + name.length());
    // } else {
    // System.out.println("name not found");
    // }

    Optional<String> stringOptional = getStudentNameOptional();
    if (stringOptional.isPresent()) {
      System.out.println("----------  stringOptional " + stringOptional.get().length());
    } else {
      System.out.println("Name not found");
    }

  }
}
