package src.com.game;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
建立游戏窗口
 */
public class MyGameFrame extends Frame {

    @Override
    public void paint(Graphics g) {//g 就是画笔
        Color c= g.getColor();
        //g.setColor(Color.red);
        g.setColor(new Color(255,0,255));
        //绘制一条线，从坐标100，100 到400，400，是以图的开始点算的
       g.drawLine(100,100,400,400);
       //画矩形
        g.drawRect(100,100,300,200);
        //画椭圆
        g.drawOval(100,100,300,200);
        //画string
        g.drawString("www.hello.com",300,300);
        g.setColor(c);
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
