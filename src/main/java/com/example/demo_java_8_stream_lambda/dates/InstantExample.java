package com.example.demo_java_8_stream_lambda.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
  public static void main(String[] args) {
    Instant instant = Instant.now();
    System.out.println(instant);
    // jan 1st 1970 -> Epoch -> 86400 seconds
    System.out.println("getEpoch second " + instant.getEpochSecond());
    System.out.println(Instant.ofEpochSecond(1));

    Instant instant1 = Instant.now();

    Duration duration = Duration.between(instant, instant1);
    System.out.println("difference -------- : " + duration.getNano());
  }
}
