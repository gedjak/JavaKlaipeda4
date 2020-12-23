package homework;

import FundamentalsTesting.homework.contryHomework.Country;
import FundamentalsTesting.homework.contryHomework.CountryMain;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountryTest {
    @Test
    public void testLeastCo2() {
        //given
        //when
        Country result = CountryMain.getLeastPollutedCountry(countries());
        //then
        Assertions.assertThat(result.getName()).isEqualTo("Lt3");
    }

    @Test
    public void co2Sum(){
        //given
        //when
        double result = CountryMain.getCo2Sum(countries());
        //then
        Assertions.assertThat(result).isEqualTo(330);
    }

    @Test
    public void co2Average(){
        //given
        //when
        double result = CountryMain.averageCo2(countries());
        //then
        Assertions.assertThat(result).isEqualTo(110);
    }
    private static Country[]countries(){
        return new Country[]{
        new Country("Lt1", 120, "factories"),
        new Country("Lt2", 110, "animal husbandry"),
        new Country("Lt3", 100, "transportation")
    };
    }
}
