package FundamentalsTesting.advanced.polymorphism;

public interface RemoteController {

    void enable(boolean action);

    default void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
