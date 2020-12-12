package FundamentalsTesting.advanced.colections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExemple {
    public static void main(String[] args) {
        List<String> visitedCountries = new ArrayList<>(); //list talpina pasikarojancias reiksmes

        visitedCountries.add("Germany");
        visitedCountries.add("Spain");
        visitedCountries.add("Lithuania");
        visitedCountries.add("Spain");



        for (String country : visitedCountries) {
            System.out.println(country);
        }
        System.out.println("SET");
        Set<String> visited = new HashSet<>(visitedCountries);
        for (String country : visited) {
            System.out.println(country);
        }
    }
}
