package prac3.Movable;

public class TestMovable {
    public static void main(String[] args){

        MovableCircle Circle = new MovableCircle(1,2,1,1,3);
        Circle.moveUp();
        System.out.println(Circle);

        MovablePoint Point = new MovablePoint(2,3,2,1);
        Point.moveLeft();
        System.out.println(Point);

        MovableRectangle Rectangle = new MovableRectangle(2,2,4,4,1,1);
        Rectangle.moveUp();
        System.out.println(Rectangle);
    }
}
