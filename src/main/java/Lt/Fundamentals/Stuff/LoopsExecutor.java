package Lt.Fundamentals.Stuff;

import java.util.Scanner;

public class LoopsExecutor {

    Scanner scan = new Scanner(System.in);

    //                                         Task1
    public void task1() {
        int skaicius;
        int atsakymas = 0;

        System.out.println("Enter your number: ");
        skaicius = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            atsakymas = skaicius * i;
            System.out.println(atsakymas);
        }
    }

    //                                         Task2
    public void task2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //                                         Task3
    public void task3() {
        System.out.println("Enter your number: ");
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number);
            }
            System.out.print(",");

        }

    }
    //                                         Task4

    public void task4() {
        System.out.print("Divided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.print("Divided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.print("Divided by 5 & 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
    }
    //                                         Task5

    public void task5(){
        int i = 1;
        int j = 3;
        while (i <= 100){
            i = i * j;
            if (i < 100)
            System.out.print(i + ",");
        }
    }
    //                                         Task5B
    public void task5B(){
        int number = 3;
        for (int i = 1; i <= 100; i = i * number) {
            System.out.print(i + ",");
        }
    }

}