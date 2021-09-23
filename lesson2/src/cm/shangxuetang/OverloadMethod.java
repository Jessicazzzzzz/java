package cm.shangxuetang;

public class OverloadMethod {

    public static  int add(){
        return 0;
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
       int n= add();
        int m=add(2,3);
        System.out.println("add()="+n);
        System.out.println("add(2,3)="+m);

    }

}
