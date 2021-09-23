package src.com.game;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/*
建立游戏窗口
 */
public class MyGameFrame extends Frame {

    Image plane = Gameutil.getImage("images/enemy2.png");
    Image bg = Gameutil.getImage("images/background.png");

    Plane p1 = new Plane(plane, 300, 300, 10);
    //Shell s1=new Shell();
    Shell[] shells = new Shell[10];
    Explore explore;//爆炸
    Date start = new Date();//游戏开始的时间
    Date end;
    long period;

    @Override
    public void paint(Graphics g) {//g 就是画笔

        g.drawImage(bg, Constant.GAME_WIDTH, Constant.GAME_HEIGHT, null);
     //画时间
        drawTime(g);


        p1.drawmyself(g);
        //画炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i].drawmyself(g);
            //实现了碰撞检测
            boolean pong = shells[i].getRec().intersects(p1.getRec());
            if (pong) {
                // System.out.println("plane is be heated");
                p1.live = false;
                //处理爆炸效果
                if (explore == null) {
                    explore = new Explore(p1.x, p1.y);
                }

                explore.drawMyself(g);

            }
        }


    }

    //初始化窗口,它继承了Frame,所以可以直接使用它的方法
    public void launchFrame() {
        this.setTitle("飞机大战");
        setVisible(true);
        setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        setLocation(400, 100);
        //需要关闭窗口，建立一个匿名内部类
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();//启动重画窗口的线程
        this.addKeyListener(new KeyMonitor());//启动键盘监听
        //初始化10个炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i] = new Shell();
        }
    }
    public  void drawTime(Graphics g){
        Color c = g.getColor();
        Font f=g.getFont();
        g.setColor(Color.green);
        if (p1.live) {
            period = (System.currentTimeMillis() - start.getTime()) / 1000;
            g.drawString("hold " + period, 30, 50);
        } else {
            if (end == null) {
                end = new Date();
                period = (end.getTime() - start.getTime()) / 1000;
            }
            g.setColor(Color.pink);
            g.setFont(new Font("微软雅黑", Font.BOLD, 30));
            g.drawString("end time :" + period, 200, 200);
        }
        g.setColor(c);
        g.setFont(f);

    }

    /*定义一个内部类,可以直接使用外部类的方法，它使用了外部类frame里的repaint方法
    重画了一个窗口的线程类
     */
    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(50);//1s=1000ms,1s画20次
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //内部类，实现键盘的监听
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            //       System.out.println("press "+e.getKeyCode());
             /*
             if(e.getKeyCode()==KeyEvent.VK_LEFT){
                 left=true;
             }if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                 right=true;

             }*/
            p1.addDirection(e);


        }

        @Override
        public void keyReleased(KeyEvent e) {
            //   System.out.println("release"+e.getKeyCode());
             /*
             if(e.getKeyCode()==KeyEvent.VK_LEFT){
                 left=false;
             }*/
            p1.minusDirection(e);
        }
    }

    /*
 private  Image offScreenImage =null;
    public void update(Graphics g){
        if(offScreenImage ==null)
            offScreenImage =this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        Graphics gOff=offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage,0,0,null);

    }

*/
    public static void main(String[] args) {
        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }

}