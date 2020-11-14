package library;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

import static java.util.function.Predicate.isEqual;

public class Shelves {

    private ArrayList<Book> shelves = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBook() {
        Book book = new Book();
        System.out.print("Enter book title: ");
        book.setName(scanner.next());
        System.out.print("Enter book author: ");
        book.setAuthor(scanner.next());
        System.out.print("Enter number of pages: ");
        book.setNrPages(scanner.nextInt());
        System.out.print("Enter price: ");
        book.setPrice(scanner.nextFloat());
        System.out.print("Enter ISBN: ");
        book.setIsbn(scanner.nextInt());
        System.out.println("\n\tBook added succesfully!");
        shelves.add(book);
    }

    public void printBooks() {
        System.out.println("\nThere are " + shelves.size() + " books in the library:");
        for (int i = 0; i < shelves.size(); i++) {
            System.out.print((i + 1) + ". " + shelves.get(i));
        }
    }

    public void removeBook() {
        System.out.print("Enter book's ISBN: ");
        int ISBN = scanner.nextInt();
        for (int index = 0; index < shelves.size(); index++) {
            if (ISBN == shelves.get(index).getIsbn()) {
                Predicate<Book> condition = shelves -> shelves.getIsbn() == ISBN;
                System.out.println(shelves.get(index).getName() + " has been removed from the library.");
                shelves.removeIf(condition);
            } else {
                System.out.println("Couldn't process operation. Try again!");
            }
        }
    }

    private int findBook(Book book) {
        return shelves.indexOf(book);
    }

    public void searchForBook() {
        System.out.print("Enter book name: ");
        scanner.nextLine();
        for (int i = 0; i < shelves.size(); i++) {
            if (scanner.nextLine().equals(shelves.get(i).getName())) {
                System.out.println(shelves.get(i).getName() + " has been found in the library.");
            } else {
                System.out.println("The book does not exists in the library.");
            }
        }
    }

}