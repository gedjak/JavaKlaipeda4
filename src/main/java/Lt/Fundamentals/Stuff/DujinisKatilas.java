package Lt.Fundamentals.Stuff;

public class DujinisKatilas {
    private String modelis;
    private static String colour = "nuajausia";

    public DujinisKatilas(String modelis, String colour) {
        this.modelis = modelis;
        this.colour = colour;
    }

    public static void setColour(String colour) {
        DujinisKatilas.colour = colour;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public static String getColour() {
        return colour;
    }

    public String getModelis() {
        return modelis;
    }
}