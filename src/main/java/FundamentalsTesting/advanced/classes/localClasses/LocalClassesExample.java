package FundamentalsTesting.advanced.classes.localClasses;

public class LocalClassesExample {
    public static void main(String[] args) {
        System.out.println("Local class example!");
// local class nematoma uz riestiniu skliaustu ribu

        class Pair {
            String key;
            int value;

            public Pair (String key, int value){
                this.key = key;
                this.value = value;
            }
        }

        Pair pair = new Pair("k1", 1); // local clase pasiekiama
    }
    //Pair pair = new Pair("k1", 1); // cia jau pasiekti neimanoma
}
