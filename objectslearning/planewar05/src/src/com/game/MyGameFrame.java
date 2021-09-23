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
    static int count =0;
    Plane p1= new Plane(plane,100,100,3);
    @Override
    public void paint(Graphics g) {//g 就是画笔
        System.out.println("draw count:"+count);
        count++;
      g.drawImage(bg,Constant.GAME_WIDTH,Constant.GAME_HEIGHT,null);

     p1.drawmyself(g);

    }

    //初始化窗口,它继承了Frame,所以可以直接使用它的方法
    public  void launchFrame(){
        this.setTitle("飞机大战");
        setVisible(true);
        setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        setLocation(400,100);
        //需要关闭窗口，建立一个匿名内部类
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
        new PaintThread().start();//启动重画窗口的线程
    }
    /*定义一个内部类,可以直接使用外部类的方法，它使用了外部类frame里的repaint方法
    重画了一个窗口的线程类
     */
     class PaintThread  extends Thread{
        @Override
        public  void run(){
            while (true){
                repaint();
                try {
                    Thread.sleep(50);//1s=1000ms,1s画20次
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

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
        MyGameFrame gameFrame= new MyGameFrame();
        gameFrame.launchFrame();
    }

}
