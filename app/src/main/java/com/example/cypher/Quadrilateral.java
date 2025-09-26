package com.example.cypher;

public class Quadrilateral extends Shape{

    protected int x2, y2;
    protected int x3, y3;
    protected int x4, y4;

    public Quadrilateral(int x1, int y1,
                         int x2, int y2,
                         int x3, int y3,
                         int x4, int y4){

        super(x1,y1);
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;

        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;

    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getX4() {
        return x4;
    }

    public int getY4() {
        return y4;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }
}

