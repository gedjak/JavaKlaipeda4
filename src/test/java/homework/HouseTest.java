package homework;

import FundamentalsTesting.homework.houseHomework.House;
import FundamentalsTesting.homework.houseHomework.HouseMain;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseTest {


    @Test
    public void shouldReturnNewestHouse() {
        //given
        //when
        House result = HouseMain.getNewestHouse(houses());
        //then
        Assertions.assertThat(result.getBuiltYear()).isEqualTo(2020);
    }

    @Test
    public void shouldReturnNumberOfFittedHouses(){
        //given
        //when
        int result = HouseMain.getNumberOfFittedHouses(houses());
        //then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void shouldReturnSmallestHouse(){
        //given
        //when
        House result = HouseMain.getSmallestHouse(houses());
        //then
        Assertions.assertThat(result.getHouseArea()).isEqualTo(100);
    }

    private static House[] houses() {
        return new House[]{
                new House(120, "Klp", 2000, "fitted"),
                new House(125, "Klp", 2020, "Fitted"),
                new House(100, "Klp", 1090, "Fitted")
        };
    }
}
