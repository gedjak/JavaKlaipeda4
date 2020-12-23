package FundamentalsTesting.homework.tractorHomework;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Tractor {
    private String tractorMaker;
    private String model;
    private int tankSize;
    private LocalDate date;
    private double price;

    public Tractor(String tractorMaker, String model, int tankSize, LocalDate date, double price) {
        this.tractorMaker = tractorMaker;
        this.model = model;
        this.tankSize = tankSize;
        this.date = date;
        this.price = price;
    }

    public String getTractorMaker() {
        return tractorMaker;
    }

    public String getModel() {
        return model;
    }

    public int getTankSize() {
        return tankSize;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "tractorMaker='" + tractorMaker + '\'' +
                ", model='" + model + '\'' +
                ", tankSize=" + tankSize +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
