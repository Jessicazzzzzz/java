package cm.shangxuetang;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        while(true){

       System.out.println("enter your salary of month");
       while(!s.hasNextInt())
       {
            //s.next()吃掉一个回车
           s.nextLine();//吃掉剩余的行
           System.out.println("invalid input,try again.");
           System.out.println("enter your salary of month");
           s.hasNextInt();

       }


            int salary_month = s.nextInt();
            System.out.println("your salary of this year is "+salary_month*12);


            System.out.println("please enter \"exit\" to quit,enter \"next\" to continue:");
            String input = s.next();
            //if(input.equals("exit"))  区分大小写
            if(input.equalsIgnoreCase("exit"))//不区分大小写
            {
                System.out.println("bye.");
                break;
            }
            else if (input.equals("next")){
                continue;
            }
            else
            {
                System.out.println("invalid input");
                break;
            }


    }




    }
}
