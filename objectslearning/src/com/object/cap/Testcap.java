package com.object.cap;
/*
这是一个简单的 javabean ,testcap1 中调用了它，可以看到一次权限设置的不同，
导致用法的不同

 */
public class Testcap {

    private String name;
     int age;
    private  boolean flag;
    public String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age<0||age>150){
            System.out.println("invalid age");
        }else{
            this.age = age;
        }

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getAge() {
        return age;
    }

}
