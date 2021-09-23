package com.object.stringlearning;
/*
该程序简单的测试StringBbuilder的效率，可以看出str.append的效率很高
因为它不会不停的新建对象
 */

public class TestBuffer {
    public static void main(String[] args) {
        String str8 = "";
        //本质上使用stringbuilder拼接，但是每次循环都会生成一个对象
        long num1 = Runtime.getRuntime().freeMemory();
        long time1= System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            str8= str8+i;
        }
        long num2 =Runtime.getRuntime().freeMemory();
        long time2= System.currentTimeMillis();
        System.out.println("string占用的内存："+(num1-num2));
        System.out.println("string占用的时间："+(time2-time1));
        //使用StringBuilder进行字符串的拼接
        StringBuilder str = new StringBuilder("");
        long num3 =Runtime.getRuntime().freeMemory();
        long time3=System.currentTimeMillis();
        for(int i =0;i<5000;i++){
            str.append(i);
        }long num4=Runtime.getRuntime().freeMemory();
        long time4=System.currentTimeMillis();
        System.out.println("string 占用的内存："+(num3-num4));
        System.out.println("string 占用的时间："+(time4-time3));


    }

}
