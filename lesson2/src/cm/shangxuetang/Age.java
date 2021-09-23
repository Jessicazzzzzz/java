package cm.shangxuetang;

public class Age {
    public static void main(String[] args) {
        int age = (int)(Math.random()*100);
        System.out.print("age="+age+" ,");
        if(age<10){
            System.out.println("go to play");
        }else if (age<20){
            System.out.println("got to study");
        }else if (age<30){
            System.out.println("got to work");
        }else if (age<40){
            System.out.println("got to marry");
        }else if(age<50){
            System.out.println("still need work");
        }else if(age<60){
            System.out.println("need work ");
        }else {
            System.out.println("enjoyed life now");
        }

        int grade =1;
        switch (grade){
            case 1:
                System.out.println("year 1");
                break;
            case 2:
                System.out.println("year 2");
                break;
            case 3:
                System.out.println("year 3");
                break;
            case 4:
                System.out.println("year 4");
                break;
            default:
                System.out.println("bye");
                break;
        }

         int month =2;
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("autumn");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("summer");
                break;



        }
    }
}
