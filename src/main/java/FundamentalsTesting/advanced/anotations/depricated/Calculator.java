package FundamentalsTesting.advanced.anotations.depricated;

import java.util.List;

public class Calculator {
    // V1
    @Deprecated // pranesa kad metodas turi naujesne versija ir si gali buti pasalinta
    public int sum(int a, int b) {
        return a + b;
    }
    // V2
    public int sum(List<Integer> ints) {
        int sum = 0;
         for (Integer number : ints) {
             sum += number;
         }
         return sum;
    }
}
