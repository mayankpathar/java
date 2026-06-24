/*Create class Student with attributes (name: String, roll_no:int, SPI:double,
course: String). Implement getter() and setter() method to assign data for 3 students and display it.[A] */
package lba6;

import java.util.Scanner;

class student {

    String name;
    int roll_no;
    double spi;
    String course;

    void setter(String na, int roll, double s, String cou) {
        name = na;
        roll_no = roll;
        spi = s;
        course = cou;
    }

    void getter() {
        System.out.println(name + ":" + roll_no + ":" + spi + ":" + course);
    }
}

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        System.out.println("enter the student of 1:");
        s1.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        System.out.println("enter the student of 2:");
        s2.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        System.out.println("enter the student of 3:");
        s3.setter(sc.next(), sc.nextInt(), sc.nextDouble(), sc.next());
        s1.getter();
        s2.getter();
        s3.getter();
        sc.close();
    }
}
