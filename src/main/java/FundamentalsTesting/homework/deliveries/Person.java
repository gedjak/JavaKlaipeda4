package FundamentalsTesting.homework.deliveries;

import java.time.LocalDate;

public class Person {
    private String name;
    private String deliveryAddress;
    private GadgetType gadgetType;
    private LocalDate deliverUntil;

    public Person(String name, String deliveryAddress, GadgetType gadgetType, LocalDate deliverUntil) {
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.gadgetType = gadgetType;
        this.deliverUntil = deliverUntil;
    }

    public static Person[] person() {
        return new Person[]{
                new Person("James", "Buga St. 4 ", GadgetType.TV, LocalDate.of(2020, 12, 27)),
                new Person("Jonathan", "Garga St. 2 ", GadgetType.LAPTOP, LocalDate.of(2020, 12, 27)),
                new Person("Jame", "Laga St. 24 ", GadgetType.PHONE, LocalDate.of(2020, 12, 27))
        };
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public LocalDate getDeliverUntil() {
        return deliverUntil;
    }
}
