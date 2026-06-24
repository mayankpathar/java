package lab5;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the arr size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        // read arry
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter arr elements:");
            a[i] = sc.nextInt();
        }
        // short arry
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("how to times roteed arry: ");
        int n = sc.nextInt();
        System.out.print("What is your target:");
        int t = sc.nextInt();
        A7 obj = new A7();
        obj.roteed(a, size, n, t);
    }

    void roteed(int[] a, int size, int n, int t) {
        for (int i = 0; i < n; i++) {
            int temp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = temp;
        }
        // rotted arry print
        System.out.print("roteed arr: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        int c=0;
        for (int i = 0; i < a.length; i++) {
            if (t == a[i]) {
                System.out.println("output: "+i);
                c++;
            }
        }
        if (c==0) {
            System.out.println("output: -1");
        }
    }
}