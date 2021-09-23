package com.object.stringlearning;

public class Teststring {
 public static void main(String[] args) {
  String str= "abcd";//不可变序列
  StringBuffer str1= null;//可变序列，安全，效率低
  StringBuilder str2=null;//可变序列，不安全，效率高，
    str2 = new StringBuilder("hi");
    str2.append(123);
    str2.append(456);
  System.out.println(str2);//返回还是str2
    str2.append("aa").append("bb").append("cc");
  System.out.println(str2);

  for(int i=0;i<10;i++){
    str2.append(i);
  }
  System.out.println(str2);


     str1 = new StringBuffer(" eat a lot");
   str1.insert(0,"love").insert(0,"i");
  System.out.println(str1);

  str1.delete(0,2);
  System.out.println(str1);//删除字符串
  str1.deleteCharAt(0);
  System.out.println(str1);//删除字符
  System.out.println(str1.charAt(0));//打印某个字符
  System.out.println(str1.reverse());//倒序
}
}
