package prac3.Shape1;

public class TestShape {
    public static void main(String[] args){
        Shape2 s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(((Circle) s1).getArea());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        Shape2 s2 = new Square();
        Shape2 s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength());
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape2 s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());
        System.out.println(r2.getLength());
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
