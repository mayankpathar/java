package lba2;
import java.util.Scanner;
public class pog2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("enter the value of b: ");
        int b=sc.nextInt();
        System.out.println("enter the value of function: ");
        char c=sc.next().charAt(0);
        if (c == '+') {
        System.out.println("sum="+(a+b));            
        } else if(c == '-'){
            System.out.println("sub="+(a-b));
        }else if (c == '*' ) {
             System.out.println("mul="+(a*b));
        }else if (c == '/') {
            if (b>0) {
             System.out.println("div="+(a/b));
            }else{
                System.out.println("not difaind");
            }
        } else if(c == '%'){
             System.out.println("tak="+(a%b));
        }else{
            System.out.println("function not difaind");
        }
        sc.close();
    }
}
