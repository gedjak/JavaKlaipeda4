package FundamentalsTesting.homework.shapeHomework;

public class Rectangle extends RightAngleRectangle {

    RightAngleRectangle b = new RightAngleRectangle(getShapeDescription(), getWidth(), getHeight());

    public Rectangle(double width, double height) {
        super("Rectangle", width, height);
    }

    public double getTriangleArea() {
        return b.getHeight() * b.getWidth() / 2;
    }

    public double getRectangleArea() {
        return b.getHeight() * b.getWidth();
    }


}
