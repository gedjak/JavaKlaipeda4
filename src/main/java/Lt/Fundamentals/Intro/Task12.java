package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Space takes: " + percentOfSpace(sentence) + "% of sentence!");
    }

    private static int percentOfSpace(String n) {
        int space = 0;
        char[] ch = n.toCharArray();
        for (int i = 0; i < n.length(); i++) {
            if (ch[i] == 32) {
                space++;
            }
        }
        return space * 100 / n.length();
    }
}
