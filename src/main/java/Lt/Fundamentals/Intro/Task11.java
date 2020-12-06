package Lt.Fundamentals.Intro;

import java.util.Scanner;

public class Task11 {
    private static final String STOP = "stop";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text;
        text = scan.nextLine();
        String textLongest = "";

        while (!text.equalsIgnoreCase(STOP)) {
            if (text.length() > textLongest.length()) {
                textLongest = text;
            }
            text = scan.nextLine();

        }
        System.out.println(textLongest);
    }
}
