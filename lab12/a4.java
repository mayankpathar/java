package lab12;
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Num1: ");
            String input1 = sc.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("Enter Num2: ");
            String input2 = sc.nextLine();
            int num2 = Integer.parseInt(input2);

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input must be an integer."+e.toString());
        } catch (ArithmeticException ae) {
            System.out.println("Error: Division by zero is not allowed."+ae.toString());
        } finally {
            sc.close();
        }
    }
}