package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class cwh_java_time_API {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dt = LocalDateTime.now(); // the main date
        System.out.println(dt);

        // Date time Formatter

        Calendar cal = Calendar.getInstance();
        //Date time = cal.getTime();
        // the below functions cannot be applied to the above function, it only applies to calendar class

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");  // this is the format in which the date is to formatted to
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  // this is the format in which the date is to formatted to
        DateTimeFormatter Tf = DateTimeFormatter.ofPattern("H : m a");
        DateTimeFormatter df3 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df);  // creates date string from the date from above and and puts it in the formatter
        String myDate2 = dt.format(df2);  // creates date string from the date from above and and puts it in the formatter
        String myTime = time.format(Tf);
        System.out.println("Today, date is "+myDate2);
        System.out.println("And now the time is "+myTime);
        // trying our random methods
        System.out.println(Tf.getZone());
        System.out.println(Tf.getLocale());
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        System.out.println(Tf.withZone(zoneId));
    }
}
