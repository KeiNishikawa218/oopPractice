import java.time.LocalDateTime;

public class Greengrocer extends ProductSeller {
    public Greengrocer(String productName, int productPrice, int productQuantity) {
        super(productName, productPrice, productQuantity);
    }

    @Override
    int getProductPrice() {
        int currentHour = LocalDateTime.now().getHour();
        Boolean isPromotionHour = (12 <= currentHour && currentHour <= 20);

        if (isPromotionHour) {
            return productPrice/2;
        } else {
            return productPrice;
        }
    }
}
