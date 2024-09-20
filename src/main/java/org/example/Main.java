package org.example;

public class Main {
    public static void main(String[] args) {
        Square a = new Square(2);
        Square b = new Square(3);
        System.out.println(a.compareArea(b));
    }
}