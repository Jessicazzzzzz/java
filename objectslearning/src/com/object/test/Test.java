package com.object.test;
import com.object.test2.User11;//import 另外一个包
//import com.object.test2.*引入包内所有的内容，但是会降低编译速度，但是不会降低运行速度


import  static com.object.test2.Student.school;//倒入静态属性，注意static

import static java.lang.Math.*;
import  static  java.lang.Math.PI;
public class Test {
    public static void main(String[] args) {
       // com.object.test2.User u = new com.object.test2.User();不import
        User11 u= new User11();//import
        u.login();
       java.util.Date d =new java.util.Date();//两个import 里都有date,所有需要make specify
        System.out.println(PI);//正常需要写成Math.PI,这个有点像c 中的define
        System.out.println(random());
        System.out.println(school);
    }
}
