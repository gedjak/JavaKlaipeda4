package FundamentalsTesting.homework.personHomework;

public class Developer extends Person {

    private int ageOfExperience;

    public int getAgeOfExperience() {
        return ageOfExperience;
    }


    Developer(String name, int ageOfExperience) {
        super(name);
        this.ageOfExperience = ageOfExperience;

    }

}
