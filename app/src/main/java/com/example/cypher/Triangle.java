package com.example.cypher;

public class Triangle extends Shape {
    private int base;
    private int height;
    private int side1;
    private int side2;

    public Triangle(int x, int y, int base, int height) {
        super();
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
        // For simplicity, assuming it's an isosceles triangle
        this.side1 = this.side2 = calculateSide();
    }

    public Triangle(int x, int y, int base, int height, int side1, int side2) {
        super();
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    // Optional: method to calculate area
    public double getArea() {
        return 0.5 * base * height;
    }

    // Optional: method to calculate perimeter
    public int getPerimeter() {
        return base + side1 + side2;
    }

    // Helper method to calculate side length for isosceles triangle
    private int calculateSide() {
        return (int) Math.sqrt(((double) base /2) * ((double) base /2) + height * height);
    }
}