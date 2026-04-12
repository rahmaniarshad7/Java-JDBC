import java.util.Scanner;

//calculate simple interest
public class Challenge12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter principle : ");
        int p = input.nextInt();
        System.out.print("enter rate :");
        int r = input.nextInt();
        System.out.print("enter time : ");
        int t = input.nextInt();
        int simpleInterest = (p * r * t) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        int totalAmount = p + simpleInterest;
        System.out.println("Total Amount to be Paid : " + totalAmount);

    }
}
