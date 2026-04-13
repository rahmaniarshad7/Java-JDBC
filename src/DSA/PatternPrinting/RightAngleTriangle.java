package DSA.PatternPrinting;

import java.util.Scanner;

public class RightAngleTriangle {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Row : ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    Output will be: printing right angle triangle pattern
      5
*
* *
* * *
* * * *
* * * * *
    * */
}
