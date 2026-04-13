package DSA.PatternPrinting;

public class PyramidPattern {
    static void main() {

        int n = 5;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n - row; col++){
                //first print space
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
