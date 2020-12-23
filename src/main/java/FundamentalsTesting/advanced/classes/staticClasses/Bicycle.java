package FundamentalsTesting.advanced.classes.staticClasses;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //galima sukuruti ir be isorines klases (Nested Class)
    public static class Mechanic {
        public void upgrade(Bicycle bicycle) {
            bicycle.maxSpeed += 3;
        }
    }
}
