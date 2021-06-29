public class Fishshop extends ProductSeller{
    public Fishshop(String productName, int productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
    }

    @Override
    int getProductPrice() {
        return productPrice;
    }
}
