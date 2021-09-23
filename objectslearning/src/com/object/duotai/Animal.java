package com.object.duotai;

public class Animal {
    public  void shout(){
        System.out.println("animal shout ");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("wo wo wo");
    }
    public void  watchDoor(){
        System.out.println("watch door");
    }
}
class  Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("mow mow mow");
    }

    public  void catMouse(){

    }
}
class Mouse extends  Animal{


}