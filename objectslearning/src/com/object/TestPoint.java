package com.object;

class Point {
    double x,y;
    public Point(double _x, double _y){
        x = _x;
        y = _y;
    }
    public  double getDistance(Point p){
        return  Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));//注意优先级，需要大括号
    }

}
public class TestPoint{
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        Point origin = new Point(0,0);
        System.out.println(p.getDistance(origin));

    }

}


