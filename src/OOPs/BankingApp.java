package OOPs;

// Abstract Class
abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract methods (must be implemented by subclasses)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Common method
    public void checkBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }

}

// Savings Account
class SavingsAccount extends BankAccount {
    private double interestRate = 0.05; // 5% interest

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited with interest. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    private double overdraftLimit = 5000;

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded!");
        }
    }
}

// Main Application
public class BankingApp {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Arshad", 10000);
        BankAccount acc2 = new CurrentAccount("Rahul", 5000);

        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.checkBalance();

        acc2.deposit(1000);
        acc2.withdraw(7000);
        acc2.checkBalance();
    }
}

