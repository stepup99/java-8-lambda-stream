package com.example.demo_java_8_stream_lambda.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTime {
  public static void main(String[] args) {
    System.out.println("---------------- ");
    var localDateTime = java.time.LocalDateTime.now();
    System.out.println("localDateTime : " + localDateTime);
    var localDateTime1 = java.time.LocalDateTime.of(2018, 03, 5, 1, 4, 6);

    System.out.println("localDateTime1 : " + localDateTime1);

    java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.of(LocalDate.now(), LocalTime.now());
    System.out.println("localDateTime2 ------------- " + localDateTime2);

    /*
     * 
     * Getting the tiome and date from LocalDateTime instance
     * 
     * 
     * 
     * 
     * 
     */
    System.out.println("hour : " + localDateTime.getHour());
    System.out.println("minute : " + localDateTime.getMinute());
    System.out.println("get day of the month : " + localDateTime.getDayOfMonth());
    System.out.println("vget chrono field : " + localDateTime.get(ChronoField.DAY_OF_MONTH));

    /*
     * 
     * Modifying LocalDate timex
     * 
     * 
     * 
     * 
     */

    System.out.println("plus hours " + localDateTime.plusHours(2));
    System.out.println("minus days " + localDateTime.minusDays(2));
    System.out.println("with month " + localDateTime.withMonth(2));
    System.out.println("localDateTime" + localDateTime);

    // converting localdate. localtime , localdatetime
    LocalDate localDate = LocalDate.of(2019, 01, 01);
    System.out.println("at time : " + localDate.atTime(23, 33));

    LocalTime localTime = LocalTime.of(23, 39);
    ;
    System.out.println("localdatetime -------- " + localTime.atDate(localDate));

    java.time.LocalDateTime localDateTime3 = localTime.atDate(localDate);
    System.out.println("localDateTime3 toLocalDate------------ " + localDateTime3.toLocalDate());
    System.out.println("localDateTime3 time ------------ " + localDateTime3.toLocalTime());
  }
}
