import java.util.Scanner;

//* 重複が多くなる
//* 変数名を変更しにくい
//* 新しい要素を追加しにくい
//* 変数や関数同士のつながりが分かりにくい（何が何を呼んでいるのか）
//* 関数や変数同士の責任の所在が分かりにくい

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userActivity;
        int remainingBalance = 0;

        productSeller apple = new productSeller("Apple", 100, 5);
        productSeller banana = new productSeller("Banana", 150, 2);

        System.out.println("リンゴとバナナを販売中です\n");

        while (true) {
            System.out.print("1→リンゴを購入、2→バナナを購入、3→購入を終了\n>");
            userActivity = scanner.nextInt();
            if(userActivity == 1){
                remainingBalance += apple.sellProduct();
            } else if (userActivity == 2){
                remainingBalance += banana.sellProduct();
            } else {
                break;
            }
        }

        System.out.println("\n本日の売上は" + remainingBalance + "円です。");
    }
}