package Lt.Fundamentals.Intro.Parduotuve;

public class Store {

    private Product[] productList;
    private Cart cart;
    private int productCount;
    private int maxItem;

    public Store(int maxItems) {
        this.maxItem = maxItems;
        this.productList = new Product[maxItems];
        this.cart = new Cart();
        this.productCount = 0;
    }

    public void addProduct(String newName, float newPrice) {

        if (productCount < maxItem){
            this.productList[productCount] = new Product(newName, newPrice);
            productCount++;
        }
    }
    public Product[]getProductList(){
        return productList;
    }
}
