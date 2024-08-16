package StreamMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingLength {
    public static void main(String[] args) {

        List<String> transport = Arrays.asList("Bus" , "Train" , "Aeroplane" , "Bike" , "Cycle");
        List<Integer> length;

        length = transport.stream().map(name -> name.length()).collect(Collectors.toList());
        System.out.println(length);

    }
}
