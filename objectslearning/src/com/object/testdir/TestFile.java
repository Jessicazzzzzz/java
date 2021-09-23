package com.object.testdir;

import java.io.File;
import java.io.IOException;
import java.util.Date;



public class TestFile {
    public static void main(String[] args) throws IOException {
        File f1=new File("/Users/jessicazhu/Desktop/picture");

        //项目路径
        System.out.println(System.getProperty("user.dir"));
        f1.createNewFile();
        System.out.println("file是否存在:"+f1.exists());
        System.out.println("file是否是目录:"+f1.isDirectory());
        System.out.println("file是否是文件:"+f1.isFile());
        System.out.println("file最后的修改日期:"+new Date(f1.lastModified()));
        System.out.println("file的大小:"+f1.length());
        System.out.println("file的文件名:"+f1.getName());
        System.out.println("file的目录路径:"+f1.getPath());
        File f2 =new File("/Users/jessicazhu/Desktop/编程/尚学堂");
        f2.mkdirs();//new 多个目录
        f2.delete();//delete 一层目录


    }
}
