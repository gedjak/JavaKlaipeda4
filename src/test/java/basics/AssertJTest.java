package basics;

import FundamentalsTesting.Circle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest {
    @Test
    public void testAssertJMatchers() {
        //given
        String text = "abc";
        String[] stringArr = {"abc", "cde", "efg"};
        //when

        //then
        Assertions.assertThat(stringArr)
                .hasSize(3)
                .contains(text)
                .doesNotContain("x");
    }

    @Test
    public void shouldAddTwoNumbers() {
        //given
        int result = 1 + 3;
        //when

        //then
        Assertions.assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(5)
                .isLessThan(6)
                .isGreaterThan(3)
                .isBetween(0, 10);
    }
    @Test
    public void circleAreaTest(){
        //given
        int x = 3;
        Circle circle = new Circle(x);
        //when
        double result = circle.calculateArea();
        //then
        Assertions.assertThat(result).isEqualTo(Math.PI * Math.pow(x, 2));
    }
    @Test
    public void circlePerimeterTest(){
        //given
        int x = 3;
        Circle circle = new Circle(x);
        //when
        double result = circle.calculatePerimeter();
        //then
        Assertions.assertThat(result).isEqualTo(2 * Math.PI * x);
    }
}
