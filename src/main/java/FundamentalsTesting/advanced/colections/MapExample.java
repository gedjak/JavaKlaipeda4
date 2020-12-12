package FundamentalsTesting.advanced.colections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Map<Key, Value> countries = new HashMap<>();
        Map<String, String> countries = new HashMap<>();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");

        List<String> countrList = new ArrayList<>(countries.values());

        for (String mapValue : countries.values()) {
            System.out.println(mapValue);
        }

        for (Map.Entry<String, String> country : countries.entrySet()) {
            String countryKey = country.getKey();
            String capital = country.getValue();//viena Map reiksme: key ir value

            System.out.println(countries.get(countryKey) + " = " + capital); // get"Key" metodas kviecia value
        }
    }
}
