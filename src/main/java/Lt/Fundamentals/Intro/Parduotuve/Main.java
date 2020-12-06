package Lt.Fundamentals.Intro.Parduotuve;

import Lt.Fundamentals.Stuff.Card;

public class Main {
    public static void main(String[] args) {
      Store stor = new Store(1);
      stor.addProduct("pienas", 2.0f);
      Product[] productsList = stor.getProductList();
        System.out.println(productsList[0]);





    }
}
