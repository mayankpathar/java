package demo;

import java.util.Scanner;

class A {
    String name;
    String b_code;
    String uninm;

    A(String name, String b_code, String uninm) {
        this.name = name;
        this.b_code = b_code;
        this.uninm = uninm;
    }
    A(A A1){
        this.name = "pqr";
        this.b_code = A1.b_code;
        this.uninm = A1.uninm;
    }

    void getter() {
        System.out.println(name + ":" +b_code+ ":" + uninm);
    }
}

public class may {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a1 = new A("abc","23","du");
        A a2 = new A(a1);
        a1.getter();
        a2.getter();
        sc.close();

    }
}

