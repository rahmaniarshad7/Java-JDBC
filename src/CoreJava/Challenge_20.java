import java.util.Scanner;

public class Challenge_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number");
        int num = input.nextInt();
        table1(num);
    }
    public static void table1(int a){

        int i =1;
        while(i <= 10){
            System.out.println(a + "  *  " + i + " = "+ a*i );
            i++;
        }
    }
}
