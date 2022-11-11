package lecture06;

import java.util.*;

public class Exercise6_2 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> DiceList = new ArrayList<>(5);

        DiceList.add(random.nextInt(6) + 1);
        DiceList.add(random.nextInt(6) + 1);
        DiceList.add(random.nextInt(6) + 1);
        DiceList.add(random.nextInt(6) + 1);
        DiceList.add(random.nextInt(6) + 1);

        System.out.println("さいころを" + DiceList.size() + "つ振りました.");
        System.out.println("何番目のさいころの値を確認しますか？(1 ~ 5を入力)");

        try {
            Scanner scan = new Scanner(System.in);
            int index = scan.nextInt();
            System.out.println(index + "番目のさいころの値: " + DiceList.get(index-1));
        }catch(IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        }catch(InputMismatchException e) {
            System.out.println("整数以外の値が入力されました.");
            System.out.println("プログラムを終了します.");
        }
    }
}
