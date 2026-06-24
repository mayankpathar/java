package lab13;

class Th1 implements Runnable{
   
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("in th");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class a1_2 {
    public static void main(String[] args) {
        Th1 th1=new Th1();
        Thread t1 =new Thread(th1);
        t1.start();
    }
}