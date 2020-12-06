package Lt.Fundamentals.Stuff;

public class MainDujinisKatilas {
    public static void main(String[] args) {
DujinisKatilas kat = new DujinisKatilas("Bosch", "Black");
        System.out.println(kat.getColour());

        DujinisKatilas kat1 = new DujinisKatilas("bu", "red");
        kat1.setModelis("publ");

        DujinisKatilas.setColour("purpule");

        System.out.println(kat.getColour());

    }
}
