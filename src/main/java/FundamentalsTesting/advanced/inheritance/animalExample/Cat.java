package FundamentalsTesting.advanced.inheritance.animalExample;

public class Cat extends Animal{

    private  String color;

    public Cat (boolean mammal, String voice, String color) {
        super(mammal, voice);
        this.color = color;
    }
}
