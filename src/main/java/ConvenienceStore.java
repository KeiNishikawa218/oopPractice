public class ConvenienceStore extends ProductSeller{
    public ConvenienceStore(String productName, int productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
    }

    @Override
    public int getProductPrice() {
        return productPrice;
    }
}
