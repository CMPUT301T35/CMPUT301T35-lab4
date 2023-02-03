package com.example.cmput301t35_lab4;

public class Square1 extends Shape{
    int length;
    public Square1 (int x, int y) {
        super(x, y);
        this.length = x;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
