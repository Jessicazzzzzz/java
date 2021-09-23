package src.com.game;

import java.awt.*;

/*
游戏物体的根类
 */
public class GameObject {
    Image img;//图片
    double x, y;//物体的坐标
    int speed;//物体移动的速度
    int height, width;//物体的高度和宽度
     public  GameObject(){}
    public GameObject(Image img, double x, double y, int speed, int height, int width) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.height = height;
        this.width = width;
    }

    public GameObject(Image img, double x, double y, int speed) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width=img.getWidth(null);
        this.height=img.getHeight(null);
    }

    public void drawmyself(Graphics g) {
        g.drawImage(img, (int) x, (int) y, width, height, null);
    }

    //所有的物体都是矩形，可以测试碰撞
    public Rectangle getRec() {
        return new Rectangle((int) x, (int) y, width, height);

    }
}

