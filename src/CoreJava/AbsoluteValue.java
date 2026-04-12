import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value : ");
        int num = input.nextInt();

        int result = num >= 0 ? num : -num;
        System.out.println(result);
    }
}
