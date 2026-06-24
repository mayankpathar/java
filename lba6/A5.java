package lba6;
import java.util.Scanner;

class employeee {
    String name;
    String jobtitle;
    double salary;
    double upSalary;
    

    void setter(String na,String job,double s,double ups){
       name=na;
       jobtitle=job;
       salary=s;
       upSalary=ups;

    }
    void getter(){
        System.out.println();
        System.out.println("name:-"+name);
        System.out.println("jobtitle:-"+jobtitle);
    }
    void totsalary(){
        System.out.println("total salary:-"+(Salary*12));
    }
    void upsalary(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter updeted salary: ");
        Salary=sc.nextDouble();
        System.out.print("updeted salary:-"+(Salary*12));
        sc.close();
    }
}
public class A5 {
    public static void main(String[] args) {
        employeee e1=new employeee();
        employeee e2=new employeee();
        employeee e3=new employeee();
        e1.setter(sc.ne, null, 0, 0);
        e2.setter();
        e3.setter();
        e1.getter();
        e1.totsalary();
        e2.getter();
        e2.totsalary();
        e3.getter();
        e3.totsalary();
        e1.upsalary();
        e2.upsalary();
        e3.upsalary();
    }
}