package demo;
import java.util.Scanner;
class bankb {

    int acc_no;
    double balance;
    static String banknm="icici";
    bankb (int acc_no,double balance){
        this.acc_no=acc_no;
        this.balance=balance;
    }
    void disp(){
        System.out.println(acc_no+":"+balance+":"+banknm);
    }
}
public class staticvarB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankb cust1 = new bankb(111,50000);
        cust1.disp();
        bankb.banknm="du_icici";
        bankb cust2 = new bankb(222,90000);
        cust1.disp();
        cust2.disp();
        sc.close();
    }
}