package com.example.demo_java_8_stream_lambda.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
  public static void main(String[] args) {
    // LocalDate
    LocalDate localDate = LocalDate.now();
    System.out.println("localDate ------- " + localDate);
    // LocalTime
    LocalTime localTime = LocalTime.now();

    System.out.println("localtime -------- " + localTime);
    // LocalDateTime

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDateTime -------- " + localDateTime);
  }
}
