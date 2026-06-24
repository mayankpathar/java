package lab7;

import java.util.Scanner;

class time_b {
    double hr, min;

    time_b(double hr, double min) {
        this.hr = hr;
        this.min = min;
    }

    time_b() {
        this.hr = 0;
        this.min = 0;
    }

    public double calculateAngle() {


        double minuteAngle = min * 6;

        double hourAngle = (hr % 12) * 30 + min * 0.5;

        double angle = Math.abs(hourAngle - minuteAngle);

        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }
}

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-12): ");
        double hours = sc.nextDouble();

        System.out.print("Enter minutes (0-59): ");
        double minutes = sc.nextDouble();

        time_b clock = new time_b(hours, minutes);
        double angle = clock.calculateAngle();

            System.out.println("\nTime: " + hours + ":" + minutes);
            System.out.println("Angle : " + angle + " degrees");


        sc.close();
    }
}
