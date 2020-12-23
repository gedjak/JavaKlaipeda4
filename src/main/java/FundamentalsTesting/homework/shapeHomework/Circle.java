package FundamentalsTesting.homework.shapeHomework;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeDescription ,double radius){
        super(shapeDescription);
        this.radius = radius;
    }
     public double getArea(){
        return Math.PI * radius * radius;
     }
     public double getPerimeter(){
        return 2 * Math.PI * radius;
     }



}
