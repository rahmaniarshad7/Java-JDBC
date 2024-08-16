package StreamAPI_Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args)
    {

        //adding value in arraylist without ,add() method
        List<String> name = Arrays.asList("Arshad" , "Aiman", "Alta mash" , "Akasha" , "Asha" );
        List<String> longName;

        longName = name.stream().filter(str-> str.length() > 5 && str.length() < 10).collect(Collectors.toList());
        System.out.println(longName);
    }
}
