package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {

    public static void main(String[] args) {
        System.out.println("小数値を入力してください:");

        try {
            Scanner input = new Scanner(System.in);
            double number = input.nextDouble();
            System.out.println("入力した値:  " + number);
        }catch(InputMismatchException e) {
            System.out.println("エラー.");
        }
    }
}
