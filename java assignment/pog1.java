import java.util.Scanner;
public class pog1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units Of Bill: ");
        int unit = sc.nextInt();

        int bill = 0;

        if (unit <= 100) {
            bill = bill + unit * 5;
        } else if (unit <= 200) {
            bill = bill + 100 * 5 + (unit - 100) * 7;
        } else {
            bill = bill + 100 * 5 + 100 * 7 + (unit - 200) * 10;
        }
        System.out.println("Bill Amount = " + bill);
        sc.close();
    }
}
