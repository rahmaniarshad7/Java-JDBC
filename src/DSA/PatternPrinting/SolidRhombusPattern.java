package DSA.PatternPrinting;

import java.util.Scanner;

public class SolidRhombusPattern {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of row: ");
        int n = input.nextInt();

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }
            for(int i = 0; i < 5; i++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
