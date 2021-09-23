package com.learingheads;

public class Phrase {

    public static void main(String[] args) {
	String[]  wordListOne= {"24/7","multitier","30000 foot"};
    String[]  wordListTwo= {"empower","oriented","leveraged"};
    String[]  wordListThree= {"process","solution","mission"};
    int onelength = wordListOne.length;
    int twolength =wordListTwo.length;
    int threelength = wordListThree.length;
    int read1= (int)(Math.random()*onelength);
        int read2= (int)(Math.random()*twolength);
        int read3= (int)(Math.random()*threelength);
        String phrase = wordListOne[read1]+" "+wordListTwo[read2]+" "+wordListThree[read3];
        System.out.println(onelength);
        System.out.println("what we need is a "+phrase);
    }
}
