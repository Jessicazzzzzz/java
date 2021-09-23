package com.hhhh;

public class Test2 {

    public  static void main(String[]args){
        int a= 2;
        int b =3;
        boolean c = a<b;
        System.out.println(c);

        char ch= 'h';
        System.out.println("ch="+ch);
        System.out.println("ch="+(int)ch);

        //boolean
        boolean f1= true;
        boolean f2= false;
        System.out.println(f1&f2);
        System.out.println(f1|f2);
        System.out.println(!f1);
        System.out.println(f1^f2);

        //int n = 3/0;这个会报错
        boolean n3= 1>2 && (4<3/0);
        //因为&&运算符，如果前面是false ,那么后面结果就一定是false,不需要计算了，就是后面是
        //错的，也不会报错
        System.out.println(n3);

        //位操作
        int i = 7;
        int g = 8;
        System.out.println("7&8="+(i&g));//0111&1000=0000
        System.out.println("7|8="+(i|g));//0111 | 1000=1111
        System.out.println("7^8="+(i^g));//0111 ^1000 = 1111
        System.out.println("~8="+(~g));

        //移位，<< =*2,>> =/2
        int c5 = 5 <<2;//5左移*2，= 5*2*2
        System.out.println("5<<2="+c5);
        System.out.println(40>>3);
        //测试字符串

        char c1 ='h';
        char c2 ='i';
        System.out.println(""+c1+c2);//通过加个空字符就可以打出string，不然就是数字


        int k=97;
        System.out.println((char)k);

        //关于溢出的问题
        int money = 10_0000_0000;//int range 20亿左右
        int years =20;
        int total1 = money*years;//200亿啦，不会报错，但是会溢出，因为它们*后，还是个int 类型
        long total2 = money *(long)years;//只要强制转换后，就会跟着容量的走
        System.out.println(total1);
        System.out.println(total2);

        long heartBeat=100L*60*24*365*80;//需要强制转化，不然就会溢出，因为都是int类型
        System.out.println(heartBeat);

    }
}
