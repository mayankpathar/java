package lab5;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arr : ");
        int size = sc.nextInt();
        int[] s1 = new int[size];
        System.out.println("enter element of arr : ");
        for (int i = 0; i < s1.length; i++) {
            System.out.print("s[" + i + "] :");

            s1[i] = sc.nextInt();
        }
        a4 obj = new a4();
        obj.copyarr(s1, size);
        sc.close();
    }// main

    void copyarr(int[] s1, int size) {
        int[] a = new int[size];
        for (int i = 0; i < s1.length; i++) {
            a[i]=s1[i];
        }
        System.out.println("copyarr of a");
        for (int i = 0; i < s1.length; i++) {
            System.out.print("a[" + i + "] :" + a[i]);
            System.out.println();
        }
        System.out.println("arr of s1");
        for (int i = 0; i < s1.length; i++) {
            System.out.print("s[" + i + "] :" + s1[i]);
            System.out.println();
        }
    }

}
