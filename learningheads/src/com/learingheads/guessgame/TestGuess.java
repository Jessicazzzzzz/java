package com.learingheads.guessgame;

public class TestGuess {
    public static void main(String[] args) {
      GuessGame game =new GuessGame();
      game.startGame();
    }
}
 class Player{
    int number =0;
    public  void guess(){
        number =(int)(Math.random()*10);
        System.out.println("i am guessing number:"+number);
    }
}
class GuessGame{
    Player p1=new Player();
    Player p2=new Player();
    Player p3=new Player();
    int guessp1;
    int guessp2;
    int guessp3;
    public  void startGame(){
        boolean p1list = false;
        boolean p2list = false;
        boolean p3list = false;
        int targetnumber = (int)(Math.random()*10);
        System.out.println("iam thinking of a number from 0 to 10");
        while(true){
            System.out.println("number to guess is "+targetnumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1=p1.number;
            System.out.println("player1 number:"+guessp1);
            guessp2=p2.number;
            System.out.println("player2 number:"+guessp2);
            guessp3=p3.number;
            System.out.println("player3 number:"+guessp3);
            if(guessp1==targetnumber){
                p1list=true;
            }if(guessp2==targetnumber){
                p2list=true;
            }if(guessp3==targetnumber){
                p3list=true;
            }
            if(p1list||p2list||p3list){
                System.out.println("we hava winner");
                System.out.println("player1 got it right?"+p1list);
                System.out.println("player2 got it right?"+p2list);
                System.out.println("player3 got it right?"+p3list);
                break;//这个out of loop
            }else
            {
                System.out.println("players need to try again.");
            }

        }
    }


}
