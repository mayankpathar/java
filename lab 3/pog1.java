import java.util.Scanner;
public class pog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of subjects s1: ");
        int s1 = sc.nextInt();
        System.out.println("enter the value of subjects s2: ");
        int s2 = sc.nextInt();
        System.out.println("enter the value of subjects s3: ");
        int s3 = sc.nextInt();
         System.out.println("enter the value of subjects s4: ");
        int s4 = sc.nextInt();
        System.out.println("enter the value of subjects s5: ");
        int s5 = sc.nextInt();
        float pre=(s1+s2+s3+s4+s5)*100/5;
        pog1 obj=new pog1();
        obj.renk(pre);
        sc.close();
          
    }
    void renk(float pre){
 if (pre>=60) {
            System.out.println("first");
            
        }else if (pre>=50) {
            System.out.println("second");
        } else if(pre>=40) {
            System.out.println("third");
        }else {
            System.out.println("fail");
        }
    }
}
