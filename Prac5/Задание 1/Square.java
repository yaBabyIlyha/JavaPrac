package prac3.Shape1;

public class Square extends Rectangle {

    public Square(){
        width = 0;
        length = 0;
    }

    public Square(double s){
        width = s;
        length = s;
    }

    public Square(double s, String c, boolean f){
        width = s;
        length = s;
        color = c;
        filled = f;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double s){
        width = s;
        length = s;
    }
    public String toString(){
        return "Square: " + width + " x " + length;
    }
}
