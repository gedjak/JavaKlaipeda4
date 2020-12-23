package FundamentalsTesting.advanced.interfaces.example2;

public class Plane extends AirTransport implements  Fly {

    public Plane(int speed) {
        super(speed);
    }

    @Override
    public int maxSpeed() {
        return speed;
    }

    @Override
    public boolean canFly(String condition) {
        return true;
    }
}
