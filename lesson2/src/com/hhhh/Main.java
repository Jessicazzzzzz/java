package com.hhhh;

/**
 * 这个是网课练习记录
 */
public class Main {


    public static void main(String[] args) {
	// write your code here
        char c1='a';
        char c2='中';
        char c3='\u0061';

        String st = "i love java";//它不是基础数据类型，而且一个独立定义的类。
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(st);
        System.out.println("a\nb\nc\td\n");

       //boolean 单独使用4个字节，在数组中1个字节
        boolean flag = true;
        boolean flag1 = false;
        if(flag1)
        {
            System.out.println("flag1 is true");
        }else{
            System.out.println("flag1 is false");
        }

        int a=2;
        long b =3;
        long c= a+b;// 类型规则 ，默认往大的方向扩充
        System.out.println();

        int module= 10%3;
        System.out.println("余数等于="+module);

        //测试++
        int n=30;
        n++;
        System.out.println(n);
        n=30;
        int h=n++;
        System.out.println("now h="+h);
        System.out.println("now n ="+n);
        n=30;
         h = ++n;
        System.out.println("now h="+h);
        System.out.println("now ++n="+n);

        int n1= 2;
        int n2 =3;
        n2 +=n1;
        System.out.println("n2="+n2);
        n1=2;
        n2 *=n1+3;// +的优先级大于=，所以他是n1+3先，再*n2
        System.out.println("n2="+n2);


    }
}
