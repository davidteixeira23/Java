/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author David
 */
public class Mavenproject8 {

    public static void main(String[] args) {

// Zone

// The ZoneDateTime is able to get the date,time, timezone, your continente and the city that your machine is configured.
ZonedDateTime CurrentlyDataTime = ZonedDateTime.now();
System.out.println("Date and time from the zone time of the system " + CurrentlyDataTime);
    
// WITH ZONEID we can take the time zone of every where in the world, writting the continent, and the city. like "America/Sao_Paulo" "Asia/Tokyo"
ZonedDateTime DateTimeLA = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
System.out.println(DateTimeLA);

// So in the line of bottom we get the dateTime of the system and convert it to a dateTime of another hemisphere.
ZonedDateTime DateTimeconvertToEurope = CurrentlyDataTime.withZoneSameInstant(ZoneId.of("Europe/London"));
System.out.println("The Date and time of London " + DateTimeconvertToEurope);

// Manipulate date and time together.
LocalDateTime  BirthDay = LocalDateTime.of(1969, 7, 22, 14, 15);
 System.out.println("Date of the person " + BirthDay);

// Changing the date and time to Brazilian format.
DateTimeFormatter Formatted = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
String FormattedDate = BirthDay.format(Formatted);
System.out.println("the date formatted " + FormattedDate);


    }
    
    
    
}
