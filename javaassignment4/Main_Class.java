package javaassignment4;

import java.util.Scanner;

class Bank_account {
    int acc_no;
    private int pin;
    double balance;

    void setter(int a, double b, int p) {
        acc_no = a;
        pin = p;
        balance = b;
    }

    void getter(int a, int p) {
        if (a == acc_no) {
            if (p == pin) {
                System.out.println(acc_no + ":" + balance);
            } else {
                System.out.println("Pin Is Invalid");
            }
        }
    }
}

public class Main_Class {
    public static void main(String[] args) {
        Bank_account b1 = new Bank_account();
        Bank_account b2 = new Bank_account();
        Bank_account b3 = new Bank_account();
        Scanner sc = new Scanner(System.in);
        int acc_no1 = 2501287;
        int acc_no2 = 6342882;
        int acc_no3 = 5757532;
        System.out.print("Enter Account Number : ");
        int acc = sc.nextInt();
        System.out.print("Enter Pin Number : ");
        int pin = sc.nextInt();
        b1.setter(acc_no1, 60000.60, 4963);
        b2.setter(acc_no2, 70000.90, 5869);
        b3.setter(acc_no3, 80000.85, 4989);
        b1.getter(acc, pin);
        b2.getter(acc, pin);
        b3.getter(acc, pin);
        sc.close();
    }
}