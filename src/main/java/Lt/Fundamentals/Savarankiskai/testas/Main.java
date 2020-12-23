package Lt.Fundamentals.Savarankiskai.testas;

public class Main {

    public static void main(String[] args) {

    Butas butas = new Butas(
            new Lova(1.90, 2),
            new Stalas(0.9, "baltas")
    );


        System.out.println(butas.getLova().toString());
    }
}
