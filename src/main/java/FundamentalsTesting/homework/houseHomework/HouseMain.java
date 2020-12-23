package FundamentalsTesting.homework.houseHomework;

public class HouseMain {
    public static House getNewestHouse(House[] houses) {
        House newestHouse = houses[0];
        for (int i = 0; i < houses.length; i++) {
            if (newestHouse.getBuiltYear() < houses[i].getBuiltYear())
                newestHouse = houses[i];
        }

        return newestHouse;
    }

    public static int getNumberOfFittedHouses(House[] houses) {
        int fittedHouses = 0;
        for (int i = 0; i < houses.length; i++) {
            if ("Fitted".equalsIgnoreCase(houses[i].getCondition())) fittedHouses++;
        }
        return fittedHouses;
    }

    public static House getSmallestHouse(House[] houses){
        House smallestHouse = houses[0];
        for (int i = 0; i < houses.length; i++){
            if(smallestHouse.getHouseArea() > houses[i].getHouseArea())
                smallestHouse = houses[i];
        }
        return smallestHouse;
    }


}

