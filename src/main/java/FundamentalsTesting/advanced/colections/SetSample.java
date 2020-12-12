package FundamentalsTesting.advanced.colections;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        Set<String> travelRout = new HashSet<>();
        travelRout.add("Berlin");
        travelRout.add("Madrid");
        travelRout.add("Paris"); // pasikartojancios reiksmes neitraukiamos i masyva
        travelRout.add("Paris");
        travelRout.add("Berlin");
        travelRout.add("Lithuania");

        travelRout.remove("Paris");

        if (travelRout.contains("Lithuania")) {
            System.out.println("Lithuania is in the rout");
        }


        for (String country : travelRout){
            System.out.println((country));
        }
    }
}
