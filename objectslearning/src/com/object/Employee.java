package com.object;

import java.time.LocalDate;

public class Employee {
    public static void main(String[] args) {
        Employeee[] staff = new  Employeee[3];
        staff[0] = new Employeee("carl cracker",75000,1987,12,5);
        staff[1] =new Employeee("harry porty",76000,1987,10,5);
        staff[2]= new Employeee("tony test",78000,1987,9,5);
        //e 指向一个位置，循环staff 数组，每一个staff数组又指向一个对象employeee ，将e变量赋值个它
        for (Employeee e:staff)
            e.raiseSalary(5);
        for (Employeee  e:staff)
            System.out.println("name="+e.getName()+",salary+"+e.getSalary()+",hireday="+e.getHireday());


    }

}
class Employeee{
    private String name;
    private  double salary;
    private LocalDate hireday;
    public Employeee(String n,double s,int year,int month,int day){
        name =n;
        salary =s;
        hireday = LocalDate.of(year,month,day);
    }
    public  String getName(){
        return  name;
    }
    public double getSalary(){
        return  salary;
    }

    public LocalDate getHireday() {
        return hireday;
    }
    public void raiseSalary(double byPercent){
        double raise = this.salary *byPercent/100;
        this.salary +=raise;
    }
}
