package prac1.ball;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Nike", "white", 2016);
        Ball b2 = new Ball("Adidas", "black");
        Ball b3 = new Ball("Nike",2004); b3.setColor("red");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
