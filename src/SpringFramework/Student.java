package SpringFramework;

public class Student {
    public static void main(String[] args) {
        String name = "Arshad";
        String course = "Computer Application";
        String id = "22360900081";

        System.out.println(name);
        System.out.println(course);
        System.out.println(id);

        Address address = new Address();
        address.local = "Gokhlapur";
        address.city = "Forbesganj";
        address.state = "Bihar";

       address.display();
    }
}
