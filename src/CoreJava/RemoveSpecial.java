import java.util.Scanner;

public class RemoveSpecial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String to Remove Special character .....  ");
        String name = input.nextLine();
        int len = name.length();

        String result = removeSpecialChar(name , len);
        System.out.println(result);
    }
    public static String removeSpecialChar(String name , int len)
    {
        String ans = "";
        for (int i = 0; i < len; i++)
        {
            int ascii = (int) name.charAt(i);
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
            {
                ans = ans + name.charAt(i);
            }
        }

        return ans;
    }
}
