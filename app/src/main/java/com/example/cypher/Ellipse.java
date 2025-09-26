package com.example.cypher;

public class Ellipse extends Shape{
    public Ellipse(int major_axis,int minor_axis){
        super(major_axis,minor_axis);
    }
    public Float Ellipse_area(int major_axis,int minor_axis){
        Float Area= (float) (3.14 * major_axis*minor_axis);
        return Area;

    }
}
