package FundamentalsTesting.advanced.interfaces.example1;

public class Square implements Shape {

    private double length;
    private double width;

    public Square (double lenghth) {
        this.length = lenghth;
   }


    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

}
