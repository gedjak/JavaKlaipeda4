package FundamentalsTesting.advanced.classes.anonymusClass;

public class AnonymusClassExample {
    public static void main(String[] args) {

        AbstractPlantClass plantClass = new AbstractPlantClass() {

            @Override
            public String getPlantName() {
                return "Klevas";
            }
        };

        System.out.println(plantClass.getPlantName());

    }
}
