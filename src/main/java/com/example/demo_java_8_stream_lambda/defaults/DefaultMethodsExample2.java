package com.example.demo_java_8_stream_lambda.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

public class DefaultMethodsExample2 {
  static Consumer<Student> studentConsumer = (student -> System.out.println(student));
  static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
  static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

  public static void sortByName(List<Student> studentList) {

    studentList.sort(nameComparator);
    studentList.forEach(studentConsumer);
  }

  public static void sortByGPA(List<Student> studentList) {
    System.out.println("sortByGPA --------------- ");
    Comparator<Student> gpaConsumer = Comparator.comparingDouble(Student::getGpa);
    studentList.sort(gpaConsumer);
    studentList.forEach(studentConsumer);
  }

  public static void comparatorChaining(List<Student> studentList) {
    System.out.println("After coparator chaining -------- ");
    studentList.sort(gradeComparator.thenComparing(nameComparator));
    studentList.forEach(studentConsumer);
  }

  public static void sortWithNullValues(List<Student> studentList) {
    System.out.println("-------- sortWithNullValues ");
    Comparator<Student> studentComparator = Comparator.nullsLast(null);
    studentList.sort(studentComparator);
    studentList.forEach(studentConsumer);
  }

  public static void main(String[] args) {
    List<Student> studentList = StudentDataBase.getAllStudents();
    // studentList.forEach(studentConsumer);
    // sortByName(studentList);
    // sortByGPA(studentList);
    // comparatorChaining(studentList);
    sortWithNullValues(studentList);
  }
}
