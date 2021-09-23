package com.corejava;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a= new int[5];
        int i;
        for( i=0;i<5;i++){
            a[i]=i+1;

        }
        //way 1;
        for( i=0;i<5;i++){
            System.out.print(a[i]);
        }
        System.out.println();
      //way2;打印数组，row 是数组中的每一个元素的变量名称，是传统的easy version
        for (int row: a)
            System.out.print(row);

    //数组拷贝
        System.out.println();
    int [] scores =new int[]{80,75,60,80,90};
    for (int ele: scores)
        System.out.print(ele+"\t");
        System.out.println();
        //定义一个新的数组将scores 数组copy 过来，如果长度大于src数组
        //后面就0 填充，要是小于src数组，比如下面的例子长度是4，那么就copy原数组中4个元素
    int [] newScores =(int[]) Arrays.copyOf(scores,8);
    for (int ele: newScores)
        System.out.print(ele+"\t");
        System.out.println();
        //新数组的长度是to - from ,数组元素不包括最后一个元素
        int [] newScores2 = (int[]) Arrays.copyOfRange(scores,2,8);
        for (int ele2: newScores2)
            System.out.print(ele2+"\t");
        System.out.println();
        //length 是指拷贝数组的长度，不能超过原数组的长度，
        // 如果srcpos 是0，那length就是原数组的长度，相反，那么length 原数组的长度-srcpos
        int [] newScores3 = new int[]{80,81,83,82,94,78,54};
        System.arraycopy(scores,2,newScores3,2,3);
        for (int ele3: newScores3)
            System.out.print(ele3+"\t");


}

}
