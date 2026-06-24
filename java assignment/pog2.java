    import java.util.Scanner;
public class pog2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks Of Three Subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        double percentage = (total / 300.0) * 100;
        System.out.println("Percentage Obtained = " + percentage + "%");
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Student Is Passed");

            if (percentage >= 60) {
                System.out.println("First Division");
            } 
            else if (percentage >= 50 && percentage < 60) {
                System.out.println("Second Division");
            } 
            else {
                System.out.println("Third Division");
            }
        } 
        else {
            System.out.println("Student Is Failed");
        }
        sc.close();
    }
}

