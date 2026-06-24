package lab12;

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String a) {
        super(a);
    }
}
class a{
    void check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age: ");
        int age=sc.nextInt(); 
       try{
         if (age<18) {
            throw new AgeException("age under 18");
        }else{
            System.out.println("age is valide");
        }
       }
       catch(AgeException e){
        System.out.println("under 18");
      }
    }
}

public class a3{

    public static void main(String[] args) {
      a ag=new a();
      ag.check();
      
    }
}