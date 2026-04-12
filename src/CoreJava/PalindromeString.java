import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String to check palindrome : ");
        String str1 = input.nextLine();

        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--)
        {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2))
        {
            System.out.print("String is palindrome ");
        }
        else
            System.out.println("String is not palindrome ");
    }
}
