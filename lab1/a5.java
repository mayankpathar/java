package lab1;
import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the meters: ");
        int a = sc.nextInt();
        System.err.println("feet="+(a*12));
        sc.close();
    }
}
