package StreamMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MapException{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> filteredNumbers = new ArrayList<>();

        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * 2)
                .forEach(filteredNumbers::add);
        System.out.println(filteredNumbers);
    }
}
