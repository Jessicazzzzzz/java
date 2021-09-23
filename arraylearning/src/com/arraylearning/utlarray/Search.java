package com.arraylearning.utlarray;

import java.util.Arrays;
/*
该程序显示了怎么二分法查找

 */

public class Search {
    public static void main(String[] args) {
        int[] arr= {30,20,50,10,80,9,7,12,100,40,8};
        int searchWord = 20;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,searchWord));
    }
    public static  int binarySearch(int[]  ar, int a){
        int low =0;
        int high = ar.length -1;

        int temp;
        while(low<high){
            int mid= (low+high)/2;
            if(a ==ar[mid]){
                return mid;

            }if(a>ar[mid]){
                low=mid+1;
            }
            if(a<ar[mid]){
                high= mid+1;
            }

        }
        return -1;


    }
}
