package com.example.cmput301t35_lab4;

public class Circle extends Shape{
    private int radius;
    public Circle(int x, int y) {
        super(x, y);
        this.radius = y - x;
    }

    @Override
    public double area() {
        return Math.pow(radius,2) * Math.PI;
    }
}
