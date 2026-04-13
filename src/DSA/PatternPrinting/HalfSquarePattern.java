package DSA.PatternPrinting;

public class HalfSquarePattern {
    static void main() {

        int n = 4;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= 6; col++){
                if(row == 1 || row == n){
                    System.out.print("* ");
                }
                else{
                    if (col == 1){
                        System.out.println("* ");
                    }
                    else if (col == 6){
                        System.out.println("* ");
                    }
                    else {
                        System.out.println("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
