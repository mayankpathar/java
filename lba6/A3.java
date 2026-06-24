/*Create class BankDemo and Account(accNum:int, accType:String, balance: double). Implement getter()
 and setter() method to assign and display data for 3 students.[A] */
package lba6;
import java.util.Scanner;
class Bank_account {
    int acc_no;
    int tepy;
    double balance;

    void setter(int a,int t, double b) {
        acc_no = a;
        tepy = t;
        balance = b;
    }

    void getter() {
        System.out.println(acc_no + ":" + tepy + ":" + balance);
    }
}
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_account b1 = new Bank_account();
        Bank_account b2 = new Bank_account();
        Bank_account b3 = new Bank_account();
        b1.setter(sc.nextInt(), sc.nextInt(), sc.nextDouble());
        b2.setter(sc.nextInt(), sc.nextInt(), sc.nextDouble());
        b3.setter(sc.nextInt(), sc.nextInt(), sc.nextDouble());
        b1.getter();
        b2.getter();
        b3.getter();
        sc.close();
    }
}
