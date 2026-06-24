package javaassignments;
import java.util.Scanner;
public class multiplyarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arr : ");
        int size = sc.nextInt();
        int[] s1 = new int[size];
        for (int i = 0; i < s1.length; i++) {
            System.out.println("enter element of arr : ");
            s1[i] = sc.nextInt();
        }
        multiplyarr obj = new multiplyarr();
        int mul = obj.multiplyarr(s1);
        System.out.println("multiply of arr element =" + mul);
        sc.close();
    }//main
    int multiplyarr(int[] s1){
        int mul=1;
        for (int i = 0; i < s1.length; i++) {
            mul=mul*s1[i];
        }
        return mul;
    }
}
