package lba2;

import java.util.Scanner;

public class pog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("enter the value of c: ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("largest number"+a);
            } else {
                System.out.println("largest number"+c);
            }
        } else {
            if (b > c) {
                System.out.println("largest number"+b);
            } else {
                System.out.println("largest number"+c);
            }
        }
        sc.close();
    }
}
