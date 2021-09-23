package com.object.interface1;
//一定要实现接口，因为接口是规范，然后你就需要将它实现
public class SuperMan implements Volant,Honest{
    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void stop() {
        System.out.println("stop slowly");
    }

    @Override
    public void helpothers() {
        System.out.println("always help each others");
    }
}
