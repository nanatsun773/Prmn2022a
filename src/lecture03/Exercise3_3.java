package lecture03;

import java.util.Scanner;

public class Exercise3_3 {

    public static void main(String[] args) {
        int sum = 0;
        int[] numData = new int[2];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 2; i++) {
            System.out.println(i+1 + "つ目の整数を入力してください:");
            String num = input.next();
            int number = Integer.parseInt(num);
            numData[i] = number;
            sum += number;
        }

        System.out.println(numData[0] + " + " + numData[1] + " = " + sum);
    }
}
