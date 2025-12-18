package Session9;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Book[] arr = new Book[100];
//        int count = 0;
        ArrayList<Book> books = new ArrayList<>();
        Book b1 = new Book("Java", "James", 100);
        Book b2 = new Book("Python", "guido", 120);
        Book b3 = new Book("C++", "Bjarne", 150);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        for (int i = 0; i < books.size(); i++) {
            books.get(i).printInfo();
        }
//        for (int i = 0; i < count; i++) {
//            arr[i].printInfo();
//        }
    }
}
