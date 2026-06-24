package lba9;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of student: ");
        int size = sc.nextInt();
        student[] s = new student[size];
        for (int i = 0; i < s.length; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int no_sub = sc.nextInt();

             s[i] = new student(id, no_sub);

            for (int j = 0; j < no_sub; j++) {
                System.out.print("Enter subject code: ");
                s[i].sub_code[j] = sc.next();

                System.out.print("Enter subject credits: ");
                s[i].sub_cre[j] = sc.nextInt();

                System.out.print("Enter grade obtained (A/B/C/D/F): ");
                s[i].grade[j] = sc.next();
                System.out.println();
            }

            s[i].calculate_spi();
        }
        sc.close();

        System.out.println("\n--- Student SPI Details ---");
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}

class student{
    int id,no_sub;
    String[] sub_code;
    int[] sub_cre;
    String[] grade;
    double spi;


    student(int id,int no_sub){
        this.id=id;
        this.no_sub=no_sub;

        sub_code = new String[no_sub];
        sub_cre = new int[no_sub];
        grade = new String[no_sub];
    }
    void calculate_spi(){
        int totalCredits = 0;
        int weightedSum = 0;

        for (int i = 0; i < no_sub; i++) {
            int gradePoint = getGradePoint(grade[i]);
            weightedSum += gradePoint * sub_cre[i];
            totalCredits += sub_cre[i];
        }

        if (totalCredits != 0)
            spi = (double) weightedSum / totalCredits;
        else
            spi = 0;
    }
    int getGradePoint(String grade) {
        switch (grade) {
            case "A": return 10;
            case "B": return 8;
            case "C": return 6;
            case "D": return 4;
            case "F": return 0;
            default: return 0;
        }
    }

   

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("SPI: " + spi);
    }
}