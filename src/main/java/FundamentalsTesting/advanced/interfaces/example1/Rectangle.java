package FundamentalsTesting.advanced.interfaces.example1;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle (double lenghth, double width) {
        this.length = lenghth;
        this.width = width;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return length + width * 2;
    }

}
