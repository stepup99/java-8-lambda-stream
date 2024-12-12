package com.example.demo_java_8_stream_lambda.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
  public static void main(String[] args) {
    System.out.println("---------------------");
    LocalDate localDate = LocalDate.of(2018, 10, 1);
    LocalDate localDate1 = LocalDate.of(2018, 12, 31);

    /*
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
    */

    Period period = localDate.until(localDate1);
    System.out.println("period + " + period.getMonths());

    Period period2 = Period.ofYears(10);
    System.out.println("hget days ----------- " + period2.getYears());
    System.out.println("hget days ----------- " + period2.toTotalMonths());

    Period period3 = Period.between(localDate, localDate1);
    System.out.println("period days " + period3.getDays());
    System.out.println("period month " + period3.getMonths());
    System.out.println("period years " + period3.getYears());
  }
}
