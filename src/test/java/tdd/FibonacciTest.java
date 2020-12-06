package tdd;

import FundamentalsTesting.FibonacciSequence;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void ShouldReturnZeroForFirstElement() {
        //given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        //When
        int result = fibonacciSequence.getValue(0);

        //Then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForSecondElement() {
        //given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        //when
        int result = fibonacciSequence.getValue(1);
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnFibonacciNumber() {
        //given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        //when
        int result = fibonacciSequence.getValue(3);
        //then
        Assertions.assertThat(result).isEqualTo(2);
    }
}
