package FundamentalsTesting.homework.zaidimasHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Word {
    Scanner sc = new Scanner(System.in);
    private String sugalvotasZodis = "hipopotamas";
    private char[] atspetosRaides;
    private char[] zodis = sugalvotasZodis.toCharArray();
    private String spejimas;
    private boolean isTrue;


    public boolean getWord() {

        atspetosRaides = sugalvotasZodis.toCharArray();

        for (int i = 0; i < zodis.length; i++) {
            atspetosRaides[i] = '-';
        }

        System.out.println("spėk raidę arba žodį");
        do {
            System.out.println(atspetosRaides);
            spejimas = sc.nextLine();
            if (spejimas.toCharArray().length < 1) System.out.println("įrašyk bent vieną raidę");
            if (spejimas.length() == 1) {
                checkLetter(spejimas);
            } else checkTheWord(spejimas);
        }
        while (isTrue != true);

        System.out.println("Atspėjai");
        return true;
    }

    private boolean checkTheWord(String n) {
        if (n.equals(sugalvotasZodis)) {
            atspetosRaides = n.toCharArray();
            isTrue = true;
        } else isTrue = false;

        return isTrue;
    }

    private boolean checkLetter(String n) {
        for (int i = 0; i < sugalvotasZodis.length(); i++) {
            if (n.toCharArray()[0] == zodis[i]) atspetosRaides[i] = n.toCharArray()[0];
        }
        if (Arrays.equals(atspetosRaides, zodis)) {
            isTrue = true;
        } else isTrue = false;


        return isTrue;
    }
}

