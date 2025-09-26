package com.example.cypher;

public class Hexagon extends Shape {
    private int side;

    public Hexagon (int x, int y, int side){
        super (x,y);
        setSide(side);
    }

    public int getSide (){
        return side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("side must be > 0");
        }
        this.side = side;
    }

    public double getPerimeter (){
        return 6*side;
    }

    public double getArea(){
        return (3.0 * Math.sqrt(3.0) / 2.0) * side * side;
    }

}
