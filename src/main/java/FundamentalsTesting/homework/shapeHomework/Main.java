package FundamentalsTesting.homework.shapeHomework;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 15);
        Rectangle rectangle = new Rectangle(5,2);



        System.out.println(circle.getArea());
        System.out.println(rectangle.toString());
    }
}
