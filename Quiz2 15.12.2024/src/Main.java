

    public static void main(String[] args) {
        Account savings = new SavingAccount(1000);
        savings.deposit(500);
        System.out.println("Savings Account Balance: " + savings.getBalance());

        Account checking = new CheckingAccount(500);
        checking.deposit(300);
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }
