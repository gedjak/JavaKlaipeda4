package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);

        int c = a;
        int d = b;
        int between;

        if (c < 97 || c > 122 || d < 97 || d > 122) {
            System.out.println("Wrong input");
            return;
        }
        if (c > d) between = c - d - 1;
        else between = d - c - 1;

        System.out.println(between);

    }
}
