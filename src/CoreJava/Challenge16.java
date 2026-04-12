import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming.....");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number.....");
        int number = input.nextInt();

        if (number > 0){
            System.out.println("Number is Positive...");
        } else if (number == 0) {
            System.out.println("Number is Zero...");

        }else{
            System.out.println("Number is Negative....");
        }


    }
}
