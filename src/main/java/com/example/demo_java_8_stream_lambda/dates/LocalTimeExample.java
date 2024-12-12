package com.example.demo_java_8_stream_lambda.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
  public static void main(String[] args) {
    LocalTime localTime = LocalTime.now();
    System.out.println("localtime --------------" + localTime);

    LocalTime localTime1 = LocalTime.of(23, 33);
    System.out.println("localtime1 ------- " + localTime1);

    LocalTime localTime2 = LocalTime.of(23, 23, 23);
    System.out.println("localtieme2 " + localTime2);

    LocalTime localTime3 = LocalTime.of(23, 33, 33, 9090);
    System.out.println("localTime3 ----------- " + localTime3);

    System.out.println("getHours" + localTime.getHour());

    System.out.println("getMinute --------- " + localTime.getMinute());

    System.out.println("getSecond --------- " + localTime.getSecond());

    // ChronoField
    // temoporal

    System.out.println("CLOCK hour of the day : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
    //
    System.out.println("toSecondOf the day : " + localTime.toSecondOfDay());

    /*
     * Mdoify values of localtime
     * 
     * 
     * 
     * 
     */

    System.out.println("minus hours" + localTime.minusHours(2));
    System.out.println("minus hours : " + localTime.minus(2, ChronoUnit.HOURS));

    System.out.println("MIDnight : " + localTime.with(LocalTime.NOON));
    System.out.println("Hour of the day : " + localTime.with(ChronoField.HOUR_OF_DAY, 22));
    System.out.println("plusMinutes ---------- : " + localTime.plusMinutes(30));

  }
}
