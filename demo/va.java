package demo;

import java.util.Scanner;

class StringLengthHalf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        int length = str.length();
        System.out.println("Length of String = " + length);

        int index = length / 2;

        String str1 = str.substring(index);

        System.out.println("The Second Half String = " + str1);
    }
}