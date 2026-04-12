import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> animal = new LinkedList<>();

        animal.add("Dog");
        animal.add("Cat");
        animal.add("Cow");
        animal.add("Bull");
        animal.add(1 , "Horse");

       String str= animal.get(3);
        System.out.println(str);
        System.out.println(animal.indexOf("Cow"));
    }
}
