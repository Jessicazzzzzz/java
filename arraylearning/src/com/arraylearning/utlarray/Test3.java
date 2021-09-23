package com.arraylearning.utlarray;

/*
使用javabean和数组存储表格信息
 */
public class Test3 {
    public static void main(String[] args) {


        Emp emp0 = new Emp(1001, "gao1", 18, "program", "2009-10-10");

        Emp emp1 = new Emp(1002, "gao2", 28, "program", "2009-10-10");
        Emp emp2 = new Emp(1003, "gao3", 38, "program", "2009-10-10");

        //way1
       // Emp[] emps={emp0,emp1,emp2};
        Emp[] emps = new Emp[3];
        emps[0] = emp0;
        emps[1] =emp1;
        emps[2] =emp2;
        for(int i=0;i< emps.length;i++){
            //toString()method不需要打出来了
            System.out.println(emps[i]);
        }

    }
}
class Emp{
    private  int id;
    private String name;
    private int age;
    private  String job;
    private String hiradate;
    public Emp(){}

    public Emp(int id, String name, int age, String job, String hiradate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hiradate = hiradate;
    }

    @Override
    public String toString() {
        //use getId 比较好，便于程序修改
        return "Emp{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", hiradate='" + hiradate + '\'' +
                '}';
    }

    public String  getId() {
        return id+"号";
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiradate() {
        return hiradate;
    }

    public void setHiradate(String hiradate) {
        this.hiradate = hiradate;
    }
}