import java.util.Scanner;

public class MinimumNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = input.nextLine();
        int len = str.length();

        String org = removeSpecialChar(str , len);
        System.out.println(org);
    }
    public static String removeSpecialChar(String str , int len)
    {
        String ans = "";
        for (int i = 0; i < len; i++)
        {
            int ascii =  (int) str.charAt(i);
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
            {
                ans = ans + str.charAt(i);
            }

        }
        return ans;
    }
}

//import java.util.Scanner;
//
//public class MinimumNumber {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter num1 : ");
//        int num1 = input.nextInt();
//
//        System.out.print("Enter num2 : ");
//        int num2 = input.nextInt();
//
//        int minimum = num1 < num2 ? num1 : num2;
//        System.out.println(minimum);
//    }
//}
