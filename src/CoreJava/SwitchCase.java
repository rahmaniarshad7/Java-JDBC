import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Welcome to find number of day : ");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day Number : ");
        int day = input.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println(" Invalid day");
            }
        }
    }
