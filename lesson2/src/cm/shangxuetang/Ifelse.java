package cm.shangxuetang;

public class Ifelse {
    public static void main(String[] args) {
        double r = Math.random()*4;
        double area = Math.PI * r *r;
        double circle =Math.PI *2*r;

        if (area>=circle){
            System.out.println("area="+area+"\tcircle="+circle);
            System.out.println("area>=circle");
        }else {
            System.out.println("area="+area+"\tcircle="+circle);
            System.out.println("area<circle");
        }
    }
}
