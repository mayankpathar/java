package lba2;
import java.util.Scanner;
public class pog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of fahrenheit: ");
        int f=sc.nextInt();
        System.out.println("celsius="+(f-(32*5/9)));
        System.out.println("enter the value of celsius: ");
        int c=sc.nextInt();
        System.out.println("fahrenheit="+(c+(32*5/9)));
        sc.close();
    }
}
