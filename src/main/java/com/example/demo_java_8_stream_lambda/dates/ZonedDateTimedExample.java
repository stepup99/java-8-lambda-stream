package com.example.demo_java_8_stream_lambda.dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimedExample {
  public static void main(String[] args) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("zonedDateTime : " + zonedDateTime);
    System.out.println("zoneOffset : " + zonedDateTime.getOffset());
    System.out.println("Zone id " + zonedDateTime.getZone());

    System.out.println("Zone id --------- " + ZoneId.getAvailableZoneIds());

    System.out.println("No of Zone : " + ZoneId.getAvailableZoneIds().size());
    ZoneId.getAvailableZoneIds()
        .stream()
        .forEach((zone) -> System.out.println(zone));

    System.out.println("Chicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
    System.out.println("Detroit CST : " + ZonedDateTime.now(ZoneId.of("America/Detroit")));

    System.out.println("ZonedDateTime using clock " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

    java.time.LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
    System.out.println("localDateTime --------- " + localDateTime);

    java.time.LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Chicago")));
    System.out.println("localDateTime --------- " + localDateTime1);

    LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    System.out.println("localDateTime2 ------- " + localDateTime2);

    /*
     * 
     * convert from localdatetime, instant to zonedlocaldatetime and time
     * 
     * 
     * 
     * 
     * 
     */

    LocalDateTime localDateTime3 = LocalDateTime.now();

    System.out.println("localdatetime3   _ : " + localDateTime3);

    ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("America/Chicago"));

    System.out.println("zonedDateTime1 : " + zonedDateTime1);

    ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Detroit"));
    System.out.println("zonedDateTime2 -------- " + zonedDateTime2);

    OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(-6));

    System.out.println("offsetDateTime    --------- " + offsetDateTime);

  }
}
