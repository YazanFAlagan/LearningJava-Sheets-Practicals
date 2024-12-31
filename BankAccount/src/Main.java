import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                    //Account Array
        Account[] accounts = new Account[2];

                    // Initializing accounts
        accounts[0] = new Account(1, "Yazan", 100, "CIB");
        accounts[1] = new Account(2, "Amir", 300, "NBE");
                    //Account Search
        System.out.println("Accounts ID");
        System.out.println("Yazan = 1 ID, Amir = 2 ID");
        System.out.println("Enter Account ID");
        int searchId = input.nextInt();
        boolean found = false;
        for (Account account : accounts) {
            if (account.search(searchId)) {
                System.out.println("Account found:");
                account.showAccount();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found");
        }

                    //Depositing Section
        System.out.println("Enter Account ID ");
        int depositId = input.nextInt();
        System.out.println("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        for (Account account : accounts) {
            if (account.search(depositId)) {
                account.deposit(depositAmount);
                account.showAccount();
                break;
            }
        }

                    //Withdrawing Section
        System.out.println("Enter Account ID ");
        int withdrawId = input.nextInt();
        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        for (Account account : accounts) {
            if (account.search(withdrawId)) {
                account.withdraw(withdrawAmount);
                account.showAccount();
                break;
            }
        }
    }
}