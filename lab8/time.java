package lab8;
import java.util.Scanner;
class time_b{
    int hr,min,sec;
    time_b(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    time_b(){
        this.hr=0;
        this.min=0;
        this.sec=0;
    }
    time_b addtime(time_b t1,time_b t2,time_b t3){
        this.sec=t1.sec+t2.sec+t3.sec;
        this.min=t1.min+t2.min+t3.min;
        this.hr=t1.hr+t2.hr+t3.hr;
        if (this.sec>=60) {
            this.min=this.min+this.sec/60;
            this.sec=this.sec%60;
        }
        if (this.min>=60) {
            this.hr=this.hr+this.min/60;
            this.min=this.min%60;
        }
        return this;//hr,min,sec
    }

}
public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        time_b t1 = new time_b(02, 55, 55);
        time_b t2 = new time_b(03, 07, 10);
        time_b t3 = new time_b(04, 05, 20);
        time_b t4 = new time_b();
        t4 = t4.addtime(t1,t2,t3);
        System.out.println(t4.hr+"::"+t4.min+"::"+t4.sec);
        sc.close();
    }
}
