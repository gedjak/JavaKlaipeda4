package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task15b {
    public static void main(String[] args) {
        int [] num = new int[10];
        int max = num[0]; // kintamasis skirtas didziausiai array reiksmei surasti
        int toChange = 0;  // kintamasis pasikartojancios reiksmes saugojimui

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            if(num[i] >= max) max = num[i]; //ieskoma didziausia array reiksme
        }
        for (int i = 0; i < num.length; i++){
            for (int j = i + 1; j < num.length; j++){
                if (num[j] == toChange && j > 1){
                    num[j] = max + j;}  // pasikartojantis skaicius keiciamas didziausia array reiksme + index
                if (num[i] == num[j]){
                    System.out.println(num[i]);
                    toChange = num[i]; // kintamajam priskiriama pasikartojancio skaiciaus reiksme
                }
            }

        }

    }
}
