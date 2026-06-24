package lab10;
abstract class Vegetable {
    String color;

    Vegetable(String color) {
        this.color = color;
    }

    public String toString() {
        return "Vegetable color: " + color;
    }
}

class Potato extends Vegetable {
    Potato(String color) {
        super(color);
    }

    public String toString() {
        return "Potato color: " + color;
    }
}

class Brinjal extends Vegetable {
    Brinjal(String color) {
        super(color);
    }

    public String toString() {
        return "Brinjal color: " + color;
    }
}

class Tomato extends Vegetable {
    Tomato(String color) {
        super(color);
    }

    public String toString() {
        return "Tomato color: " + color;
    }
}

public class a1 {
    public static void main(String[] args) {

        Vegetable v1 = new Potato("Brown");
        Vegetable v2 = new Brinjal("Purple");
        Vegetable v3 = new Tomato("Red");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}