package cm.shangxuetang;

public class Factoire {

    public static void main(String[] args) {
        //while 写递归
        long result1 =1;
        long result2 =1;
        int n=10;
        while(n>0){
            result1 *=n;
            n--;
        }
        System.out.println(result1);
        n=10;
        while(n>0){
            result2 *=n*(n-1);
            n-=2;//每次都是两个数
        }
        System.out.println(result2);


        long d1= System.currentTimeMillis();
        long result = factorial(5);
        long d2=System.currentTimeMillis();
        System.out.println("the result is :"+result);
        System.out.println("cost time :"+(d2-d1));//电脑太快，显示为0

        long  boresult= bo(6);
        System.out.println(boresult);
    }
    static  long factorial(int n){
        if(n==1)
            return 1;
        else{
            return  n*factorial(n-1);
        }
    }
//1,1,2,3,5,8,13
    static  long bo(int i){
        if(i==1||i==2)
            return  1;
        if(i==0)
            return  0;
        return  bo(i-1)+bo(i-2);
    }
}
