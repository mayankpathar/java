package lab13;

class Th1 implements Runnable {
    Thread t;

    Th1() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Th2 implements Runnable {
    Thread t;

    Th2() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class a2 {
    public static void main(String[] args) {
        new Th1();
        new Th2();
    }
}