package com.example.demo_java_8_stream_lambda.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {

  public static void parseTime() {
    String time = "13:00";
    LocalTime localTime = LocalTime.parse(time);
    System.out.println("localTime ------------- " + localTime);
    LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
    System.out.println("localTime1 -------------- " + localTime1);

    /*
     * 
     * Custom defined Format
     * 
     * 
     * 
     */

    String time1 = "13*00";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");

    LocalTime localTime2 = LocalTime.parse(time1, dateTimeFormatter);
    System.out.println("localTime2 --------- " + localTime2);

    String time2 = "13*00*02";
    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");

    LocalTime localTime3 = LocalTime.parse(time2, dateTimeFormatter1);
    System.out.println("localTime3 --------- " + localTime3);

  }

  public static void formatTime() {
    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH|mm|ss");
    LocalTime localTime = LocalTime.now();
    String s = localTime.format(dateTimeFormatter1);
    System.out.println("formatTime --------- " + s);
  }

  public static void main(String[] args) {
    parseTime();
    formatTime();
  }
}
