import java.util.Scanner;

public class pog4 {
    public static void main(String[] args) {
        pog4 obj = new pog4();
        obj.prime();
    }

    void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        int flag=1;
        for(int i=2;i<n;i++){
            if (n%2==0) {
               flag=0;
            }else
            {
                flag=1;
            }
        }
        if (flag==1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }
}
