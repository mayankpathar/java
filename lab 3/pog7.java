import java.util.Scanner;

public class pog7 { 
    public static void main(String[] args) {
        pog7 obj = new pog7();
        obj.prime();
    }

    void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of b: ");
        int b = sc.nextInt();
        int flag=1;
        for(int i=2;i<=a;i++){
           while (a<=b) {
             if (a%2==0) {
                flag=0;
                a++;
             }else
             {
                 flag=1;
                 a++;
             }
           }
           if (flag==1) {
            System.out.println(a+"prime");
        } else {
            System.out.println(a+"not prime");
        }
        }
        
        sc.close();
    }
}

