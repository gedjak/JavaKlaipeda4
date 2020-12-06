package Lt.Fundamentals.Stuff;

public class Card {

    private String firstName;
    private String lastName;
    private String cardNumber;
    private boolean isWorking;
    private double balance;
    private double topUp;
    private double takeOut;


    public Card(
            String firstName, String lastName, String cardNumber, boolean isWorking, double balance
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.isWorking = isWorking;
        this.balance = balance;
    }


    public void setTakeOut(double takeOut) {
        this.takeOut = takeOut;
    }


    public void setTopUp(double topUp) {
        this.topUp = topUp;
    }


    public double getTopUp() {
        return this.topUp;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public double getBalance() {
        if (balance - takeOut + topUp < 0) {
            System.out.println("you are trying to take: " + this.takeOut + "; available: " + (balance + topUp));
            return balance + topUp;
        } else {
            System.out.println("your current balance is: ");
            return balance - takeOut + topUp;
        }
    }

}



