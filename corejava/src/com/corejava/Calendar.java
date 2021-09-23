package com.corejava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Calendar {
    public static void main(String[] args) {
        //首先创建一个类，得到这个月，和这个月的day
        LocalDate date = LocalDate.now();
        System.out.println("date.now="+date);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println("month="+month);
        System.out.println("today="+today);
        //这个月的第一天
        date =  date.minusDays(today-1);
        //这个月是星期几，而且转化为数字
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("value="+value);
        System.out.println("now date="+date);
        System.out.println("Mon Tus Wed Thu Fri Sat Sun");
        for (int i =1;i<value;i++){
            System.out.print("    ");//空格是根据mon+一个空格来的
        }


        while(date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date = date.plusDays(1);//date 在当月就要循环
            if(date.getDayOfWeek().getValue()==1)
                System.out.println();
        }

        if(date.getDayOfWeek().getValue()!=1)
            System.out.println();

        }



}
