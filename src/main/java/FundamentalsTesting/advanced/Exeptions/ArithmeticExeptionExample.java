package FundamentalsTesting.advanced.Exeptions;

public class ArithmeticExeptionExample {
    public static void main(String[] args) {


        int firstNum = 10;
        int secondNum = 0;
        try {
            System.out.println(firstNum / secondNum);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
        }
        finally {
            System.out.println(" Finally block");
        }
    }
}
