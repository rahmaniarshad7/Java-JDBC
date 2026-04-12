import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = input.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(" Number is " +  result);
    }

}
//https://www.scientecheasy.com/2021/03/what-is-jdk.html/