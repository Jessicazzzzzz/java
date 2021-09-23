package src.com.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/*
游戏的工具类
 */
public class Gameutil {
    //构造器私有，防止别人用
    private  Gameutil(){

    }
   public static Image getImage(String path){
      Image img=null;
    URL u=Gameutil.class.getClassLoader().getResource(path);
      try {
        img= ImageIO.read(u);
      } catch (IOException e) {
         e.printStackTrace();
      }
      return  img;
   }

    public static void main(String[] args) {
        Image img = Gameutil.getImage("images/hero_blowup_n3.png");
        System.out.println(img);
    }

}
