package javaassignment;

public class part1 {
    public static void main(String[] args) {
        int p = 5;
        int q = ++p + p++ + --p + p--;
        System.out.println(p + " " + q);
    }
}
