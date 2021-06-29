public class ToyShop extends ProductSeller implements Refundable {
    private int productQuantityWhenShopOpened = 0;

    public ToyShop(String productName, int productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
        productQuantityWhenShopOpened = productQuantity;
    }

    @Override
    public int getProductPrice() {
        return productPrice;
    }

    private Boolean isSold() {
        return productQuantityWhenShopOpened > productQuantity;
    }

    @Override
    public int refund() {
        if (isSold()) {
            System.out.println(productName + "が返品されました");
            productQuantity += 1;
            return productPrice;
        } else {
            System.out.println("商品が1個も売れていないので返金できません");
            return 0;
        }
    }
}
