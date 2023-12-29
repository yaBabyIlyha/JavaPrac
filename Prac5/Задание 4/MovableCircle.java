package prac3.Movable;

public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "Circle(x,y): " + center.x + ", " + center.y;
    }

    public void moveUp(){
        center.moveUp();
    }

    public void moveDown(){
        center.moveDown();
    }

    public void moveRight(){
        center.moveRight();
    }

    public void moveLeft(){
        center.moveLeft();
    }
}
