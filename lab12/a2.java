package lab12;
import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String msg) {
        super(msg);
    }
}
class Account {
    double balance;
    double minBalance = 1000;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " +amount);
        System.out.println("Balance: " +balance);
    }

    void withdraw(double amount) throws InSufficientFundException {
        if (balance - amount < minBalance) {
            throw new InSufficientFundException("Minimum balance must be 1000!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " +amount);
            System.out.println("Balance: " +balance);
        }
    }

    void showBalance() {
        System.out.println("Current Balance: "+balance);
    }
}

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        Account acc = new Account(bal);

       System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                double d = sc.nextDouble();
                acc.deposit(d);
                break;

            case 2:
                System.out.print("Enter withdraw amount: ");
                double w = sc.nextDouble();
                try {
                    acc.withdraw(w);
                } catch (InSufficientFundException e) {
                    System.out.println("Error: " +e.getMessage());
                }
                break;


            default:
                System.out.println("Invalid choice!");
        }
    }
}