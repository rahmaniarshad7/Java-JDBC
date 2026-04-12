import java.util.Scanner;

//create a program to find product of two float number
public class Challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num1 : ");
        float num1 = input.nextFloat();
        System.out.println("enter num2 : ");
        float num2 = input.nextFloat();
        float product = num1 * num2;
        System.out.println("product = " + product);

    }

}
