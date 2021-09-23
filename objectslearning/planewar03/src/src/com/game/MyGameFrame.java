package src.com.game;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
建立游戏窗口
 */
public class MyGameFrame extends Frame {
    Image plane  =Gameutil.getImage("images/hero_blowup_n3.png");
    Image bg  =Gameutil.getImage("images/background.png");
    @Override
    public void paint(Graphics g) {//g 就是画笔
      g.drawImage(bg,500,500,null);
      g.drawImage(plane,100,100,99,124,null);

    }

    //初始化窗口,它继承了Frame,所以可以直接使用它的方法
    public  void launchFrame(){
        this.setTitle("飞机大战");
        setVisible(true);
        setSize(500,500);
        setLocation(400,100);
        //需要关闭窗口，建立一个匿名内部类
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame gameFrame= new MyGameFrame();
        gameFrame.launchFrame();
    }

}
