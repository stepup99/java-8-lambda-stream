package com.example.demo_java_8_stream_lambda.functionalInterfaces;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
       Map<String, Double> studentGradeMap = new HashMap<>();
       students.forEach(student -> {
           studentGradeMap.put(student.getName(), student.getGpa());
       });
       return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println("studentFunction >>>>>>>>> "+studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
