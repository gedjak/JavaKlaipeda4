package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first number: ");
        float num1 = scan.nextFloat();

        System.out.println("operator |+|-|/|*| : ");
        char operator = scan.next().charAt(0);

        System.out.println("second number: ");
        float num2 = scan.nextFloat();

        float result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid Symbol");
        }

        System.out.println(result);

    }
}
