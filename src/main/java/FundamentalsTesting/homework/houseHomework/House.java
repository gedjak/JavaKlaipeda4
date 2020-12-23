package FundamentalsTesting.homework.houseHomework;

public class House {
    private int houseArea;
    private String district;
    private int builtYear;
    private String condition;

    public House(int houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;


    }

    public int getHouseArea() {
        return houseArea;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseArea = " + houseArea +
                ", district = '" + district + '\'' +
                ", builtYear = " + builtYear +
                ", condition = '" + condition + '\'' +
                '}';
    }
}




