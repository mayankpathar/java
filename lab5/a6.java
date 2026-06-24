package lab5;
import java.util.Scanner;
public class a6 {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("enter the length: ");
        int n = sc.nextInt();
        a6 obj = new a6();
        obj.pattern(n);
        sc.close();
    }//main
    void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
        
            }
            System.out.println();
        }
    }
}
