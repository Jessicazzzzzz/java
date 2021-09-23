package com.arraylearning.utlarray;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        Object[] emp0= {1001,"gaogao1",16,"program","2021-10-10"};
        Object[] emp1= {1001,"xiaoxiao",17,"program","2021-10-10"};
        Object[] emp2= {1001,"gaogao3",18,"program","2021-10-10"};
        Object[][]  emps =new  Object[3][];
        emps[0]= emp0;
        emps[1]= emp1;
        emps[2]= emp2;
        //打印二维数组
        for(int i=0;i< emps.length;i++)
        System.out.println(Arrays.toString(emps[i]));

        //for，首先遍历二维数组emp，将它的变量设置为m,它的类型是Object[]
        //然后是进入每一个一维数组，它的变量设置为r，类型是Object ,循环
        for(Object[] m: emps) {
            for (Object r : m) {
                System.out.print(r + ",\t");
            }
            System.out.println();
        }

        //嵌套循环
       for(int i=0;i< emps.length;i++){
           for(int j=0;j<emps[i].length;j++){
               //type different,need to cast
               if((int)emps[i][2]>16)
               {
                   System.out.print(emps[i][j]+"\t");
               }


           }
           System.out.println();
       }



    }
}
