package com.object;

public class Car {

    public static void main(String[] args) {
	// write your code here
      Tyre tyre1 = new Tyre();
      tyre1.run();
      Window window1=new Window();
      Window window2=new Window(4);
      window2.clean();
    }
}

class  Tyre{

    public void run(){
        System.out.println("good.");
    }
}
class Window{
    private int win;
     public Window(){}
    public Window(int win) {
        this.win = win;
    }
    public  void  clean(){
        System.out.println("clean,good.");
    }
}