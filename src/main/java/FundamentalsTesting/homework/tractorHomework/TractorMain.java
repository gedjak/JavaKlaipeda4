package FundamentalsTesting.homework.tractorHomework;

import java.time.LocalDate;

public class TractorMain {
    public static Tractor getMostExpensiveTractor (Tractor[] tractors){
        Tractor mostExpensive = tractors[0];
        for (int i = 0; i < tractors.length; i++){
            if(tractors[i].getPrice() > mostExpensive.getPrice()) mostExpensive = tractors[i];
        }
        return mostExpensive;
    }
    public static Tractor getOldestTractor(Tractor[] tractors){
        Tractor oldestTractor = tractors[0];
        for(Tractor t : tractors){
            if(t.getDate().isBefore(oldestTractor.getDate())) oldestTractor = t;
        }
        return oldestTractor;
    }
    public static int getTankSizeMoreThen300l(Tractor[] tractors){
        int numberOfTractors = 0;
        for(Tractor t: tractors){
            if(t.getTankSize() > 300) numberOfTractors++;
        }
        return numberOfTractors;
    }
    public static int getStartsWithM(Tractor[] tractors){
        int counter = 0;
        for (Tractor t: tractors){
            if(t.getModel().startsWith("M")){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
    }

}
