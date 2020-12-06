package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scan.nextInt();

        if (number <= 1) {
            System.out.println("wrong number");
            return;
        }
        for (int i = 1; i < number; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;

            }
        }
       return true;
    }
}
