package FundamentalsTesting.advanced.classes.nonStaticClasses;

public class Bicycle {
    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // butina sukurti isorine klase (inner Class)
    public class  Wheel {
        public void damage() {
            maxSpeed *= 0.5;
        }
    }

}

