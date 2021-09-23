package src.com.game;

import java.awt.*;

public class Shell extends GameObject{
    double degree;//增加角度，炮弹沿着指定的角度
    public Shell(){
        x=200;
        y=200;
        degree =Math.random()*Math.PI*2;
        width=10;
        height=10;
        speed =7;
    }

    @Override
    public void drawmyself(Graphics g) {
       // super.drawmyself(g);
        Color c=g.getColor();
        g.setColor(Color.red);
        g.fillOval((int)x,(int)y,width,height);
        g.setColor(c);
        //根据自己的路径来计算炮弹的路径
        x  += speed*Math.cos(degree);
        y  +=speed*Math.sin(degree);
        //碰到边界改变方向，x 角度是取反，y角度是pi-degree
        if(y>Constant.GAME_HEIGHT-this.height||y<40){
            degree=-degree;
        }
        if(x<0||x>Constant.GAME_WIDTH-this.width){
            degree= Math.PI-degree;
        }

    }
}
