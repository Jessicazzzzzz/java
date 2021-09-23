package com.object.testexcption;

import java.io.FileReader;

public class Testsource {
    public static void main(String[] args) {
        //它本质上还是try catch finally
        try(FileReader reader = new FileReader("/Users/jessicazhu/Desktop/vs/a.txt");)

    {

        char c = (char) reader.read();
        char c1 = (char) reader.read();//read() is int type,need to cast
        System.out.println("" + c1 + c);
    }catch (Exception e){
            e.printStackTrace();
        }

    }

}
