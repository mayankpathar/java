package lab8;

class BankAccount {


    int acNo;
    double balance;
    static String bN;
    static double iR;

    BankAccount(int acNo, double balance) {
        this.acNo = acNo;
        this.balance = balance;
    }

    static void setter1(String na) {
        bN = na;
    }

    static void setter2(double ra) {
        iR = ra;
    }

    static String getter1() {
        return bN;
    }

    static double getter2() {
        return iR;
    }

   
    void display() {
        System.out.println("Account No: " + acNo);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bN);
        System.out.println("Interest Rate: " + iR + "%");
        System.out.println();

    }
}

public class a3 {
    public static void main(String[] args) {

        BankAccount.setter1("pm Bank");
        BankAccount.setter2(6.5);

  
        BankAccount a1 = new BankAccount(101, 50000);
        BankAccount a2 = new BankAccount(102, 60000);
        BankAccount a3 = new BankAccount(103, 200000);
        

        a1.display();
        a2.display();
        a3.display();
    }
}