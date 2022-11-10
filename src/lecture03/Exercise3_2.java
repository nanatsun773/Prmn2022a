package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("何桁分入力しますか？");
        int num = scan.nextInt();
        scan.nextLine(); //nextInt()で改行コードが残ってしまうため、nextLine()で空読みをする(文字の入力で改行が読み込まれてしまう)

        ArrayList<String> list = new ArrayList<>(num);
        for (int i = 1; i <= num; i++) {
            System.out.println(i + "行目:");
            String input = scan.nextLine();
            list.add(input);
        }

        System.out.println("入力した文字列:");

        for (String string : list) {
            System.out.println("[" + list.indexOf(string) + "]" + string);
        }
    }
}
