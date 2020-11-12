package library;

import library.books.Novel;

import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(128, "Train Dreams", "Denis Johnson", 12.99F, 122548);
        Book book2 = new Book(304, "The sellout", "Paul Beatty", 13.99F, 135468);
        Book book3 = new Book(279, "The Catcher in the Rye", "J. D. Salinger", 11.99F, 1557789);
        Novel novel1 = new Novel(122, "Ulysses", "James Joyce", 15.99F, 124587, "Fiction");
//        Novel novel2 = new Novel();
        book1.getDescription();
        book1.setToDigital();
        System.out.println("____________________________________________________");
        book2.getDescription();
        book2.setToDigital();
        System.out.println("____________________________________________________");
        book3.getDescription();
        book3.setToDigital();

        System.out.println("____________________________________________________");

        ArrayList collection = new ArrayList();
        collection.add(book1);
        collection.add(book2);
        collection.add(book3);
        collection.add(novel1);
//        collection.add(novel2);
//
//        System.out.println("The library has the following books: \n" + collection.toString());
//
//        System.out.println("____________________________________________________");
//        System.out.println("The hashCode for book1 is " + book1.hashCode());
//        System.out.println("The hashCode for book2 is " + book2.hashCode());
//        System.out.println("The hashCode for book3 is " + book3.hashCode());
//
//        System.out.println("____________________________________________________");
//        book1.setIsbn(122564);
//        book2.setIsbn(12257);
//        book1.hashCode();
//        book2.hashCode();
//        System.out.println(book1.equals(book2));
//
//        System.out.println("____________________________________________________");
//
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println("The for result is: " + collection.get(i));
//        }

        System.out.println("____________________________________________________");

        LinkedList linkedList = new LinkedList(collection);
        System.out.println("The last element in the linkedList is: " + linkedList.getLast());
        System.out.println("The first element in the linkedList is: " + linkedList.getFirst());

    }
}
