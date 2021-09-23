package com.hhhh;

import java.util.Scanner;

public class Inputtest {


        public static void main(String[]args){
            Scanner s =new Scanner(System.in);
            System.out.println("please enter your name:");
            String name = s.nextLine();
            System.out.println("please enter your age :");
            int age = s.nextInt();
            System.out.println("please enter your salary:");
            double monthSalary = s.nextDouble();
            System.out.println("username:"+name+"\tage:"+age+"\tmonthSalary"+monthSalary);
        }
    }


