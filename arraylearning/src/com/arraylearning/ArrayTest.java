package com.arraylearning;

public class ArrayTest {

    public static void main(String[] args) {
	// 对象默认值是null,因为数组是对象

        int[] arr1=null;
        int[] arr2=new int[5];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=i*2+1;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
        System.out.println();
        for(int r:arr2){
            System.out.print(r);
        }


    }
}
