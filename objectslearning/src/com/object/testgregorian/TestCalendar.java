package com.object.testgregorian;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar =
                new GregorianCalendar(2021,9,21,22,10,50);
        int year = calendar.get(Calendar.YEAR);
        int month =calendar.get(Calendar.MONTH);
        int day =calendar.get(Calendar.DAY_OF_MONTH);
        //DAY OF MONTH = DATE
        int day1 =calendar.get(Calendar.DATE);
        int date =calendar.get(Calendar.DAY_OF_WEEK);
        //一周从周日开始，所以周日是1，
        System.out.println("year"+year+"month"+month+"day of month"+day+"day of week"+date);
        GregorianCalendar calendar2= new GregorianCalendar();
        calendar2.set(Calendar.YEAR,2021);
        calendar2.set(Calendar.MONTH,Calendar.FEBRUARY);//月份数是0-11
        calendar2.set(Calendar.DATE,21);
        calendar2.set(Calendar.HOUR_OF_DAY,10);
        calendar2.set(Calendar.MINUTE,20);
        calendar2.set(Calendar.SECOND,19);
        System.out.println(calendar2.get(Calendar.YEAR));
        GregorianCalendar calendar3 = new GregorianCalendar(2021,10,21);
        calendar3.add(Calendar.MONTH,-7);//月份-7
        calendar3.add(Calendar.DATE,7);//+7 days
        printCalendar(calendar3);


    }
    static  void printCalendar(Calendar calendar){
        int year =calendar.get(Calendar.YEAR);
       int month =calendar.get(Calendar.MONTH)+1;
       int day = calendar.get(Calendar.DAY_OF_MONTH);
       int date=calendar.get(Calendar.DAY_OF_WEEK);
       String week =""+((date==0)?"日":date);
       int hour =calendar.get(Calendar.HOUR);
       int minute=calendar.get(Calendar.MINUTE);
       int second= calendar.get(Calendar.SECOND);
        System.out.print("year:"+year+"month:"+ month+"day:"+day+"week"+week+"date:"+date+
             "hour:" +hour+"minute:"+minute+"second:"+second);
    }



}
