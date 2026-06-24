package javaassignments;

import java.util.Scanner;

public class sortArr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();

        int[] a1 = new int[size];

        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "] : ");
            a1[i] = sc.nextInt();
        }

        sortArr obj = new sortArr();
        obj.sortArr(a1);
    }

    void sortArr(int[] a1) {
        int i, j;
        int temp;

        for (i = 0; i < a1.length - 1; i++) {
            for (j = i + 1; j < a1.length; j++) {
                if (a1[i] > a1[j]) {
                    temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for (i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
    }
}

