package javaassignments;
import java.util.Scanner;

public class largeElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Your Array : ");
        int size = sc.nextInt();

        int[] a1 = new int[size];

        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "] : ");
            a1[i] = sc.nextInt();
        }

        largeElement obj = new largeElement();
        int max = obj.largeElement(a1);

        System.out.println("Largest Element : " + max);
    }

    int largeElement(int[] a1) {
        int max;
        max = a1[0];

        for (int i = 1; i < a1.length; i++) {
            if (a1[i] > max) {
                max = a1[i];
            }
        }
        return max;
    }
}
