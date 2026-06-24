package lba6;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.print("enter the string: ");
        s1 = sc.next();
        for (int i = (s1.length() / 2); i < s1.length(); i++) {
            System.out.print(s1.charAt(i));

        }
        sc.close();
    }

}