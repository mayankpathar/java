package lab11;

interface EventListener {
    void performEvent();
}


interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}


interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener, KeyListener {

    public void performEvent() {
        System.out.println("Eventperformed");
    }

    public void mouseClicked() {
        System.out.println("MouseClicked");
    }

    public void mousePressed() {
        System.out.println("MousePressed");
    }

    public void mouseReleased() {
        System.out.println("MouseReleased");
    }

    public void mouseMoved() {
        System.out.println("MouseMoved");
    }

    public void mouseDragged() {
        System.out.println("MouseDragged");
    }

    public void keyPressed() {
        System.out.println("KeyPressed");
    }

    public void keyReleased() {
        System.out.println("KeyReleased");
    }
}


public class B2 {
    public static void main(String[] args) {
        EventDemo a = new EventDemo();

        a.performEvent();

        a.mouseClicked();
        a.mousePressed();
        a.mouseReleased();
        a.mouseMoved();
        a.mouseDragged();

        a.keyPressed();
        a.keyReleased();
    }
}
