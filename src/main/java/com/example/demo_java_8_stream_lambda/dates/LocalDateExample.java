package com.example.demo_java_8_stream_lambda.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println("localhdate ------- " + localDate);
    LocalDate localDate1 = LocalDate.of(2016, 07, 17);
    System.out.println("localdate1---------  " + localDate1);

    LocalDate localDate2 = LocalDate.ofYearDay(2014, 39);
    System.out.println("localedate 2 ------ " + localDate2);
    /*
     * get values from localgdate
     * 
     * 
     */

    System.out.println("------------ year " + localDate.getMonth());

    System.out.println("------------ month " + localDate.getMonthValue());

    System.out.println("day of the week --------" + localDate.getDayOfWeek());

    System.out.println("day of the year --------" + localDate.getDayOfYear());

    // System.out.println("localdate get -------- " +
    // localDate.get(ChronoField.MINUTE_OF_DAY));
    System.out.println("plus days " + localDate.plusDays(2));
    System.out.println("plus month " + localDate.plusMonths(8));
    System.out.println("with year " + localDate.withYear(8));
    System.out.println("with ChronoField " + localDate.with(ChronoField.YEAR, 2020));
    System.out.println("with Temporal Adjusters " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
    System.out.println("Chronounit minus --------- " + localDate.minus(1, ChronoUnit.YEARS));

    /*
     * 
     * Adition support
     * 
     * 
     * 
     */

    System.out.println("localdate --------- " + localDate);
    System.out.println("leap year " + localDate.isLeapYear());
    System.out.println("localdate equal " + localDate.equals(LocalDate.now()));
    System.out.println("localdate equal " + localDate.isEqual(localDate1));
    System.out.println("localdate is Before " + localDate.isBefore(localDate1));
    System.out.println("localdate is After " + localDate.isAfter(localDate1));
  }

}
