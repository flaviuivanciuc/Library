package library;

import library.books.Novel;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(128, "Train Dreams", "Denis Johnson", 12.99F, 122548);
        Book book2 = new Book(304, "The sellout", "Paul Beatty", 13.99F, 135468);
        Book book3 = new Book(279, "The Catcher in the Rye", "J. D. Salinger", 11.99F, 1557789);
        Novel novel = new Novel("Drama");

        book1.getDescription();
        book1.setToDigital();
        System.out.println("____________________________________________________");
        book2.getDescription();
        book2.setToDigital();
        System.out.println("____________________________________________________");
        book3.getDescription();
        book3.setToDigital();
        System.out.println("____________________________________________________");

        List collection = new ArrayList();
        collection.add(book1);
        collection.add(book2);
        collection.add(book3);

        System.out.println("The library has the following books: \n" + collection.toString());

        System.out.println("____________________________________________________");
        System.out.println("The hashCode for book1 is " + book1.hashCode());
        System.out.println("The hashCode for book2 is " + book2.hashCode());
        System.out.println("The hashCode for book3 is " + book3.hashCode());

        System.out.println("____________________________________________________");
        book1.setIsbn(122564);
        book2.setIsbn(12257);
        book1.hashCode();
        book2.hashCode();
        System.out.println(book1.equals(book2));

    }
}
