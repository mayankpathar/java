package javaassignments;
import java.util.Scanner;

public class smallElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Your Array : ");
        int size = sc.nextInt();

        int[] a1 = new int[size];

        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "] : ");
            a1[i] = sc.nextInt();
        }

        smallElement obj = new smallElement();
        int min = obj.smallElement(a1);

        System.out.println("Smallest Element : " + min);
    }

    int smallElement(int[] a1) {
        int min;
        min = a1[0];

        for (int i = 1; i < a1.length; i++) {
            if (a1[i] < min) {
                min = a1[i];
            }
        }
        return min;
    }
}

