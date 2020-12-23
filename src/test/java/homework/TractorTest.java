package homework;

import FundamentalsTesting.homework.tractorHomework.Tractor;
import FundamentalsTesting.homework.tractorHomework.TractorMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TractorTest {
    @Test
    public void mostExpensiveTractor(){
        //given
        //when
        Tractor result = TractorMain.getMostExpensiveTractor(tractors());
        //then
        Assertions.assertEquals(150000, result.getPrice());
    }
    @Test
    public void oldestTractor(){
        //given
        //when
        Tractor result = TractorMain.getOldestTractor(tractors());
        //then
        org.assertj.core.api.Assertions.assertThat(result.getDate()).isEqualTo(LocalDate.of(1986, 8, 4));
    }
    @Test
    public void numberOfTractorsWithTankSizeMoreThan300(){
        //given
        //when
        int result = TractorMain.getTankSizeMoreThen300l(tractors());
        //then
        Assertions.assertEquals(2, result);
    }
    @Test
    public void modelStartsWithLetterM(){
        //given

        //when
        int result = TractorMain.getStartsWithM(tractors());
        //then
        Assertions.assertEquals(2,result);
    }

    private static Tractor[] tractors() {
        return new Tractor[]{
                new Tractor("john-deer", "M500", 301, LocalDate.of(2012, 12, 04), 150000),
                new Tractor("belarus", "kt2500", 350, LocalDate.of(2000, 10, 03), 10000),
                new Tractor("fend","MZT",200, LocalDate.of(1986,8,4), 50000)
        };
    }

}
