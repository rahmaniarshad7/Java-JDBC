package JavaBackend.OOPs;

class Account {
    // Instance variables
    int accountId;
    String custName;
    double balance;

    // method to initialize values of instance variables
    void setAccountValues(int accountId, String custName, double balance) {
        this.accountId = accountId;
        this.custName = custName;
        this.balance = balance;
    }

    // method to deposit an amount
    double deposit(double amount) {
        this.balance += amount;
        System.out.println(STR."Amount deposited for \{custName} is \{amount} , Balance after deposit= \{this.balance}");
        return this.balance;
    }

    // method to withdraw amount from an account
    double withdraw(double amount) {
        // to be implemented later
        return 0.0;
    }

    // method to display account details
    void display() {
        System.out.println("Displaying details of Customer's account");
        System.out.println(STR."Account Id : \{accountId}");
        System.out.println(STR."Customer Name : \{custName}");
        System.out.println(STR."Balance : \{balance}");
    }
}

class ClassExample {
    public static void main(String[] args) {
        // Object creation using new keyword
        Account account1 = new Account();
        // Method Invocation using .(dot) operator to initialize the instance variables
        account1.setAccountValues(10011, "Tom", 500.0);
        // Deposit an amount of 100.0 currency
        account1.deposit(100);
        // Invoke method to display account details
        account1.display();
        System.out.println("**************************************");
        // Creation of another object of type Account
        Account account2 = new Account();
        account2.setAccountValues(10012, "Mary", 600.0);
        account2.deposit(200);
        account2.display();
    }
}