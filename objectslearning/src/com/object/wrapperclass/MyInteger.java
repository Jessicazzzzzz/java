package com.object.wrapperclass;
/*
自定义包装类
 */
public class MyInteger {
    private int value;
    private static MyInteger[] cache= new MyInteger[256];//必须给它一个空间
    //静态变量
    private static final int LOW =-128;
    private static final  int High=127;
    static {
        //[-128,127]，将这个数组放入cache 区中
        for(int i=LOW;i<High;i++){
          // cache[128+i]=MyInteger.valueof(i);//出现死循环
            cache[i+128]=new MyInteger(i);
        }
    }
    public  static MyInteger valueof(int i){
        if(i>=LOW&&i<=High){
            return cache[i+128];
        }
        return  new MyInteger(i);
    }
    //构造器私有
   private MyInteger(int i){
        this.value =i;

    }
    public  String toString(){
        return  this.value+"";//通过+""返回字符串
    }
    //测试
    public static void main(String[] args) {
        MyInteger m =MyInteger.valueof(300);
        System.out.println(m);
    }
}
