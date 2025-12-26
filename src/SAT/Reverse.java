package SAT;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = input.nextLine();

        int len = str.length();
        for (int i = len - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
