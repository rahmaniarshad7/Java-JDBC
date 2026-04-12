import java.util.Scanner;

public class RemoveA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String to Remove A :  ");
        String str = input.nextLine();

        int len = str.length();

        String result = removeA(str , len);
        System.out.println(result);
    }
    public static String removeA(String str , int len)
    {
        String ans = "";
        for (int i = 0; i < len; i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
            {
                ans = ans + str.replace(str.charAt(i) , '@');
            }

        }

        return ans;
    }
}
