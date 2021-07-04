package com.company;

import java.sql.Time;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;


public class cwh_calendarClass {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // to change the timeZone ID use the following function
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println("getCalendarType() method - " + c.getCalendarType());
        System.out.println("getTimeZone().getID() method - " + c.getTimeZone().getID());
        System.out.println("getTime() method - " + c.getTime());
        // trying out random methods
        System.out.println(c.getTimeInMillis());
        System.out.println("getFirstDayOfWeek() method - " + c.getFirstDayOfWeek());
        System.out.println("hashCode() method - " + c.hashCode());
        System.out.println(c.isLenient());
    }
}
