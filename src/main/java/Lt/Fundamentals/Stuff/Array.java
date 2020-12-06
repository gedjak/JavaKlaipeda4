package Lt.Fundamentals.Stuff;

public class Array {
    public static void main(String[] args){
         
        int sum = 0;
        int [] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum is: " + sum);

        int average = sum / arr.length;
        System.out.println("average is: " + average);

        System.out.print("Odd numbers are: " );
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i]);

            }
        }





    }
}
