package FundamentalsTesting.homework.Generics;

public class TwoItems<T> {// <T extends Number/String...> nurodo ką galima įstatyti
    T entry1;
    T entry2;

    TwoItems(T entry1, T entry2){
        this.entry1 = entry1;
        this.entry2 = entry2;
    }

    public T getEntry1() {
        return entry1;
    }
    public T getEntry2() {
        return  entry2;
    }

    @Override
    public String toString() {
        return "TwoItems{" +
                "entry1=" + entry1 +
                ", entry2=" + entry2 +
                '}';
    }
}
