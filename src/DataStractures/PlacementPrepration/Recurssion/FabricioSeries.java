package DataStractures.PlacementPrepration.Recurssion;

import java.util.Scanner;

public class FabricioSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n1 = 0;
         int n2 = 1;

        System.out.println("Enter Number : ");
        int num = input.nextInt();
        int sum = 0;
         for (int i = 0; i <= num; i++){
             System.out.println(" " + n1 + n2);
             n2 = sum;
             n1 = n2;
         }
        System.out.println(sum);
    }
}
