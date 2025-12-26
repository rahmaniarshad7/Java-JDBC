package DataStractures.PlacementPrepration.Recurssion;

import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = input.nextInt();

        System.out.println("Enter Power : ");
        int pow = input.nextInt();

        int ans = getPower(num , pow);
        System.out.println(ans);
    }
    public static int getPower(int num , int pow){
        if(pow == 0){
            return 1;
        }
        return num * getPower(num ,  pow - 1);
    }
}
