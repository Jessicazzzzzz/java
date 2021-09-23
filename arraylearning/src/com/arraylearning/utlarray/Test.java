package com.arraylearning.utlarray;

import java.util.Arrays;

/*
测试java.util.Arrays class
这个类提供了操作数组的工具类
 */
public class Test {
    public static void main(String[] args) {
        int [] a= {100,200,300,299,198,489};
        //打印数组
        System.out.println(Arrays.toString(a));
        //从小到大排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
       //二分法查找，必须先排序
        //返回索引的位置，未找到返回-1
        System.out.println("该元素的索引："+Arrays.binarySearch(a,299));
        //覆盖原来位置的数字
        Arrays.fill(a,2,4,100);
        System.out.println(Arrays.toString(a));
    }
}
