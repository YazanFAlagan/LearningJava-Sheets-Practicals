public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Default
    public BankAccount() {
        this.accountNumber = "ارزقنا يارب";
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Enter Positive Balance.");
        }
    }

    // Transfer Method
    public void transfer(BankAccount recipient, double amount) {
        if (amount <= 0) { // Will send
            System.out.println("Amount must be positive.");
            return;
        }
        if (this.balance >= amount) { // Check for Avail
            this.balance -= amount;
            recipient.balance += amount;
            System.out.println("Successfully Transferred " + amount + " to " + recipient.getAccountNumber() + " account " );
        } else {
            System.out.println("Transfer cannot be Done, Balance isn't Enough .");
        }
    }
}
