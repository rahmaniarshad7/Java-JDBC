package StreamAPI_Filter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo2 {
     @SuppressWarnings("unused")
     static void main(String[] args)
    {


        // print filtered names directly without intermediate variable
        System.out.println(
            Stream.of("Arshad","Aiman","Altamash","Akasha","Asha")
                  .filter(s -> s.length() > 5)
                  .collect(Collectors.toList())
        );

         // filter names and store in a variable before printing
        var filteredNames = Stream.of("Arshad","Aiman","Altamash","Akasha","Asha")
                                  .filter(s -> s.length() > 5)
                                  .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
