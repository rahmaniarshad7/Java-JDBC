import java.util.Scanner;

public class LearningLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        //initialing loop in java
        int num2 = 1;
        while (num2 <= num) {
            System.out.println(num2);
            num2++;
        }
    }
}
