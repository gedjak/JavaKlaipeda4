package FundamentalsTesting.advanced.classes.nonStaticClasses;

public class NestedNonStaticExemple {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(20);

        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.damage();

        System.out.println(bicycle.getMaxSpeed());
    }
}
