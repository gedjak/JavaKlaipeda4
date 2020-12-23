package FundamentalsTesting.advanced.interfaces.example1;

public class Main {
    public static void main(String[] args) {

Square square = new Square(3);
        System.out.println("Plotas " + square.getArea());
        System.out.println("perimetras " + square.getPerimeter());

    Rectangle rectangle = new Rectangle(5,5);
        System.out.println(rectangle.getArea());
    }

}
