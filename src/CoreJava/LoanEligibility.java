package CoreJava;

import java.util.Scanner;

public class LoanEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter account balance:");
        double accountBalance = scanner.nextDouble();

        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter loan type (car/business/house):");
        String loanType = scanner.next().toLowerCase();

        System.out.println("Enter expected loan amount:");
        double expectedLoanAmount = scanner.nextDouble();

        System.out.println("Enter expected number of EMIs:");
        int expectedEMIs = scanner.nextInt();

        // Validate account number
        if (!isValidAccountNumber(accountNumber)) {
            System.out.println("Invalid account number. It should be 4 digits and start with 1.");
            return;
        }

        // Validate account balance
        if (accountBalance < 1000) {
            System.out.println("Insufficient account balance. Minimum balance should be $1000.");
            return;
        }

        // Determine eligibility
        double eligibleLoanAmount = 0;
        int maxEMIs = 0;

        switch (loanType) {
            case "car":
                eligibleLoanAmount = 500000;
                maxEMIs = 36;
                break;
            case "business":
                eligibleLoanAmount = 750000;
                maxEMIs = 60;
                break;
            case "house":
                eligibleLoanAmount = 1000000;
                maxEMIs = 84;
                break;
            default:
                System.out.println("Invalid loan type. Choose from car, business, or house.");
                return;
        }

        // Check loan eligibility
        if (expectedLoanAmount <= eligibleLoanAmount && expectedEMIs <= maxEMIs) {
            System.out.println("Loan approved!");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
            System.out.println("Requested Loan Amount: " + expectedLoanAmount);
            System.out.println("Requested Number of EMIs: " + expectedEMIs);
        } else {
            System.out.println("Loan not approved.");
        }

        scanner.close();
    }

    // Validate account number
    private static boolean isValidAccountNumber(String accountNumber) {
        if (accountNumber.length() == 4 && accountNumber.charAt(0) == '1') {
            try {
                Integer.parseInt(accountNumber); // Ensure all characters are digits
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }
}
