package com.object;

public class Overload {

  int id;
  String name;
  int age;
  public Overload (int id){
      //this ->first id
      this.id = id;
  }
  public  Overload(int id ,String name,int age){
      this.id =id;
      this.name = name;
      this.age = age;
  }

    public static void main(String[] args) {
        Overload student1 = new Overload(1001,"jessica",18);
        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println(student1.age);
    }

}
