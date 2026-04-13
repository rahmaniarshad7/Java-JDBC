package DSA.MathForDSA;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        if (num == 2){
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        if(isPrime(num)){
            System.out.println(num + " is Prime Number");
        }
        else {
            System.out.println(num + " is Not Prime Number");
        }
    }
}
