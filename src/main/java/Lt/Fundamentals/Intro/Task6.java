package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scan.nextInt();
        double h = 0;

        for (double i = 1; i <= number; i++){
            h = h + (1 / i);
        }
        System.out.println(h);
    }
}
