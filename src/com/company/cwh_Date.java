package com.company;

import java.util.Date;

public class cwh_Date {
    public static void main(String[] args) {
        System.out.println("So the number of years passed since 1 Jan 1970 is: " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        // is it safe to store the value of seconds in a long integer
        // to answer have a look below
        System.out.println(Long.MAX_VALUE);
        long time = System.currentTimeMillis();
        System.out.println(time);
        // from the above example we can clearly say that it is very safe to store milliseconds in float
        Date d = new Date();
        System.out.print("Today's date is: ");
        System.out.println(d);
        // Trying random methods
        System.out.println(d.getTime());
        // the below two methods are deprecated!
        System.out.println(d.getDate());
        System.out.println(d.getDay());
    }
}
