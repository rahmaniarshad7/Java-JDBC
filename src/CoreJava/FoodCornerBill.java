package CoreJava;

import java.util.Scanner;

public class FoodCornerBill {

    public static int calculateDeliveryCharge(int distance) {
        if (distance <= 3) {
            return 0;
        } else if (distance <= 6) {
            return (distance - 3) * 1;
        } else {
            return (3 * 3) + ((distance - 6) * 6);
        }
    }

    public static int calculateBill(char foodType, int quantity, int distance) {
        // Validate inputs
        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            return -1;
        }

        // Determine cost per plate
        int costPerPlate = (foodType == 'V') ? 12 : 15;

        // Calculate food cost
        int foodCost = costPerPlate * quantity;

        // Calculate delivery charge
        int deliveryCharge = calculateDeliveryCharge(distance);

        // Calculate total bill amount
        return foodCost + deliveryCharge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter type of food (V for Vegetarian, N for Non-Vegetarian): ");
        char foodType = scanner.next().charAt(0);

        System.out.print("Enter quantity (number of plates): ");
        int quantity = scanner.nextInt();

        System.out.print("Enter distance in kms: ");
        int distance = scanner.nextInt();

        // Calculate and print bill amount
        int billAmount = calculateBill(foodType, quantity, distance);
        System.out.println("The total bill amount is: " + billAmount);

        scanner.close();
    }
}
