package com.hhhh;

import javax.swing.*;
import java.awt.*;



    public class BallGame extends JFrame {

        Image desk =Toolkit.getDefaultToolkit().getImage("image/tableball.png");
        Image ball =Toolkit.getDefaultToolkit().getImage("images/ball.png");
         double x =200;
         double y =200;
         boolean right = true;

        public void paint(Graphics g){
            System.out.println("draw one time!");
            g.drawImage(desk,0,0,null);
            g.drawImage(ball,(int)x,(int)y,null);
            if(right){
                x=x+10;
            }else{
                x=x-10;
            }

            if(x>858){
                right =false;
            }
            if(x<0){
                right = true;
            }
        }
        void launchFrame(){
            setSize(  858,  476);
            setLocation( 100, 100);
            setVisible(true);
            while(true){
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String [] args){

            System.out.println("MY GAME STARTS!");
            BallGame game =new BallGame();
            game.launchFrame();
        }

    }


