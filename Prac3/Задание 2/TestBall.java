package prac2.ex2;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(13,14);
        Ball b2 = new Ball(); b2.setXY(20,22); b2.move(1,3);
        System.out.println(b1);
        System.out.println(b2);
    }
}
