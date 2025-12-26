package CoreJava;

import java.util.Scanner;

public class BillCalculation {

    public static int calculateDeliveryCharge(int distance){
        if(distance <= 3){
            return 0;
        }
        else if(distance > 3 && distance <= 6){
            return (6 - 3) * 1;
        }
        else if(distance > 6){
            return (6 - 3) * 1 + (distance - 6) * 2;
        }
        return 0;
    }

    public static int calculateBill(char foodType , int quantity , int distance){
        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            return -1;
        }

        int costPerPlate = (foodType == 'V') ? 12 : 15;

        // calculating total food coast
        int foodCoast = costPerPlate * quantity;

        // calculating delivery charge
        int deliverCharge = calculateDeliveryCharge(distance);

        //calculating total amount
        int totalAmount = foodCoast + deliverCharge;


        return totalAmount;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       // Get USer Input
        System.out.println("Enter type of food ( V for Vegetarian , N for Non Vegetarian : ");
        char foodType = input.next().charAt(0);

        System.out.println("Enter quantity (Number of Plate) : ");
        int quantity = input.nextInt();

        System.out.println("Enter distance in Km : ");
        int distance = input.nextInt();

        int totalAmount = calculateBill(foodType , quantity , distance);
        System.out.println("Total Bill Amount : " + totalAmount);

    }

}
