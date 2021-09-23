package com.arraylearning;

public class Test1 {
    public static void main(String[] args) {


    //静态初始化必须在声明后直接初始化
      Man[] mans = {new Man(01,"a"),
                 new Man(02,"b"),
            new Man(03,"c"),
        new Man(04,"d"),
                new Man(05,"e")

    };
      //数组的copy
      Man[] mans1 = new Man[5];
      System.arraycopy(mans,0,mans1,0,mans.length);
      for(Man x:mans1){
          System.out.println(x);
      }


      for (int i=0;i<mans.length;i++){
          Man m = mans[i];
          System.out.println(m);
      }
      //把数组mans遍历一遍，然后将每一m取出来给对象Man
        //它一般用于读取
      for( Man  m:mans){
          System.out.println(m);
      }
}

}
class Man{
    private int id;
    private String name;

    public int getId() {
        return id;
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
    //重写，本来是打印hashcode
    public String toString(){
        return "id"+id+",name"+this.name;
    }
    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //如果你创建了有参数的构造器，那么无参数的就需要你自己加
    public  Man(){

    }
}
