package lab5;

import java.util.Scanner;

public class Reversarr {
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
        Reversarr obj = new Reversarr();
        obj.reversarr(s1);
        sc.close();
    }// main

    void reversarr(int[] s1) {
        int i;
        for (int j = 0; j < (s1.length/2); j++) {
            int temp=s1[j];
            s1[j]=s1[s1.length-j-1];
            s1[s1.length-j-1]=temp;
        }
        System.out.println("reversed arr : ");
        for (i = 0; i < s1.length; i++) {
            System.out.print("s[" + i + "] :" + s1[i]);
            System.out.println();
        }
    }
}
