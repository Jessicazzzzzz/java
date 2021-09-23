package com.object.annomyos;

public class Testniming {
    //这是定义了一个方法,接口不能new ，但是可以作为类型
    public void test (A a){
        a.run();
    }

    public static void main(String[] args) {
        Testniming m = new Testniming();
        m.test(new B());
        //匿名定义，只能使用一次,因为它没有对象
        m.test(new A(){
            @Override
            public void run() {
                System.out.println("run slow");
            }
        });
        //这又是一个新的，注意写的方式
        m.test(new A(){
            @Override
            public void run() {
                System.out.println("another run ");
            }
        });
    }
}
//普通方法
class B implements A{
    @Override
    public void run() {
        System.out.println("run quick.");
    }
}
interface  A{
    void run();
}