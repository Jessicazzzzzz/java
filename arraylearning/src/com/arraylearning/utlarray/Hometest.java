package com.arraylearning.utlarray;

import java.util.Arrays;
import java.util.Scanner;

public class Hometest {



    public static void main(String[] args) {

        Goods staff1 = new Goods(1,"百战牌鼠标","BZ_001",99.21,0.9);
        Goods staff2 = new Goods(2,"键盘侠玩偶","WO_102",403.00,0.7);
        Goods  staff3 = new Goods(3,"实战java程序设计","BK_001",89.00,0.8);
        Goods  staff4 = new Goods(4,"高器牌西服","GQ_XF_12",700.00,0.5);
        Goods staff5 = new Goods(5,"大米牌手机","DM_PH_13",900.00,0.3);
        Goods[]  allinfo = new Goods[5];
      allinfo[0] = staff1;
      allinfo[1]=staff2;
      allinfo[2]=staff3;
      allinfo[3]=staff4;
      allinfo[4]=staff5;

       //比较数组内的数据，需要用Comparable接口，然后再改写内容
        Arrays.sort(allinfo);
        for(int i=0;i<allinfo.length;i++){

            System.out.println(allinfo[i]);

        }
        System.out.println();
        for(int i=0;i<allinfo.length;i++){
            allinfo[i].search(100);


        }








    }



}
//接口Comparable
class Goods implements Comparable{
    private int id;
    private String goodsName;
    private String type;
    private double price;
    private double discount;
    public Goods(){}

    public Goods(int id, String goodsName, String type, double price, double discount) {
        this.id = id;
        this.goodsName = goodsName;
        this.type = type;
        this.price = price;
        this.discount = discount;
    }
    //创建一个方法，如果输入价格大于购买就返回所有商品
    public void search(double i){
        if(i<getFinalPrice()){
            System.out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + getId() +
                ", goodsName='" + getGoodsName()+ '\'' +
                ", type='" + getType()+ '\'' +
                ", price=" + getPrice()+
                ", discount=" + getDiscount() +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  double getDiscount(){
        return  discount;
    }
    public double getFinalPrice() {
        return this.price*discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
//改写，然后就可以根据需求排序，这个是根据getPrice排序
   public  int compareTo(Object o){
        Goods m = (Goods) o;
        if(this.getPrice()<m.getPrice()){
            return -1;
        }
        if(this.getPrice()>m.getPrice()){
            return  1;
        }
        return  0;
   }
}