package com.corejava;

import java.util.Arrays;
import java.util.Scanner;

public class LottoryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("what is highest number you can draw?");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i]= i+1;
        }
        int[] results = new int[k];
        for (int i= 0;i< results.length;i++){
            int r= (int)(Math.random()*n);
            results[i] = numbers[r];
            //要确保不抽到重复的，需要将原数组的元素每次减去一个
            // 将数组最后一个覆盖被取出的number，必须用最后一个，这样就算r是最后一个也没关系。
            numbers[r]= numbers[n-1];
            n--;
            System.out.print("r="+r+"\t");
            System.out.print("result="+results[i]);
            System.out.println();
        }
        System.out.println();
        Arrays.sort(results);
        for(int r:results)
            System.out.print(r+"\t");

    }
}
