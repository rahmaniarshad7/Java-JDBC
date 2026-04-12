import java.util.Random;
import java.util.Scanner;

class CarRacingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int trackLength = 10;
        int playerPosition = 0;
        int computerPosition = 0;

        System.out.println("Welcome to the Car Racing Game!");

        while (true) {
            // Player's move
            System.out.println("Press Enter to move your car!");
            scanner.nextLine();
            playerPosition += random.nextInt(3) + 1;

            // Computer's move
            computerPosition += random.nextInt(3) + 1;

            // Display the race track
            displayRaceTrack(trackLength, playerPosition, computerPosition);

            // Check for the winner
            if (playerPosition >= trackLength || computerPosition >= trackLength) {
                if (playerPosition >= trackLength && computerPosition >= trackLength) {
                    System.out.println("It's a tie!");
                } else if (playerPosition >= trackLength) {
                    System.out.println("Congratulations! You won!");
                } else {
                    System.out.println("Computer won. Better luck next time!");
                }
                break;
            }
        }

        scanner.close();
    }

    private static void displayRaceTrack(int trackLength, int playerPosition, int computerPosition) {
        System.out.println("\nRace Track:");

        for (int i = 0; i < trackLength; i++) {
            if (i == playerPosition && i == computerPosition) {
                System.out.print("PC");
            } else if (i == playerPosition) {
                System.out.print("P");
            } else if (i == computerPosition) {
                System.out.print("C");
            } else {
                System.out.print("-");
            }
        }

        System.out.println();
    }
}
