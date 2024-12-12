package com.example.demo_java_8_stream_lambda.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

  public static void parseDate() {
    String date = "2018-04-28";
    LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println("localDate -------- " + localDate);

    String date1 = "20180428";
    LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
    System.out.println("localDate2 ---------- " + localDate2);

    /*
     * 
     * Custom defined dateformat
     * 
     * 
     * 
     */

    String date2 = "2018|04|28";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
    LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
    System.out.println("localDate3 ------------ " + localDate3);

    String date3 = "2018*04*28";
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
    LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter2);
    System.out.println("localDate4 ------------ " + localDate4);

  }

  public static void formatLocalDate() {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");

    LocalDate localDate = LocalDate.now();
    String formattedDate = localDate.format(dateTimeFormatter);
    System.out.println("formattedDate ------------ " + formattedDate);
  }

  public static void main(String[] args) {

    parseDate();
    formatLocalDate();
  }
}
