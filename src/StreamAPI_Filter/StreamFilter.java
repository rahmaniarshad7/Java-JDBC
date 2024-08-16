package StreamAPI_Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamFilter {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i++){
            list.add(i);
        }
        List<Integer> evenList = new ArrayList<>();

        evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

       // list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        //printing direct value without storing
        list.stream().filter(n-> n%2 != 0).forEach(n-> System.out.println(n));


    }
}
