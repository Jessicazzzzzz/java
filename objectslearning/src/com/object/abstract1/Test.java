package com.object.abstract1;

public class Test {
    public static void main(String[] args) {
        //Student is abstruct,不能new，就建个对象去继承
        //Student a= new Student();
        Student s = new Student1();
        s.exam();
        s.study();
        s.setName("hello");
        System.out.println(s.getName());
    }
}
class Student1 extends Student{

    @Override
    public void study() {
        System.out.println("work hard");
    }

    @Override
    public void exam() {
        System.out.println("100 scores");
    }
}
