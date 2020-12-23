package Lt.Fundamentals.Savarankiskai.testas;

public class Lova {
    private double ilgis;
    private int zmoniuSkaicius;

    public Lova(double ilgis, int zmoniuSkaicius){
        this.ilgis = ilgis;
        this.zmoniuSkaicius = zmoniuSkaicius;
    }

    @Override
    public String toString() {
        return "Lova{" +
                "ilgis=" + ilgis +
                ", zmoniuSkaicius=" + zmoniuSkaicius +
                '}';
    }

    public double getIlgis() {
        return ilgis;
    }

    public int getZmoniuSkaicius() {
        return zmoniuSkaicius;
    }
}
