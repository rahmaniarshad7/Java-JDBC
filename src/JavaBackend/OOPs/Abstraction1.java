package JavaBackend.OOPs;

import java.util.Scanner;

abstract class Abstraction1 {
    String name;
    int age;
    String contactAddress;

    Abstraction1(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.contactAddress = address;
    }

}

class Arshad extends Abstraction1{

    Arshad(String name, int age, String contactAddress) {
        super(name, age, contactAddress);
    }

    void show() {
        System.out.println(STR."Name: \{name}");
        System.out.println(STR."Age:  \{age}");
        System.out.println(STR."Address: \{contactAddress}");
    }
}
class Aiman extends Abstraction1{

    Aiman(String name, int age, String conactAddress){
        super(name, age, conactAddress);
    }
    void show(){
        System.out.println(STR."Name: \{name}");
        System.out.println(STR."Age:  \{age}");
        System.out.println(STR."Address: \{contactAddress}");
    }
}

class Main{
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter Age: ");
        int age = input.nextInt();

        System.out.println("Enter Address");
        String contactAddress = input.nextLine();

        System.out.println();
        System.out.println("----------------------------------------------");

        Arshad ars = new Arshad(name, age, contactAddress);
        ars.show();

        Aiman aiman = new Aiman("Aiman Fatma", 19, "Araria");
        aiman.show();

    }
}
