package demo;
import java.util.Scanner;
public class strbu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("mayank");
        System.out.println(sb);
        //char at index 2
        System.out.println(sb.charAt(2));
        //set char at index 2
        sb.setCharAt(2, 'p');
        System.out.println(sb);
        //insert char at index 2
        sb.insert(0, 'p');      
        System.out.println(sb);
        //delete char at index 2
        sb.deleteCharAt(0);
        System.out.println(sb);
        //append char at the end
        sb.append('k'); 
        sb.append("umar");
        System.out.println(sb);
        //length of string builder
        System.out.println(sb.length());
        //reverse the string builder
        sb.reverse();   
        System.out.println(sb); 
        sc.close();
    }
}
