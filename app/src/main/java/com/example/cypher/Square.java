package com.example.cypher;

public class Square extends Shape {
    private int sideLength;
    
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }
    
    public int getSideLength() {
        return sideLength;
    }
    
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
    
    // Optional: method to calculate area
    public int getArea() {
        return sideLength * sideLength;
    }
    
    // Optional: method to calculate perimeter
    public int getPerimeter() {
        return 4 * sideLength;
    }
}