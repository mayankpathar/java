package lab12;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a add:");
         int a=sc.nextInt();
         System.out.print("b add:");
        int b=sc.nextInt();
        int[] arr={1,2,3};
        try {
            int c=a/b;
            System.out.println("c:"+c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        try {
            System.out.println("arr[4]"+arr[4]);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        sc.close();
    }
    
}
