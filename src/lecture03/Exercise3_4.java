package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_4 {

    public static void main(String[] args) {
        ArrayList<Vegetable> list = new ArrayList<>();

        list.add(new Vegetable("にんじん", 117));
        list.add(new Vegetable("たまねぎ", 120));
        list.add(new Vegetable("じゃがいも", 154));

        for(int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }

    }
}
