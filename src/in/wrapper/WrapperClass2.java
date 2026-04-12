package in.wrapper;

import java.util.Scanner;

public class WrapperClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Value to Print : ");
        Integer integer = Integer.valueOf(input.nextInt());
        System.out.println("Value = " + integer);

        int age = integer;
        System.out.println("Age is = " + age);
    }
}
