import java.time.LocalDateTime;

abstract class ProductSeller {
    //カプセル化→後で変更したいときに影響範囲を小さくする
    protected String productName;
    protected int productPrice;
    protected int productQuantity;

    public ProductSeller(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    abstract int getProductPrice();

    public int sellProduct(){
        if(productQuantity > 0) {
            //誰の視点からのクラスか（役割は何か）
            System.out.println(this.productName + "を販売しました。\n");
            productQuantity -= 1;
            return getProductPrice();
        } else {
            System.out.println(this.productName + "は売り切れです。\n");
            return 0;
        }
    }
}