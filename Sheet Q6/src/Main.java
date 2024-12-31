public static void main(String[] args) {
    BankAccount p1 = new BankAccount("Yazan", 5000.0);
    BankAccount p2 = new BankAccount("Youssef", 2000.0);

    System.out.println("Yazan Balance: " + p1.getBalance()+ " EGP");
    System.out.println("Youssef Balance: " + p2.getBalance() + " EGP");

    System.out.println("_______________________________________________");

    double transferAmount = 1500.0;
    p1.transfer(p2, transferAmount);

    System.out.println("_______________________________________________");

    System.out.println("Yazan's Balance after transfer: " + p1.getBalance()+ " EGP");
    System.out.println("Youssef's Balance after transfer: " + p2.getBalance()+ " EGP");
}