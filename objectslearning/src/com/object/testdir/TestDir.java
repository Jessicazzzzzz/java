package com.object.testdir;

import java.io.File;

public class TestDir {
    public static void main(String[] args) {
        File f = new File("/Users/jessicazhu/Desktop/picture");
        printFile(f,0);
    }
    static  void printFile(File file,int level){
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        //文件名
        System.out.println(file.getName());
        //如果是目录，就列出子目录
        if(file.isDirectory()){
            File[] files=file.listFiles();
            //循环子目录--》调用本身再回到方法的开头
            for(File temp: files){
                printFile(temp,level+1);
            }
        }
    }
}
