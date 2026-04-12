package in.collecticonsGenerices;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {

        new Scanner(System.in);

        List<Integer> intList = new java.util.ArrayList<>();
        intList.add(5);
        intList.add(1);
        intList.add(6);
        intList.add(7);
        intList.add(8);

        System.out.println(intList.get(2));
        intList.remove(4);
        for (int i = 0; i < intList.size(); i++)
        {
            System.out.println(intList.get(i));
        }
    }
}
