package Lt.Fundamentals.Intro;

public class Recursion {
    public static void main(String[] args) {
        countDown(-1);
    }

        private static void countDown(int n){
            if (n == 0 || n < 0){
                System.out.println("done");
        } else  {
                System.out.println(n);
                n--;
                countDown(n);
            }
    }
}
