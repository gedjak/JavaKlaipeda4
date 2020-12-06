package Lt.Fundamentals.Intro;

public class Task2 {
    public static void main(String[] args) {

        float bmi;
        float weight = 95;
        int height = 189;
        float heightInM =(float) height / 100;
        bmi = weight / (heightInM * heightInM);
        System.out.println("BMI is: " + bmi);
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI Oprimal");
        }
        else {
            System.out.println("BMI Not Oprimal");
        }
    }
}
