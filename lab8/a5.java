package lab8;

class House {

   
    private String ad;
    private int nuOfRo;
    private double area;

   
    void setA(String ad) {
        this.ad = ad;
    }

    void setNuOfRo(int nuOfRo) {
        this.nuOfRo = nuOfRo;
    }

    void setArea(double area) {
        this.area = area;
    }

    String getA() {
        return ad;
    }

    int getNuOfRo() {
        return nuOfRo;
    }

    double getArea() {
        return area;
    }

    
    double caPrice(double pricePerSquareMeter) {
        return area * pricePerSquareMeter;
    }
}

public class a5 {
    public static void main(String[] args) {
    
        House h1 = new House();

      
        h1.setA("Rajkot, Gujarat");
        h1.setNuOfRo(4);
        h1.setArea(120.5);

       
        System.out.println("Address: " + h1.getA());
        System.out.println("Number of Rooms: " + h1.getNuOfRo());
        System.out.println("Area: " + h1.getArea());

      
        double price = h1.caPrice(15000); 
        System.out.println("Total Price:" + price);
    }
}
