package lab13;

class Generates extends Thread {
    int num = (int) (Math.random() * 10);

    public void run() {
        try {
            if (num % 2 == 0) {
                new even(num).start();
            } else {
                new odd(num).start();
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class even extends Thread {
    int num;

    even(int num) {
        this.num = num;
    }

    public void run() {
        try {
            System.out.println(+num + "=" + (num * num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class odd extends Thread {
    int num;

    odd(int num) {
        this.num = num;
    }

    public void run() {
        try {
            System.out.println(+num + "=" + (num * num * num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class a5 {
    public static void main(String[] args) {
        Generates t = new Generates();
        t.start();
    }
}