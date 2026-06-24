package lab14;

import java.io.File;
import java.io.FileReader;

public class A1 {
    public static void main(String[] args) {
        int charcters=0;
        int line=0;
        int word=0;
        try {
            File f=new File("demo.txt");
            FileReader fr=new FileReader(f);
            int ch;
            while ((ch=fr.read())!=-1) {
                charcters++;
                if (ch=='\n') {
                    line++;
                }
                else if (ch==' '|| ch=='\n') {
                    word++;
                }
                word++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("cercters: "+charcters);
        System.out.println("Line: "+line);
        System.out.println("word: "+word);
    }
}