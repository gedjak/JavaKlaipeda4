package Lt.Fundamentals.Stuff;

public class TreciasB {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3},
                {-1, -2, -3},
                {0, 10, 5}
        };
        int arrSum = 0;
        int arrMax = Integer.MIN_VALUE;
        int arrMin = Integer.MAX_VALUE;
        int highIndex = 0;
        int lowIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arrSum += arr[i][j];

            }
            if (arrSum > arrMax) {
                arrMax = arrSum;
                highIndex = i;
            }
            if (arrSum < arrMin) {
                arrMin = arrSum;
                lowIndex = i;
            }
        }
        System.out.println("high sum " + arrMax + " index " + highIndex);
        System.out.println("high sum " + arrMin + " index " + lowIndex);
    }
}
