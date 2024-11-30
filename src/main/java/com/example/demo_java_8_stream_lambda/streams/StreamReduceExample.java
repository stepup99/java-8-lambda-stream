package com.example.demo_java_8_stream_lambda.streams;

import com.example.demo_java_8_stream_lambda.data.Student;
import com.example.demo_java_8_stream_lambda.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public  static  int performMultiplication(List<Integer> integerList){
        return  integerList.stream()
                // 1
                // 3
                // 5
                // 7
                // a = 1, b=1 (from stream) -> result 1 is returned
                // a = 1, b=3 (from stream) -> result 3 is returned
                // a = 3, b=5 (from stream) -> result 15 is returned
                // a = 15,b=7 (from stream) -> result 105 is returned
                .reduce(1, (a, b)->a*b);
    }

    public static Optional<Student> getHighestGPAstudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1, s2)-> s1.getGpa()>s2.getGpa()?s1:s2);
    }

    public  static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        System.out.println("performMultiplicationWithoutIdentity");
        return  integerList.stream()
                .reduce((a, b)->a*b);
    }





    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> integers1 = new ArrayList<>();
        System.out.println("perform multiplication "+performMultiplication(integers));
        System.out.println("performMultiplicationWithoutIdentity get -----"+performMultiplicationWithoutIdentity(integers).get());
        System.out.println("performMultiplicationWithoutIdentity present -----"+performMultiplicationWithoutIdentity(integers).isPresent());
        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);
        if(result1.isPresent()){
            System.out.println("performMultiplicationWithoutIdentity get 1 -----"+result1.get());
        }
        System.out.println("getHighestGPAstudent() ------------ > "+getHighestGPAstudent());
    }
}
