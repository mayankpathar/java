package javaassignments;
import java.util.Scanner;
public class reversarr {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arr : ");
        int size = sc.nextInt();
        int[] s1 = new int[size];
        System.out.println("enter element of arr : ");
        for (int i = 0; i < s1.length; i++) {
            System.out.print("s["+i+"] :");

            s1[i] = sc.nextInt();
        }
        reversarr obj = new reversarr();
        obj.reversarr(s1);
        sc.close();
    }//main
    void reversarr(int[] s1){
        int i;
        System.out.println("reversed arr : ");
        for ( i = s1.length-1; i >= 0; i--) {
           System.out.print("s["+i+"] :" + s1[i]); 
           System.out.println();
        }
    }
}
