package library;

import library.books.Novel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Shelves shelves = new Shelves();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;
        int choice = 1;
        System.out.println("\nWelcome to the Library app!");
        mainMenu();

        while (running) {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> mainMenu();
                case 2 -> shelves.addBook();
                case 3 -> shelves.printBooks();
                case 4 -> shelves.removeBook();
                case 5 -> shelves.searchForBook();
                case 6 -> {
                    running = false;
                    System.out.println("Exiting app...");
                }
            }
        }


//        Book book1 = new Book(128, "\"Train Dreams\"", "Denis Johnson", 12.99F, 122548);
//        Book book2 = new Book(304, "\"The sellout\"", "Paul Beatty", 13.99F, 135468);
//        Book book3 = new Book(279, "\"The Catcher in the Rye\"", "J. D. Salinger", 11.99F, 1557789);
//        Novel novel1 = new Novel(730, "\"Ulysses\"", "James Joyce", 15.99F, 124587, "Fiction");
//        Novel novel2 = new Novel(299, "\"A Portrait of the Artist as a Young Man\"", "James Joyce", 19.99F, 1222331, "Modernism");
//        Novel novel3 = new Novel(326, "\"The Sound and the Fury\"", "William Faulkner", 13.99F, 666587, "Modernism");
//
//        shelves.addBook(book1);
//        shelves.addBook(book2);
//        shelves.addBook(book3);
//        shelves.addBook(novel1);
//        shelves.addBook(novel2);
//        shelves.addBook(novel3);
//        shelves.printBooks();
//        shelves.removeBook(book1);
//        shelves.removeBook(novel2);
//        shelves.printBooks();
//        shelves.searchForBook(book2);


//        book1.getDescription();
//        book1.setToDigital();
//        System.out.println("____________________________________________________");
//        book2.getDescription();
//        book2.setToDigital();
//        System.out.println("____________________________________________________");
//        book3.getDescription();
//        book3.setToDigital();
//
//        System.out.println("____________________________________________________");
//
//        ArrayList collection = new ArrayList();
//        collection.add(book1);
//        collection.add(book2);
//        collection.add(book3);
//        collection.add(novel1);
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

//        System.out.println("____________________________________________________");
//
//        LinkedList linkedList = new LinkedList(collection);
//        System.out.println("The last element in the linkedList is: " + linkedList.getLast());
//        System.out.println("The first element in the linkedList is: " + linkedList.getFirst());

    }

    public static void mainMenu() {
        System.out.println("\t 1 - Main menu");
        System.out.println("\t 2 - Add a book");
        System.out.println("\t 3 - Show all the books");
        System.out.println("\t 4 - Remove a book");
        System.out.println("\t 5 - Search for a book");
        System.out.println("\t 6 - Quit the app");
    }

}
