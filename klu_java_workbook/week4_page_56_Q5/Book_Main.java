package week4_page_56_Q5;

import java.util.Scanner;

public class Book_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.println("Enter the Book Name:");
        b.setbName(sc.next());
        System.out.println("Enter Book Id");
        b.setbId(sc.next());
        System.out.println("Enter author Name:");
        b.setbAuthor(sc.next());
        System.out.println("Enter book public Year");
        b.setYop(sc.nextInt());

        System.out.println(b);

    }
}
