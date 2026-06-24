package lab12;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter a& b");
        a=sc.nextInt();
        b=sc.nextInt();
        int[] arr={1,2,3};
            try{
           int ans=a/b;
           System.out.println("ans:"+ans);
           
        }
        catch(ArithmeticException ae){
           System.out.println("Arithmatic exp!"+ae.toString());
        }
        try{
            System.out.println("array"+arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException ae2){
            System.out.println("ArrayIndexOutOfBoundsException!!"+ae2.toString());
        }
        
        sc.close();
        
        
    }
}