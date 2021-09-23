package com.object.timedate;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate {
    public static void main(String[] args) throws ParseException {
        //1秒=1000毫秒
        long a =Long.MAX_VALUE/(1000L*3600*24*365);
        System.out.println(a);//大约2.9亿年后
        long nowNum = System.currentTimeMillis();//当前时刻的毫秒数
        System.out.println(nowNum);

        Date d1 =new Date();//no arguments = now time
        System.out.println(d1);
        System.out.println(d1.getTime());
        Date d2 = new Date(1000L*3600*24*365*250);//250years later,but need to count leap year
        System.out.println(d2);


        //时间和对象的互相转换
        //DateFormat抽象类 SimpleDateFormat实现类
        //将字符串转换成date对象
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       Date d3 =df.parse("1971-3-10 10:40:52");
        System.out.println(d3.getTime());
        //将date 对象转换成字符串
        Date d4 =new Date(1000L*3600*23);
        String str = df.format(d4);
        System.out.println(str);
       Date dd= new Date();
       DateFormat df2 = new SimpleDateFormat("今年第w周，今年的第D天");//加中文可以，英文就报错
       SimpleDateFormat df3 = new SimpleDateFormat("今年第w周，今年的第D天");//加中文可以，英文就报错
        System.out.println(df2.format(dd));
        System.out.println(df3.format(dd));
    }


}
