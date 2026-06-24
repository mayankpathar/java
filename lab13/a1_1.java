package lab13;

class Th extends Thread {
    public void run() {
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

public class a1_1 {
    public static void main(String[] args) {
        Th th = new Th();
        th.start();
    }

}