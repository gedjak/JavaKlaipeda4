package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scan.nextInt();

        int x = 0;
        int y = 1;
        int z = 1;

        for (int i = 1; i <= number; i++) {
            z = y + x;
            x = y;
            y = z;
        }
        System.out.println(x);
    }
}
