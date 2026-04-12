package SAT;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int fact = 1;
        while(i <=5){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);


    }
}
