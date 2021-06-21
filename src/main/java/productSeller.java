public class productSeller {
    private String productName;
    private int productPrice;
    private int productQuantity;

    public productSeller(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int sellProduct(){
        if(productQuantity > 0) {
            //誰の視点からのクラスか（役割は何か）
            System.out.println(this.productName + "を販売しました。\n");
            productQuantity -= 1;
            return productPrice;
        } else {
            System.out.println(this.productName + "は売り切れです。\n");
            return 0;
        }
    }
}