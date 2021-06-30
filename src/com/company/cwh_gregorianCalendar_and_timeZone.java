package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Locale;

public class cwh_gregorianCalendar_and_timeZone {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        //System.out.println(c.get(Calendar.HOUR_OF_DAY));
        // by the below method you can show time
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND));
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.isLeapYear(2021)); // We cannot use this function from Calendar class
        // similarly there are many more functions!
        // GregorianCalendar is a concrete subclass of abstract class Calendar
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[12]);
        System.out.println(TimeZone.getTimeZone("Asia/Calcutta"));
        System.out.println(TimeZone.getDefault());
        TimeZone tz = TimeZone.getTimeZone("Africa/Abidjan");
        System.out.println(tz.getID());
        System.out.println(tz.getDSTSavings());
    }
}
