import java.util.Scanner;
public class pog3 {
    public static void main(String[] args) {
        pog3 obj = new pog3();
        obj.maximum();
    }
    void maximum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("enter the value of c: ");
        int c = sc.nextInt();
        System.out.println("maximum number"+((a>b)?(a):((b>c)?(b):(c))));
        sc.close();
    }
}
