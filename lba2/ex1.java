package lba2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.println("* ");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println("\n");
        }

    }
}
