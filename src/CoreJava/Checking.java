import java.sql.SQLOutput;
import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("plz....Enter your Age : ");
        int age = input.nextInt();

        System.out.print("Are you female? enter true / false : ");
        boolean isfemale = input.hasNextBoolean();
        if (age < 5){
            System.out.println("You got 75% discount : ");
        } else if (age < 5 && isfemale) {
            System.out.println("You got 50% discount.....");

        } else if (age > 60 && !isfemale) {
            System.out.println("You got 25% discount...");

        } else {
            System.out.println("you Are not eligible....");
        }

    }
}