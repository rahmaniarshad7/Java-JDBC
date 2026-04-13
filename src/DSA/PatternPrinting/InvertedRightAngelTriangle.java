package DSA.PatternPrinting;

import java.util.Scanner;

public class InvertedRightAngelTriangle {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n - row + 1; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
