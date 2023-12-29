package prac3.Movable;

public class MovableRectangle implements Movable {

    protected MovablePoint topLeft;
    protected MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "topLeft(x,y): " + topLeft.x + ", " + topLeft.y + "\nbottomRight(x,y): " + bottomRight.x + ", " + bottomRight.y;
    }

    public void moveUp(){
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown(){
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveRight(){
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void moveLeft(){
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
}
