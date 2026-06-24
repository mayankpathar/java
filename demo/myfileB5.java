import java.io.File;
import java.io.IOException;
package demo;
public class myfileB5 {


   public static void main(String[] var0) throws IOException {
      File var1 = new File("damy.txt");
      if (var1.createNewFile()) {
         System.out.println("File created: " + var1.getAbsolutePath());
      } else {
         System.out.println("File already exists: " + var1.getAbsolutePath());
      }
       System.out.println("File name: " + var1.getName());
       System.out.println("writable: " + var1.canWrite("mayank"));
   }
}
