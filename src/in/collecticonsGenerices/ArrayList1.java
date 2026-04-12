package in.collecticonsGenerices;
import java.util.ArrayList;

import java.util.Collections;

public class ArrayList1 {
    public static <list> void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        System.out.println(list);
        Collections.sort(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Arshad");
        list2.add("Rahman");
        list2.add("Babu");
        list2.add("LambdaExpression");
        list2.add("Java");
        list2.set(0 , "Aiman");
        list2.set(4 , "Arshad");
        Collections.sort(list2);

        for (String s : list2) {
            System.out.println(s);
        }
        list smallist = (list) list2.subList(1,3);
        System.out.println(smallist);

    }
}
