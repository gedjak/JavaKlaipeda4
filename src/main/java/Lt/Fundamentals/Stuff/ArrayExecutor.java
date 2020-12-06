package Lt.Fundamentals.Stuff;

public class ArrayExecutor {
    static int arr[] = new int[]{1, 7, 3, 10, 9};
    static int average;

    //                                                  Task1
    public void task1() {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    //                                                  Task2
    public void task2() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum / arr.length;
        System.out.println(average);
    }

    //                                                  Task3
    public void task3() {
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            if (number % 2 != 0) {
                System.out.print(number + ",");
            }
        }
    }

    //                                                  Task4
    public void task4() {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    //                                                  Task5
    public void task5() {
        System.out.print("[");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    //                                                  Task6
    public void task6() {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even: " + even);
        System.out.println(("odd: " + odd));
    }
}
