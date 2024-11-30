package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

public class StreamMapFilterReduceExample {
    private static int noOfNoteBooks(){
        return StudentDataBase
                .getAllStudents()
                .stream() // Stream<Student>
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks) //Stream<Integer>
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println("noOfNoteBooks ---------- "+ noOfNoteBooks());
    }
}
