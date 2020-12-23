package FundamentalsTesting.homework.deliveries;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[]{
                new Person("James", "Buga St. 4 ", GadgetType.TV, LocalDate.of(2020, 12, 27)),
                new Person("Jonathan", "Garga St. 2 ", GadgetType.LAPTOP, LocalDate.of(2020, 12, 27)),
                new Person("Jame", "Laga St. 24 ", GadgetType.PHONE, LocalDate.of(2020, 12, 27))
        };



    }
}
