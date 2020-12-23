package FundamentalsTesting.homework.shapeHomework;

public class RightAngleRectangle extends Shape {
    private double width;
    private double height;

    public RightAngleRectangle(String shapeDescription, double width, double height){
        super(shapeDescription);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
