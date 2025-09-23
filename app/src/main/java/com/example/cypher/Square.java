public class Circle extends Shape {
    private int radius;
    
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
}