package lab7;
import java.util.Scanner;
class Circle{
    float r;
    
    Circle(float r){
        this.r = r;
    }
    
 
    public double area(){
        return Math.PI * r * r;
    }
    
    public void display(){
        System.out.println("Radius: " + r);
        System.out.println("Area: " + area());
    }
}
public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of circle: ");
        float r = sc.nextFloat();
        
      
        Circle circle = new Circle(r);
        
    
        circle.display();
        
        sc.close();
    }
}
