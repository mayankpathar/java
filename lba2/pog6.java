package lba2;

import java.util.Scanner;

public class pog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();
            System.out.println("enter the value of function: ");
            char c = sc.next().charAt(0);
            switch (c) {
                case '+':
                    System.out.println("sum=" + (a + b));
                    break;
                case '-':
                    System.out.println("sub=" + (a - b));
                    break;
                case '*':
                    System.out.println("mul=" + (a * b));
                    break;
                case '/':
                    if (b > 0) {
                        System.out.println("div=" + (a / b));
                    } else {
                        System.out.println("not difaind");
                    }
                    break;
                case '%':
                    System.out.println("tak=" + (a % b));
                    break;
                case 'e':
                    return;
                default:
                    System.out.println("invalid number");
                    break;
            }
        }

    }

}

