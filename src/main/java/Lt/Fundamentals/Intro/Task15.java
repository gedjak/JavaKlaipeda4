package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.println("number " + (i + 1));
            num[i] = sc.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            temp = 0;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    temp++;
                    if (temp < 2) System.out.print(num[j] + ", ");
                }
            }
        }
    }
}

