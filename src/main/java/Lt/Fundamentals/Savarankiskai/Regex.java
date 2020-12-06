package Lt.Fundamentals.Savarankiskai;
import java.util.regex.*;
public class Regex {
    public static void main(String[] args){


        String zodis = "klanasbas";



        System.out.println("char matches: " + Pattern.matches("[a-z]", "a"));
        System.out.println("char matches: " + Pattern.matches("[a-z]?", "abjh"));
        System.out.println("char matches: " + Pattern.matches("[czv]+", "czvczv"));
        System.out.println("char matches: " + Pattern.matches("[a-z]*", "azzaddff"));
        System.out.println("char matches: " + Pattern.matches("d", "azzaddff"));
        System.out.println("char matches: " + Pattern.matches("d", "1"));
        System.out.println("char matches: " + Pattern.matches(".", " "));
        System.out.println("char matches: " + Pattern.matches("s", " "));






    }
}
