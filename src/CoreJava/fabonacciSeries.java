import java.util.Scanner;

public class fabonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print("Enter number upto find series : ");
        int num = input.nextInt();
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < num; i++)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
//    //public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter String : ");
//        String str = input.nextLine();
//        int len = str.length();
//
//        removeSpecial(str , len);
//
//    }
//    public static void  removeSpecial(String str , int len)
//    {
//
//        String result = "";
//        for (int i = 0; i < len; i++)
//        {
//            int ascii = (int) str.charAt(i);
//            if ((ascii >= 65 && ascii <= 122) || (ascii >= 97 && ascii <= 122))
//            {
//                result = result + str.charAt(i);
//            }
//        }
//        System.out.println(result);
//
//    }
}
