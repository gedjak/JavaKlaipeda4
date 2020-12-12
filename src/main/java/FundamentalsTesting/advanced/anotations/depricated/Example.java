package FundamentalsTesting.advanced.anotations.depricated;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.sum(4, 6);
        System.out.println(result);

        List<Integer> integers = Arrays.asList(4, 4, 1, 1);
        result = calculator.sum(integers);
        System.out.println(result);
    }
}
