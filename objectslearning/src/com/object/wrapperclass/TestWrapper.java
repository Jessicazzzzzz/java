package com.object.wrapperclass;

public class TestWrapper {

    public static void main(String[] args) {
        //int -->objects
        Integer i= new Integer(300);
        Integer m =Integer.valueOf(300);

        //包装类转换为基本数据类型
        double d = m.doubleValue();
        //将字符串转换为数据类型
        Integer n=Integer.valueOf("234");
        Integer n1= Integer.parseInt("234");

        //将包装类对象转成字符串
        String str = n.toString();

        System.out.println(Integer.MAX_VALUE);

        //自动装箱,编译器帮你修改成Interger a= Interger.valueof(300)
        Integer a= 300;
        //自动拆箱,a= a.intValue();
        int b = a;

        //对象为空，调用它的属性和方法就会出现空指针，会报错,因为不能调用
        //Integer c =null;空对象不能调方法
        //int c1 =c;//编译器会改成c.intValue()



        //包装类的缓存问题
        Integer m1 =4000;
       Integer m2 = 4000;

       //当数字在-128 ～127，返回缓存数，
        // 也就是说如果数值在这个范围之内，就从这个数组中返回这个数值
       Integer m3 =123;
       Integer m4 =123;

        System.out.println(m1==m2);//false,两个不同的对象
        System.out.println(m3==m4);//true,从数组中取出的同一个对象

        System.out.println(m1.equals(m2));//true



    }
}
