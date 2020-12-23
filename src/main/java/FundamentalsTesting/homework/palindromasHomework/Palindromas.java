package FundamentalsTesting.homework.palindromasHomework;

public class Palindromas {
    private boolean isPal;

    public boolean isPalindromas(String n) {
    String isLetters = "([a-z]+)";
    if (!n.matches(isLetters)){
        System.out.println("Word should contain letters only");
        return false;
    }
        char[] letter = n.toCharArray();

        for (int i = 0; i < letter.length; i++) {
            if (letter[i] != letter[letter.length - i - 1]) {
                isPal = false;
            } else isPal = true;
        }
        if(isPal) {
            System.out.println(n + " - yra palindromas");
        }
        else {
            System.out.println(n + " - yra ne palondromas");
        }
        return isPal;
    }
}
