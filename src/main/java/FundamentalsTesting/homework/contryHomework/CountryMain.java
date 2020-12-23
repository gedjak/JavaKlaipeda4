package FundamentalsTesting.homework.contryHomework;

public class CountryMain {

    public static Country getLeastPollutedCountry(Country[] countries) {
        Country leastPolluted = countries[0];
        double emission = 0;
        double emission2 = countries[0].getCo2Emission() * 1.4;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].getPollutionFactor() == "animal husbandry")
                emission = countries[i].getCo2Emission() * 1.2;
            if (countries[i].getPollutionFactor() == "transportation")
                emission = countries[i].getCo2Emission() * 0.9;
            if (countries[i].getPollutionFactor() == "factories")
                emission = countries[i].getCo2Emission() * 1.4;
            if (emission2 > emission) leastPolluted = countries[i];

        }
        return leastPolluted;
    }
    public  static double getCo2Sum(Country[] countries) {
        double co2Sum = 0;
        for (int i = 0; i < countries.length; i++){
            co2Sum += countries[i].getCo2Emission();
        }
        return co2Sum;
    }
    public static double averageCo2(Country[] countries){
        double co2Average = getCo2Sum(countries) / countries.length;
        return co2Average;
    }

    public static void main(String[] args) {
        Country[] countries = new Country[3];
        countries[0] = new Country("Lt1", 100, "factories");
        countries[1] = new Country("Lt2", 100, "animal husbandry");
        countries[2] = new Country("Lt3", 100, "transportation");
        System.out.println(getLeastPollutedCountry(countries));
    }
}