import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String to check Palindrome  ");
        String str = input.nextLine();
        String ans1 = str.toLowerCase();

        int len = str.length();
         String result = checkPalindrome(ans1 , len);

         if (ans1.equals(result))
         {
             System.out.println("String is Palindrome");
         }
         else{
             System.out.println("String is not Palindrome");
         }

    }
    public static String checkPalindrome(String ans1 , int len)
    {
        String ans = "";
        for (int i = len -1; i >= 0; i--)
        {
            ans = ans + ans1.charAt(i);
        }

        return ans;
    }
}
