package FundamentalsTesting.homework.daugiakampiaiHomework;

public class Square implements RegularPolygon {

    private double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double getNumSides(){
        return 4;
    }
    @Override
    public double getSideLength(){
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
    public double getSquareArea(){
        double area = Math.pow(getSideLength(), 2);
        return area;
    }
    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideLength=" + sideLength +
                ", perimeter=" + getPerimeter() +
                ", area=" + getSquareArea() +
                '}';
    }

}
