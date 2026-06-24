package javaassignments;

import java.util.Scanner;

public class sumarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arr : ");
        int size = sc.nextInt();
        int[] s1 = new int[size];
        for (int i = 0; i < s1.length; i++) {
            System.out.println("enter element of arr : ");
            s1[i] = sc.nextInt();
        }
        sumarr obj = new sumarr();
        int sum = obj.sumarr(s1);
        System.out.println("sum of arr element =" + sum);
        sc.close();
    }// main

    int sumarr(int[] s1){
        int sum=0;
         for (int i = 0; i < s1.length; i++) {
           sum=sum+s1[i];
        }
        return sum;
    }
}
