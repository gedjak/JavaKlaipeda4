package FundamentalsTesting.advanced.interfaces.example2;

public class Main {
    public static void main(String[] args) {

        Baloon baloon = new Baloon(54);
        Plane plane = new Plane(580);

        System.out.println("Baloon max speed: " + baloon.maxSpeed());
        System.out.println("plane max speed: " + plane.maxSpeed());

        System.out.println(baloon.canFly("bad"));
        System.out.println(plane.canFly("bad"));

        AirTransport transport = new Baloon(1); //polymorfizmas kai kuriama is abstrakciu klasiu arba interface
        Fly transport2 = new Plane(5);

    }
}
