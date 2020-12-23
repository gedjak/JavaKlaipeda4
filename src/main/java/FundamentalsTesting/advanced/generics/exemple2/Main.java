package FundamentalsTesting.advanced.generics.exemple2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        Garage<Car> carGarage = new Garage<>(car);
        carGarage.repairVehicle();

        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);
        motorcycleGarage.repairVehicle();
    }
}
