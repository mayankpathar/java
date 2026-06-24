package lba9;

import java.util.Scanner;

class Book {
    private String author_name;

    void setAuthor(String author_name) {
        this.author_name = author_name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}

class Book_Publication extends Book {
    private String title;

    void setTitle(String title) {
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("Book Title: " + title);
    }
}

class Paper_Publication extends Book {
    private String title;

    void setTitle(String title) {
        this.title = title;
    }

    void display() {
        super.display();
        System.out.println("Paper Title: " + title);
    }
}

public class a4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.println("Enter 1 for Book Publication");
        System.out.println("Enter 2 for Paper Publication");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                Book_Publication bp = new Book_Publication();
                bp.setAuthor(author);

                System.out.print("Enter Book Title: ");
                String bookTitle = sc.nextLine();
                bp.setTitle(bookTitle);

             
                bp.display();
                break;

            case 2:
                Paper_Publication pp = new Paper_Publication();
                pp.setAuthor(author);

                System.out.print("Enter Paper Title: ");
                String paperTitle = sc.nextLine();
                pp.setTitle(paperTitle);

               
                pp.display();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}