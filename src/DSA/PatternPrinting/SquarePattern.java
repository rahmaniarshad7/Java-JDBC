package DSA.PatternPrinting;

import java.util.Scanner;

public class SquarePattern {
    static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int n = input.nextInt();

        for (int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    Output will be: printing solid rectangle pattern
    Enter number of row:
5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

     */
}
