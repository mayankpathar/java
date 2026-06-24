import java.util.Scanner;

public class pog3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        int bill = sc.nextInt();

        if (bill > 5000) {
            bill = bill - (bill * 20) / 100 + (bill * 5) / 100;
        } else if (bill >= 3000 && bill <= 5000) {
            bill = bill - (bill * 10) / 100 + (bill * 5) / 100;
        } else {
            bill = bill + (bill * 5) / 100;
        }

        System.out.println("Final Bill Amount = " + bill);

        sc.close();
    }
}
