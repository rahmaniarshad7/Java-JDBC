
import java.util.Scanner;

public class RemoveSpecialChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter String....");
        String str = input.nextLine();

        int len = str.length();

        removeSpecialChracter(str , len);

    }
    public static void removeSpecialChracter(String str , int len)
    {
        String ans = "";
        for (int i = 0; i < len; i++)
        {
            int ascii = (int) (str.charAt(i));
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122))
            {
                ans = ans + str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}


// System.out.print("Enter String .....");
//    String str = input.nextLine();
//
//    int len = str.length();
//
//    removeSpecial(str , len);
//
//}
//public static void removeSpecial(String str , int len)
//{
//    String ans = "";
//    for (int i = 0; i < len; i++)
//    {
//        if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
//        {
//            ans = ans + str.charAt(i);
//        }
//    }
//    System.out.println(ans);
//}








// public static void main(String[] args) {
//    Scanner input = new Scanner(System.in);
//
//    System.out.print("Enter String : ");
//    String str = input.nextLine();
//    int len = str.length();
//
//    removeSpecial(str , len);
//
//}
//public static void  removeSpecial(String str , int len)
//{
//
//    String result = "";
//    for (int i = 0; i < len; i++)
//    {
//        int ascii = (int) str.charAt(i);
//        if ((ascii >= 65 && ascii <= 122) || (ascii >= 97 && ascii <= 122))
//        {
//            result = result + str.charAt(i);
//        }
//    }
//    System.out.println(result);
//
//}

