package com.object;
//创建一个student 的class
public class Student {
    //创建静态对象，是属性（field)
   private  int Id;
    private int age;
    private String sName;
    //创建动态对象，是方法，相当于c中的函数，它是所有对象都可以调用的
    public static   void  study(){
        System.out.println("learning");
    }
    //构造(constractor)，给对象初始化，无参数，它的名字是跟class名相同的，自动返回值
   Student(){}

    //需要一个main 入口
    public static void main(String[] args) {
        //如果对象不赋值，那么默认为数值0
        Student s1= new Student();
        System.out.println(s1.Id);
        System.out.println(s1.age);
        System.out.println(s1.sName);
        //赋值第一个对象
        s1.Id = 1001;
        s1.age=18;
        s1.sName = "jessica";
        System.out.println(s1.Id);
        System.out.println(s1.age);
        System.out.println(s1.sName);
        //调用方法
        s1.study();
        System.out.println("=============");
        //创建第二个对象，并给静态对象赋值
        Student s2= new Student();
        s2.Id= 1002;
        s2.age=18;
        s2.sName="alice";
        System.out.println(s2.Id);
        System.out.println(s2.age);
        System.out.println(s2.sName);
        //调用方法
        s2.study();
    }
}
