package com.example.cmput301t35_lab4;

public class Square extends Shape{
    private int side;

    public Square(int x, int y, int side){
        super(x, y);
        this.side = side;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public void draw(){
        System.out.println("Drawing a square at: (" + getX() + ", " + getY() + ") with side length " + side);
    }

    @Override
    public double area() {
        return side * side;
    }
}
