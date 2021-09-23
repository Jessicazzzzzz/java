package com.object.stringlearning;

public class Test {
   public static void main(String[] args) {
      String str1 = "abcdedede";
      String str2 = new String("abcdedede");
      String str3 ="abcDEDEDE";
      String str4 = "de";
      String str41="de";
      System.out.println(str4==str41);
      System.out.println(str1.charAt(0));
      System.out.println(str1.length());
      System.out.println(str3.equalsIgnoreCase(str1));
      //查找字符串中是否有字符串，如果有就返回出现在字符串的位置，如果出错就返回-1
      System.out.println(str2.indexOf("de"));
      System.out.println(str2.lastIndexOf("de"));
      //一般来说是比较字符串的值
      System.out.println(str1.equals(str2));
      //这个是字符串的位置，而它们存放的位置是不一样的
      System.out.println(str1==str2);//false,它们的位置是不一样的
      String str5 = "abcdefgh".replace("d","f");
      System.out.println(str5);

      //prefix 前缀，是否是以某个字符段开始，返回boolean
      System.out.println("sxt,i love u".startsWith("sxt"));//true
      System.out.println("sxt,i love u".endsWith("sxt"));//false
      //substring 截取字符串
      System.out.println(str5.substring(2));//cfefgh
      System.out.println(str5.substring(2,5));
      //cfe,5-2=3，表示截取的长度，所以考虑长度，不要考虑index
      System.out.println(str5.toUpperCase());
      //去除首尾空格，可以用于用户登陆名的配对
      String str6 = "     s o rry ".trim();
      System.out.println(str6);
      //可以用replace 替换空格
      String str7 = str6.replace(" ", "");
      System.out.println(str7);
   }

}
