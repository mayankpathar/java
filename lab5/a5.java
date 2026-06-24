package lab5;
import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter of arr name : ");
        String a=sc.next();
        a5 obj = new a5();
        obj.string(a);
        sc.close();
    }//main
    void string(String a){
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < i+1; j++) {
            System.out.print(a.charAt(j));
        
            }
            System.out.println();
        }
    }
}
