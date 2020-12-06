package Lt.Fundamentals.Intro.Parduotuve;

public class Cart {
    private float sum = 0f;

    public void addProduct(Product product){
        sum = sum + product.getPrice();
    }
    public float getTotalSum(){
        return  sum;
    }
}