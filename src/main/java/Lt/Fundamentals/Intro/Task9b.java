package Lt.Fundamentals.Intro;

public class Task9b {
    public static void main(String[] args) {
        int n = 10;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1 || col == 0 ||
                        col == n - 1 || row == col || col == n - row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}