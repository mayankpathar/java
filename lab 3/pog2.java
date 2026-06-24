import java.util.Scanner;

public class pog2 {
    public static void main(String[] args) {
        pog2 obj = new pog2();
        obj.odd_even();
    }

    void odd_even() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println(n+"is even");
        } else {
            System.out.println(n+"is odd");
        }
        sc.close();
    }
}
