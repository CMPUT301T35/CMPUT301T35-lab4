package com.example.cmput301t35_lab4;

public class Square extends Shape{
    int length;
    public Square (int x, int y) {
        super(x, y);
        this.length = x;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
