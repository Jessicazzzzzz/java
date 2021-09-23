package cm.shangxuetang;

public class Dice {
    public static  void main(String[] arg){
        //double d = Math.random();//生成【0 1）包括0，不包括1的随机数
        int a = 1+ (int)(Math.random()*6);//强制转化，range (1~6)
        int b = 1+ (int)(Math.random()*6);
        int c = 1+ (int)(Math.random()*6);
        int t= a+b+c;
        if(t>15){
            System.out.println(t);
            System.out.println("good job!");
        }else if(t>10&&t<15)
        {System.out.println(t);
            System.out.println("not bad!");
        }else
        {System.out.println(t);
            System.out.println("try again");
        }

    }
}
