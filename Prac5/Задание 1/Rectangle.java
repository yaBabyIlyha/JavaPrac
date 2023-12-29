package prac3.Shape1;

public class Rectangle extends Shape2 {

    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(double w, double l, String c, boolean f){
        this.width = w;
        this.length = l;
        this.color = c;
        this.filled = f;
    }

    public Rectangle(double w, double l){
        this.width = w;
        this.length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return this.width*2 + this.length*2;
    }
}
