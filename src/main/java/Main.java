import java.util.HashMap;
import java.util.Scanner;

//* 重複が多くなる←コードによる
//* 変数名を変更しにくい
//* 新しい要素を追加しにくい
//* 変数や関数同士のつながりが分かりにくい（何が何を呼んでいるのか）
//* 関数や変数同士の責任の所在が分かりにくい

public class Main {
    public static void main(String[] args) {
        int remainingBalance = 0;

        HashMap<String, ProductSeller> registeredProducts = new HashMap<>();
        registeredProducts.put("おりぎり", new ConvenienceStore("おにぎり", 150, 10));
        registeredProducts.put("パン", new ConvenienceStore("パン", 150, 5));
        registeredProducts.put("人参", new Greengrocer("人参", 100, 2));
        registeredProducts.put("リンゴ", new Greengrocer("リンゴ", 200, 3));
        registeredProducts.put("カツオ", new Fishshop("カツオ", 550, 1));
        registeredProducts.put("アジ", new Fishshop("アジ", 350, 1));
        registeredProducts.put("人生ゲーム", new ToyShop("人生ゲーム", 11350, 1));

        remainingBalance += registeredProducts.get("人参").sellProduct();
        remainingBalance += registeredProducts.get("アジ").sellProduct();
        remainingBalance += registeredProducts.get("カツオ").sellProduct();
        remainingBalance += registeredProducts.get("人生ゲーム").sellProduct();

        ToyShop refundedAmountForToy = (ToyShop) registeredProducts.get("人生ゲーム");
        remainingBalance -= refundedAmountForToy.refund();

        System.out.println("\n本日の売上は" + remainingBalance + "円です。\n");

        System.out.println("棚卸しをします");
        for(String product: registeredProducts.keySet()) {
            System.out.println(product + "は" + registeredProducts.get(product).getProductQuantity() + "残っています");
        }

    }
}