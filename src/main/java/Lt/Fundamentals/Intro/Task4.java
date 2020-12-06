package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number: ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("number must be positive");
            return;
        }

        if (number % 3 == 0 && number % 7 == 0) {
            System.out.println("Fizz buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 7 == 0) {
            System.out.println("Buzz");
        }


    }
}
