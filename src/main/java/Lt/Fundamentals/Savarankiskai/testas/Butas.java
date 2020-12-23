package Lt.Fundamentals.Savarankiskai.testas;

public class Butas {
    private Lova lova;
    private  Stalas stalas;

    public Butas(Lova lova, Stalas stalas) {
        this.lova = lova;
        this.stalas = stalas;
    }

    public Lova getLova() {
        return lova;
    }

    public Stalas getStalas() {
        return stalas;
    }

    @Override
    public String toString() {
        return "Butas{" +
                "lova=" + lova +
                ", stalas=" + stalas +
                '}';
    }
}
