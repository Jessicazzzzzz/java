package com.object.inherite;

public class Aminal {
    public static void main(String[] args) {
        Taidi  t = new Taidi();
       t.dog.shout();
       t.dog.height=100;
    }
}
 /*final*/  class Dog{
     int height;
     public /*final */  void  shout(){
         System.out.println("wowowo");
     }

}
class Taidi {

     //通过组合，去引用dog class的代码
    Dog dog = new Dog();



}