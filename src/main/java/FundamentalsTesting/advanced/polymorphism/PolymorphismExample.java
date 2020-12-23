package FundamentalsTesting.advanced.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        RemoteController remote = new TvRemoteController();
        remote.enable(true);

        remote = new AcRemoteController();
        remote.enable(false);

        remote.print();


    }
}
