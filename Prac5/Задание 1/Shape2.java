package prac3.Shape1;

public abstract class Shape2 {
    protected String color;
    protected boolean filled;

    public Shape2(){
        this.color = "unknown";
        this.filled = false;
    }

    public Shape2(String c, boolean f){
        this.color = c;
        this.filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
