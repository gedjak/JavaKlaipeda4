package FundamentalsTesting.homework.contryHomework;

public class Country {

    private String name;
    private double co2Emission;
    private String pollutionFactor;

    public Country(String name, double co2Emission, String pollutionFactor) {
        this.name = name;
        this.co2Emission = co2Emission;
        this.pollutionFactor = pollutionFactor;
    }

    public String getName() {
        return name;
    }

    public double getCo2Emission() {
        return co2Emission;
    }

    public String getPollutionFactor() {
        return pollutionFactor;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", co2Emission=" + co2Emission +
                ", pollutionFactor='" + pollutionFactor + '\'' +
                '}';
    }
}
