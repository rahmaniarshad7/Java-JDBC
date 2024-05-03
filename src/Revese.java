import java.util.Scanner;

public class Revese {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String to reverse : ");
        String str = input.nextLine();

        int len = str.length();

        String reverse_str = reverse(str , len);
        System.out.println(reverse_str);
    }
    public static String reverse(String str , int len)
    {
        String rev = "";
        for (int i = len - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        return rev;
    }
}
