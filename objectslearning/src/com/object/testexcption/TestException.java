package com.object.testexcption;

public class TestException {
    public static void main(String[] args) {
        System.out.println("step1");
        try{
            int i=1/0;
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("step2");
    }
}
