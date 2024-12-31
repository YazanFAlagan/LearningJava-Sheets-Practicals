
class Account {
    private int id;
    private String personName;
    private double balance;
    private String bankName;

            //Default Constructors
    public Account() {
        this.id = 0;
        this.personName = "Yazan";
        this.balance = 0.0;
        this.bankName = "";
    }
            //Parametrized Constructor
    public Account(int id, String personName, double balance, String bankName) {
        this.id = id;
        this.personName = personName;
        this.balance = balance;
        this.bankName = bankName;
    }

            //Get Function
    public int getId() {
        return id;
    }
    public String getPersonName() {
        return personName;
    }
    public double getBalance() {
        return balance;
    }
    public String getBankName() {
        return bankName;
    }

             //Set Function
    public void setId(int id) {
        this.id = id;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

            //Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

            //Categories
    public void showAccount() {
        System.out.println("Account ID: " + id);
        System.out.println("Person Name: " + personName);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
    }

            //Search With ID
    public boolean search(int id) {
        return this.id == id;
    }
}
