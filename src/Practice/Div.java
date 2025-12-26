package Practice;

import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = input.nextInt();

        int ans = num / 10;
        System.out.println(ans);
    }
}
