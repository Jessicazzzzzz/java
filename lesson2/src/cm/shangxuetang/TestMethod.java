package cm.shangxuetang;

import java.util.Scanner;

public class TestMethod {
     public static void say(int num){
         System.out.println("hello");
         System.out.println("another try"+num);
     }
     //定义方法，比如加法
     public static void summ(int a,int b){
         System.out.println(a+b);
     }
     //返回值
    public  static int add(int a,int b,int c){
         int sumall = a+b+c;
         return  sumall;
    }

    public static void  late(String name,int salary){

         Scanner time = new Scanner(System.in);

        System.out.println("how many mins do you late?");
        int lateMins = time.nextInt();
         if(lateMins>1&&lateMins<10){
             System.out.println("warning,do not do next time.");
         }else if(lateMins>10&&lateMins<20){
             System.out.println("your penalty is 100.");
         }else if(lateMins>20&&lateMins<30){
             System.out.println("your penalty is 200.");
         }else{
             System.out.println("your penalty is 3days salary.");
         }
    }

    public static void main(String[] args) {
       say(3);
       summ(3,5);

        System.out.println(add(2,3,4));
        late("jessica",3000);
    }

}
