package FundamentalsTesting.homework.Generics;

public class TwoItemsMain {
    public static void main(String[] args) {
        TwoItems<String> word = new TwoItems<>("One", "Two");
        TwoItems<Integer> number = new TwoItems<>(4, 9);
        System.out.println(word.toString());
        System.out.println(number.toString());
    }
}