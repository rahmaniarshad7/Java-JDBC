import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args) {
        System.out.println("Welcome to Driving Licence Portal : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please....Enter your Age : ");
        int age = input.nextInt();
        if (age >= 18 )
        {
            System.out.println("Congratulation You can drive....");
        }
        else{
            System.out.println("Sorry You can not drive you are under age....");
        }
    }
}
