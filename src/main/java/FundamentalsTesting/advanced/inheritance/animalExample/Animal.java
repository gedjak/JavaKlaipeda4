package FundamentalsTesting.advanced.inheritance.animalExample;

public abstract class Animal {

    protected  boolean mammal;
    protected String voice;

    public Animal(boolean mammal, String voice) {
        this.mammal = mammal;
        this.voice = voice;
    }

    public String yieldVoice() {
        return ("My voice: " + voice);
    }
}
