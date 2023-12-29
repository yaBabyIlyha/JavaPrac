package prac1.ball;

public class Ball {
    private String name;
    private String color;
    private int year;
    public Ball(String n, String c, int y){
        name = n;
        color = c;
        year = y;
    }
    public Ball(String n, String c){
        name = n;
        color = c;
        year = 0;
    }
    public Ball(String n, int y){
        name = n;
        color = "unknown";
        year = y;
    }
    public void setName(String n){
        name = n;
    }
    public void setColor(String c){
        color = c;
    }
    public void setName(int y){
        year = y;
    }
    public String toString(){
        return "Name: " + name + "\tColor: " + color + "\tYear: " + year;
    }
}
