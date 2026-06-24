import java.util.Scanner;

public class pog5 {
    public static void main(String[] args) {
        pog5 obj = new pog5();
        obj.leap_year();
    }

    void leap_year() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of year: ");
        int n = sc.nextInt();
        if ((n%4==0 && n%100!=0 ) || n%400==0) {
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
        sc.close();
    }
}
