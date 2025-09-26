package com.example.cypher;

public abstract class Shape {

    protected int x; 
    protected int y; 
    protected String color = "$PUT_YOUR_CHOICE_OF_COLOR";

    public Shape(int x , int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
