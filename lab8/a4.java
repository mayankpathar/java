package lab8;

class Area {

    static final double PI = 3.14159;

    void cArea(double r) {
        double area = PI * r * r;
        System.out.println("Radius:" + r);
        System.out.println("Area of Circle:" + area);
    }
}

public class a4 {
    public static void main(String[] args) {

        Area obj = new Area();

        obj.cArea(5);
    }
}