import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();

        System.out.print("Enter num3 : ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " Is Greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Is  Greater");
        }else {
            System.out.println(num3 + " Is Greater");
        }
    }
}
