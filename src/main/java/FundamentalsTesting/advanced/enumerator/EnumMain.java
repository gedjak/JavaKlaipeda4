package FundamentalsTesting.advanced.enumerator;

import java.util.Locale;

public class EnumMain {
    public static void main(String[] args) {


    String coffee = "Latte";
    Coffee coffeeEnum = Coffee.valueOf(coffee.toUpperCase());

        System.out.println(coffeeEnum);
        System.out.println(Coffee.AMERICANO);

        System.out.println(AutoMakers.VOLVO.getCarName());
    }
}
