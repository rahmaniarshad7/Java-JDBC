package StreamMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> transport = Arrays.asList("Bus" , "Train" , "Aeroplane" , "Bike" , "Cycle");
        List<String> inUpperCase = new ArrayList<>();

        // without using stream
      /*  for (String name : transport)
        {
            inUpperCase.add(name.toUpperCase());
        }
        System.out.println(inUpperCase);*/

        inUpperCase = transport.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(inUpperCase);
    }
}
