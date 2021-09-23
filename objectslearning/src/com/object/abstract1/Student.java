package com.object.abstract1;


abstract public class Student {
    private  String name;
//方法定义了abstract，那么CLASS就必须是abstruct
     abstract  public void study();
    abstract  public void exam();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(String name){
        this.name =name;
    }
    //无参数构造方法，只要是super，最好加一个，不然
    //子类继承也没有的话，就会报错
    Student(){

    }
}
