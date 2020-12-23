package FundamentalsTesting.advanced.interfaces.example2;

import java.util.Random;

public class Baloon extends AirTransport implements Fly {

    public Baloon(int speed) {
        super(speed);
    }

    @Override
    public int maxSpeed() {
        return 100 / speed * new Random().nextInt(5);
    }

    @Override
    public boolean canFly(String condition) {
        return condition.equals("good");
    }
}
