package lab10;

abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited in Savings: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
        System.out.println("Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited in Current: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn from Current: " + amount);
        System.out.println("Balance: " + balance);
    }
}

public class a2 {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(1000);
        CurrentAccount c = new CurrentAccount(2000);

        s.deposit(500);
        s.withdraw(300);

        c.deposit(1000);
        c.withdraw(2500);
    }
}
