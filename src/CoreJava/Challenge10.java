import java.util.Scanner;

//calculating perimeter of rectangle.....
public class Challenge10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length of rectangle : ");
        int len = input.nextInt();
        System.out.print("enter bre of rectangle : ");
        int bre = input.nextInt();
        int perimeter = 2*(len + bre);
        System.out.println("perimeter of rectangle = " + perimeter);
    }

}
