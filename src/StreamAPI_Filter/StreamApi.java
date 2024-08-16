package StreamAPI_Filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(17);
        myList.add(8);
        myList.add(11);
        myList.add(14);
        myList.add(15);

        List<Integer> evenList = new ArrayList<>();
        for (int i : myList)
        {
            if (i % 2 == 0)
            {
                evenList.add(i);
            }
        }
        Collections.sort(myList);
        System.out.println(myList);
        System.out.println(evenList);


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(16);
        list.add(17);

        Stream<Integer> stream = list.stream();
       List<Integer> newList = stream.filter(i->i%2 == 0).collect(Collectors.toList());


    }
}
