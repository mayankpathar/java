package lab5;
import java.util.Scanner;
public class Avgarr {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();

        int[] a1 = new int[size];

        System.out.println("Enter Array Element : ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[" + i + "] : ");
            a1[i] = sc.nextInt();
        }

        Avgarr obj = new Avgarr();
        double avg = obj.averageArr(a1);

        System.out.println("Average Of Your Array : " + avg);
    }

    double averageArr(int[] a1) {
        double avg = 0;
        double sum = 0;
        int i;

        for (i = 0; i < a1.length; i++) {
            sum = sum + a1[i];
        }

        avg = sum / a1.length;
        return avg;
    }
}
