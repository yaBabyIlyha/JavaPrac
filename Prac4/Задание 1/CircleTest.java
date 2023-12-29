public class CircleTest {
    public static void main(String[] args){
        Circle circle = new Circle(0.5);

        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());

        circle.setRadius(0.7);

        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
    }
}
