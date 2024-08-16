package StreamMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberMultiplyBy3 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2 , 3 , 4 , 5 , 6);
        List<Integer> resultList;

        resultList = numberList.stream().map(i -> i * 3).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
