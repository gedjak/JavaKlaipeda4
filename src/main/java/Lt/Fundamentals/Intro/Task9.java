package Lt.Fundamentals.Intro;

public class Task9 {
    public static void main(String[] args) {
        int value = 10;

        for (int row = 1; row <= value; row++) {
            for (int i = 0; i < value; i++) {
                for (int col = 1; col < value * 2; col++) {
                    if (row == col || col == value * 2 - row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
