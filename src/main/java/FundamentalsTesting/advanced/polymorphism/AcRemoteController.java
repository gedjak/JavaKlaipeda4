package FundamentalsTesting.advanced.polymorphism;

public class AcRemoteController implements RemoteController {

    @Override
    public void enable(boolean action) {
        System.out.println("Turning AC on -" + action);
    }

}
