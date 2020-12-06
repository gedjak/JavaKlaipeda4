package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text: ");

        String text = sc.nextLine();

        String[] separate = text.split("");
        for (int i = 0; i < separate.length; i++) {
            System.out.print(separate[i] + " ");
            System.out.print(separate[i] + " ");
        }
    }
}
