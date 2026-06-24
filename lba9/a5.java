package lba9;

class MyPoint {

    private double x;
    private double y;


    MyPoint() {
        x = 0;
        y = 0;
    }

   
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double distance(MyPoint p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}

class ThreeDPoint extends MyPoint {

    private double z;


    ThreeDPoint() {
        super();
        z = 0;
    }

  
    ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    double getZ() {
        return z;
    }

    double distance(ThreeDPoint p) {
        double dx = getX() - p.getX();
        double dy = getY() - p.getY();
        double dz = z - p.z;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class a5 {
    public static void main(String[] args) {

        ThreeDPoint p1 = new ThreeDPoint(0, 0, 0);
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);

        double dist = p1.distance(p2);

        System.out.println("Distance between two 3D points: " + dist);
    }
}