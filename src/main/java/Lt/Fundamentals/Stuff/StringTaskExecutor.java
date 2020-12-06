package Lt.Fundamentals.Stuff;

public class StringTaskExecutor {
    public void execute1Task() {
        System.out.println("Hello");
    }

    public void execute2Task() {
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  v v  aaaaa");
        System.out.println(" JJ  a     a  v  a     a");
    }

    public void execute3Task() {
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(text.toLowerCase());
    }

    public void execute4Task() {
        String s = "avaJ";
        String reversed = new StringBuffer(s).reverse().toString();
        System.out.println(reversed);
    }

    public void execute5Task() {
        String word = "Programer";
        System.out.println(word.substring(0, word.length() / 2));
    }

    public void execute6Task() {
        String java = "Java";
        String fundamentals = "Fundamentals";
        System.out.println(java.substring(1) + fundamentals.substring(1));
    }

    public void execute7Task() {
        String word = "This is Java!";
        System.out.println(word.length() + " characters");
    }

    public void execute8Task() {
        String firstWord = "This is a comparison";
        String secondWord = "THIS is A Comparison";

        System.out.println(firstWord.equalsIgnoreCase(secondWord));
    }

    public void execute9Task() {
        String ses = "ses";
        String jses = "Java exercises";

        System.out.println(ses.equals(jses.substring(jses.length() - ses.length())));
    }

    public void execute10Task() {
        String sentence = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        char[] ch = sentence.toCharArray();
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
                letters++;
            }
            else if (ch[i] == 32) {
                spaces++;
            }
            else if (ch[i] >= '0' && ch[i] <= '9') {
                numbers++;
            } else {
                others++;
            }
        }
        System.out.println(letters + " - Letters, " + spaces + " - Spaces, " + numbers + " - Numbers, " + others + " - Others.");
    }
}
