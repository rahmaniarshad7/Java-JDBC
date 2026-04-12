import java.util.Scanner;

//calculate compound interest
public class Challenge13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        int p = input.nextInt();
        System.out.println("Enter Rate : ");
        int r = input.nextInt();
        System.out.println("Enter time : ");
        int t = input.nextInt();
        int compoundInterest = p*(1 + r/100) * t;
        System.out.println("Compound interest = " + compoundInterest);
        int totalAmount = p + compoundInterest;
        System.out.println("Total Amount to be paid = " + totalAmount);
    }
}
