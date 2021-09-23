package com.object.test;

import com.object.test2.User11;

public class Student1 {
    public static void main(String[] args) {
        User11 m= new User11();
        //System.out.println(m.agedefault);error ,default 不可跨包
        System.out.println(m.numpublic);//public
        //System.out.println(m.nameprotected);protected,不可跨包，除非是子类
    }
}
//students2 是user11的子类，它可以访问parent 的protected，
// 但是它不能访问parent对象的protected
class Student2 extends User11{
    public void test(){
        System.out.println(super.nameprotected);
    }

    public static void main(String[] args) {
        User11 k= new User11();
       // System.out.println(k.nameprotected);k 是对象
    }
}
