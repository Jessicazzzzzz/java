package com.object.interface1;

public class Test {
    public static void main(String[] args) {
        SuperMan su1 = new SuperMan();
        Volant s2 =new SuperMan();
        Honest h = (Honest)s2;
        h.helpothers();
        su1.fly();
        su1.stop();
        su1.helpothers();
        //静态的不需要new,可以直接引用class 名
        A.staticMethod();
        Test_A.staticMethod();
        //default 接口
        B b  = new Test_B();
        b.defaultMethod();
        //接口的继承测试
        TestCDextends test1 = new TestCDextends();
        test1.method1();
        test1.method2();
        test1.method3();

    }
}
//静态方法
interface  A {
    public static void staticMethod() {
        System.out.println("A.staticmethod.");
    }
}
class Test_A implements  A{
    public static void staticMethod() {
        System.out.println("Test_A.staticmehtod");
    }

}
//测试default 接口
interface  B {
    default  void defaultMethod() {
        System.out.println("B.staticmethod.");
    }
}
class Test_B implements  B{
    @Override
    public void defaultMethod() {
        System.out.println("Test_B.defaultmethod");
    }
}
//这个对象接口实现时，就会有all 所有的方法，因为all不光有自己的，还有继承来的
class TestCDextends implements  All{
    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }
}
interface  C{
    void method1();
}
interface  D{
    void  method2();
}
interface  All extends C,D{
    void method3();
}