package Lt.Fundamentals.Intro;

public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 1;
        float delta =(float) (b * b) - (4 * a * c);
        if ( delta < 0) {
            System.out.println("error");
        } else {
            float x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println(delta);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
