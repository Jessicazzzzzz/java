package com.object.testexcption;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileReader reader=null;
      try{
          reader = new FileReader("/Users/jessicazhu/Desktop/vs/a.txt");
          char c=(char)reader.read();
          char c1=(char)reader.read();//read() is int type,need to cast
          System.out.println(""+c1+c);
      }catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }finally {
          try {
              if (reader != null) {
                  reader.close();
              }

          } catch (IOException e) {
              e.printStackTrace();
          }
      }


    }

}
