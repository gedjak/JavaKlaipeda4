package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task10 {
    private static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numer");
        int num = scan.nextInt();
        if (num <= 0) {
            System.out.println("Wrong number");
            return;
        }

        System.out.println(getSum(num));
    }
}
