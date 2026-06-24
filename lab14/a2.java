package lab14;

import java.io.File;
import java.io.FileReader;

public class a2 {
    public static void main(String[] args) {
        System.out.println("Enter the file name");
        String w1 = new String();
        System.out.println("Enter the file name");
        String w2 = new String();

        try {
            File f1 = new File("dovx.txt");
            File f2 = new File("demo1.txt");
            FileReader fr1 = new FileReader(f1);
            FileReader fr2 = new FileReader(f2);
            String data = "";
            int ch;
            while ((ch = fr1.read()) != -1) {
                data += (char) ch;
            }
            data = data.replaceAll(w1, w2);
                
            

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}