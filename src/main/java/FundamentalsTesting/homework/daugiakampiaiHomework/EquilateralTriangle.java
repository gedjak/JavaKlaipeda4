package FundamentalsTesting.homework.daugiakampiaiHomework;

public class EquilateralTriangle implements RegularPolygon {

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }


    @Override
    public double getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }


    public double getPerimeter() {
        double perimeter = getNumSides() * getSideLength();
        return perimeter;
    }

    public double getInteriorAngle() {
        double interiorAngle = (getNumSides() - 2) * 180;
        return interiorAngle;
    }

    public double getTriangleArea() {
        double area = (Math.pow(getSideLength(),2) * Math.sqrt(3)) / 4;
    return area;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideLength=" + sideLength +
                ", perimeter=" + getPerimeter() +
                ", area=" + getTriangleArea() +
                '}';
    }
}
