package com.example.cypher;

public class Triangle extends Shape {
    private int base;
    private int height;
    private int side1;
    private int side2;

    public Triangle(int x, int y, int base, int height) {
        super(x, y);
        this.base = base;
        this.height = height;
        this.side1 = this.side2 = calculateSide();
    }

    public Triangle(int x, int y, int base, int height, int side1, int side2) {
        super(x, y);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() { return 0.5 * base * height; }
    public int getPerimeter() { return base + side1 + side2; }

    private int calculateSide() {
        return (int) Math.sqrt(((double) base / 2) * ((double) base / 2) + height * height);
    }

}
