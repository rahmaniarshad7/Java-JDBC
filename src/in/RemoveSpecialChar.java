package in;

import java.util.Scanner;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String to Remove Special Char.....  ");
        String str = input.nextLine();
        int len = str.length();

        String result = removeSpecialChar(str , len);
        System.out.println(result);
    }
    public static String removeSpecialChar(String str , int len)
    {
        String ans = "";

        for (int i = 0; i < len; i++)
        {
            int ascii = (int) str.charAt(i);
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
            {
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}
