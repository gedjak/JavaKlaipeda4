package FundamentalsTesting.advanced.generics.exemple2;

public class Garage<T extends Vehicle> {

    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void repairVehicle() {
        vehicle.repair();
    }
}
