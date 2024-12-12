package com.example.demo_java_8_stream_lambda.optional;

import java.util.Optional;

import com.example.demo_java_8_stream_lambda.data.Bike;
import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

public class OptionalMapFlatMapExample {
  // filter

  public static void optionalFilter() {
    Optional<Student> studenOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
    studenOptional.filter(student -> student.getGpa() >= 6)
        .ifPresent(student -> System.out.println(student));

  }

  // flatmap
  public static void optionalFlatMap() {
    Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
    Optional<String> name = studentOptional.filter(student -> student.getGpa() >= 3.5)
        .flatMap(Student::getBike)
        .map(Bike::getName);
    System.out.println(name);
  }

  // map
  public static void optionalMap() {
    Optional<Student> studeOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
    if (studeOptional.isPresent()) {
      Optional<String> stringOptional = studeOptional.filter(student -> student.getGpa() >= 3.5)
          .map(Student::getName);
      System.out.println(stringOptional.get());
    }
  }

  public static void main(String[] args) {
    System.out.println("-------------------");
    optionalFilter();
    optionalMap();
    optionalFlatMap();
  }
}
