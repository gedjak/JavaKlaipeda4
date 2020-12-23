package FundamentalsTesting.homework.pasitestavimas;

import FundamentalsTesting.advanced.generics.exemple2.Garage;

public class Garazas implements Automobilis {
    int metai;

    Garazas(){
        metai = 1986;
    }

    public int getMetai() {
        metai += 2;
        return metai;
    }
}
