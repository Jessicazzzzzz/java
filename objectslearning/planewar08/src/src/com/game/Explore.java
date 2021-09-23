package src.com.game;

import java.awt.*;

/*
定义爆炸类
 */
public class Explore {
    double x,y;
    //静态初始化
    static Image[] imgs =new  Image[6];
    int count;
    static {
        for(int i=0;i<6;i++){
            imgs[i]=Gameutil.getImage("images/bomb/bom"+(i+1)+".png");
            imgs[i].getWidth(null);
        }
    }
    //画爆炸
    public  void drawMyself(Graphics g){
        if(count<6){
            g.drawImage(imgs[count],(int)x,(int)y,null);
            count++;
        }

    }
    public  Explore(){

    }

    public Explore(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
