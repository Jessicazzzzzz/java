package src.com.game;

import java.awt.*;

public class Plane extends GameObject{
    @Override
    public void drawmyself(Graphics g) {
        super.drawmyself(g);
        //飞机的算法，怎么飞

        x +=speed;
    }

    public Plane(Image img, double x, double y, int speed) {
        super(img, x, y, speed);
    }
}
