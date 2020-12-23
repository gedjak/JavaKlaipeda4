package FundamentalsTesting.advanced.inheritance.vehicleExample;

public class Car extends Vehicle{
    private String model;

    public Car(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }
    public  String getModel() {
        return model;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model=" + model + '\'' +
                "maxSpeed='" + maxSpeed +
                '}' ;
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed * 15;
    }
}
