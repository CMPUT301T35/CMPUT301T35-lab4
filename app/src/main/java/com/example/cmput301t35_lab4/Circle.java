package com.example.cmput301t35_lab4;

public class Circle extends Shape{
    private int radius;

    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Drawing a circle at: (" + getX() + ", " + getY() + ") with radius " + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
