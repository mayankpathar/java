package lab1;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("sum=" + (a + b));
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number i: ");
        int i = sc.nextInt();
        System.out.print("enter the number j: ");
        int j = sc.nextInt();
        System.out.println("sum=" + (i + j));
        sc.close();
    }
}
