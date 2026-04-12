import java.util.Scanner;

public class CountWhiteSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String .....");
        String str = input.nextLine();

        int len = str.length();

        int ans = whiteSpace(str , len);
        System.out.println(ans);
    }
    public static int whiteSpace(String str , int len)
    {
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            if (str.charAt(i) == ' ')
            {
                count++;
            }
        }


        return count;
    }
}
