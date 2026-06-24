/*Create class Cube with attributes (height, width and depth with double datatype). Implement getter() and setter()
 method to assign data for 2 cubes. Create method volume() to calculate volume for 2 cubes. [A] */
package lba6;
import java.util.Scanner;
class Cube {

    double height;
    double width;
    double depth;

    void setter(double he,double wi,double de) {
        height = he;
        width = wi;
        depth = de;
    
    }

    void getter() {
        System.out.println(height + ":" + width + ":"+depth);
    }
    void volume(){
       System.out.println("volume:"+(height*depth*width));

    }
}
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cube c1 = new Cube();
        Cube c2 =new Cube();
        System.out.println("enter the cube of 1:");
        c1.setter(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("enter the cube of 2:");
        c2.setter(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        c1.getter();
        c2.getter();
        c1.volume();
        c2.volume();
        sc.close();
    }
}
