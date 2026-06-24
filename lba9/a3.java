package lba9;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int age;

    Student(String name, int age) {
        super(name); 
        this.age = age;
    }

    void show() {
        super.display(); 
        System.out.println("Age: " + age);
    }
}

public class a3 {
    public static void main(String[] args) {

        Student s = new Student("mayank", 18);
        s.show();
    }
}
