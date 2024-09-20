package org.example;

public class Square {
    double height;

    public Square(double height) {
        this.height = height;
    }
    public double area () {
        return (this.height * this.height);
    }
    public double compareArea (Square a){
        return this.area() - a.area();
    }
}
