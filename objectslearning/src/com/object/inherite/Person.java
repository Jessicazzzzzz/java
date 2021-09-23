package com.object.inherite;

public class Person extends Object{
    String name ;
    int height;

    public void rest() {
        System.out.println("rest a little");
    }
    public  Person getFriend(){
        return  new Person();
    }
}
//extends 继承super 的所有属性和方法，但是不包括构造
class Student extends Person{
    int scores;
    public  void study(){
        System.out.println("study"+this.name);
    }
    //重新定义方法，就会覆盖继承来的方法 == override
    public  void rest(){
        System.out.println("sleep.");
    }
    @Override
    public String toString(){
        return  name+"want a new friend";
    }
    Student(String name,int height,int scores){
        this.name= name;
        this.height = height;
        this.scores = scores;
    }
   Student(){

   }
    public static void main(String[] args) {
        Student s = new Student("jess",170,90);
        System.out.println(s instanceof Person);
        //instanceof 表示实例，意思是s属于person,return true or false
        System.out.println(s instanceof Student);
        s.rest();
        System.out.println(s.getFriend());
        System.out.println(s.toString());
    }
}
class Aminal1 {

}
/*final 加了任何class 就不能继承了*/ class Dog1{
    public /*final 可以继承，不可以override*/  void  shout(){
        System.out.println("wowowo");
    }

}
final class  tiger{

}
//class  dongbeitiger extends tiger{}
class Taidi1 extends Dog{
    //OVERRIDE
    public  void shout(){
        System.out.println("hohoho");
    }

}