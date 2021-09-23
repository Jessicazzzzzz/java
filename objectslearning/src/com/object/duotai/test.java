package com.object.duotai;



public class test {
 static void animalCry(Animal a){
        a.shout();//多态，animal 是super,dag ,cat 都是child
    }

    public static void main(String[] args) {
        Dog d= new Dog();
        animalCry(d);//animal a =d
        animalCry(new Cat());
        //向上类型转换，自动的,必须这一步，它可以编译通过
        //编译器只看Animal a 是否合法
       Animal a= new Dog();
       // a.watchDog();不能直接调用方法，虽然上面可以编译通过，但是它不能调用子类的方法
        //需要 通过强制转换
        System.out.println("a.shout():");
        a.shout();

       Dog d1= (Dog) a;//向下转换
      d1.watchDoor();
       // Cat c1 =(Cat) a;java.lang.ClassCastException,这时候a=dog
        //c1.catMouse();
        //[对象instanceof 类],对象也是实例
        System.out.println(a instanceof  Dog);
        if (a instanceof Dog){
            Dog d2 = (Dog) a;
            d2.watchDoor();
        }else if(a instanceof  Cat){
            Cat c1 = (Cat) a;
            c1.catMouse();
        }



    }
}
