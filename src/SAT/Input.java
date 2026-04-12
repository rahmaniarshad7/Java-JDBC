package SAT;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number to find Sum ");

        int num = input.nextInt();
        int sum = 0;

        int i = 1;
        while(i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

    }
}
