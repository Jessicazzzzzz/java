package com.object.emuntest;

import java.util.Random;

public class Testenum {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        //枚举遍历week.values()返回的是week[]
        for(Week w:Week.values()){
            System.out.println(w);
        }

        int n = new Random().nextInt(4);
        switch (Season.values()[n]){
            case SPRING:
                System.out.println("春天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;

        }
    }

}
enum Season{
    SPRING,SUMMER,WINTER,AUTUMN
}
enum Week{
    星期一,星期二,
    星期三,星期四,
    星期五,星期六,
    星期天
}