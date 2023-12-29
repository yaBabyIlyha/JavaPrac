package prac3.Shape1;

public class Circle extends Shape2 {
    protected double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double r){
        this.radius = r;
    }

    public Circle(double r, String c, boolean f){
        this.radius = r;
        this.color = c;
        this.filled = f;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 3.14 * this.radius * 2;
    }

    public String toString(){
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
