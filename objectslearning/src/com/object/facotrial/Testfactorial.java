package com.object.facotrial;

public class Testfactorial {
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.println("10!="+factorial(5));
        long d2 =System.currentTimeMillis();
        System.out.println(d2-d1);
    }
        static long factorial(int n){
            if(n==1){
                return 1;
            }else {
                return n*factorial(n-1);
            }

    }
}
