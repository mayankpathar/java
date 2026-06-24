package lab11;

interface Car {
    void moveForward();

    void moveBackward();

    void moveLeft();

    void moveRight();

    void applyBreak();
}

class Swift implements Car {
        public void moveForward() {
            System.out.println("Swift moves forward");
        }

        public void moveBackward() {
            System.out.println("Swift moves backward");
        }

        public void moveLeft() {
            System.out.println("Swift moves left");
        }

        public void moveRight() {
            System.out.println("Swift moves right");
        }

        public void applyBreak() {
            System.out.println("Swift applies brake");
        }
}

class Thar implements Car {
   public void moveForward() {
        System.out.println("Thar moves forward");
    }

    public void moveBackward() {
        System.out.println("Thar moves backward");
    }

    public void moveLeft() {
        System.out.println("Thar moves left");
    }

    public void moveRight() {
        System.out.println("Thar moves right");
    }

    public void applyBreak() {
        System.out.println("Thar applies brake");
    }
}

public class B4 {
    public static void main(String[] args) {
        Car s = new Swift();
        Car t = new Thar();

        s.moveForward();
        s.moveBackward();
        s.moveLeft();
        s.moveRight();
        s.applyBreak();

        t.moveForward();
        t.moveBackward();
        t.moveLeft();
        t.moveRight();
        t.applyBreak();
    }

}
