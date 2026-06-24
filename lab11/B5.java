package lab11;
interface Playable {
    void play();
}


class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
}


class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing Volleyball");
    }
}


class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball");
    }
    }


public class B5 {
    public static void main(String[] args) {

        Playable f = new Football();
        Playable v = new Volleyball();
        Playable b = new Basketball();

        f.play();
        v.play();
        b.play();
    }
}