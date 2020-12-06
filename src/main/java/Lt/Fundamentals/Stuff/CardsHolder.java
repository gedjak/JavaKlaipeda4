package Lt.Fundamentals.Stuff;

public class CardsHolder {
    public static void main(String[] args) {
        Card[] card = new Card[3];
        card[0] = new Card("John", "Smith", "LT1233", true, 29);
        card[1] = new Card("Johnathon", "Smitters", "LT1234", true, 28);
        card[2] = new Card("Matt","Dingull","LT6666",false,900);
        int activeCards = 0;
        int availableSlots = 0;

        for (Card value : card) {
            if (value != null) { activeCards += 1;
            } else {
                availableSlots += 1;
            }
        }
        System.out.println("Active cards: " + activeCards);
        System.out.println("Available: " + availableSlots);





    }

}
