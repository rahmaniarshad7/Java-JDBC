package JavaBackend.OOPs;
class Account1{
    int accountId;
    String custName;
    int balance;

    // constructor
    Account1(int accountId, String custName, int balance){
        this.accountId = accountId;
        this.custName = custName;
        this.balance = balance;
    }

    // Method to Deposit Balance into Account
    void deposit(int amount){
        if(amount > 0){
            balance += amount;
        }
        System.out.println(STR."Account is Credited with amount Rs. \{amount} Avl Bal \{balance}");
    }

    // Method to Withdraw Money
    void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(STR."Your account is debited with amt \{amount} Avl bal \{balance}");
        }
        else{
            System.out.println("Insufficient Balance...");
        }

    }
}


public class TransactionTryout1 {
    public static void main() {

        Account1 account = new Account1(110011, "Arshad Rahman", 500);
        account.deposit(500);
        account.withdraw(200);
    }
}
