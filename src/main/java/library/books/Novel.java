package library.books;

import library.Book;
import library.Digital;

public class Novel extends Book implements Digital {

    private String genre;

    public Novel(int nrPages, String name, String author, float price, int isbn, String genre) {
        super(nrPages, name, author, price, isbn);
        this.genre = genre;
    }

    public String getType() {
        return genre;
    }

    public void setType(String type) {
        this.genre = type;
    }

    @Override
    public void getDescription() {
        System.out.println("The book " + getName() + " is written by " + getAuthor() + " and has " + getNrPages() + " pages.");
        System.out.println("\tIt's price is " + getPrice() + " $");
        System.out.println("\t\tAnd is a " + genre + " novel.");
    }

    @Override
    public void setToDigital() {
        System.out.println("This book is available now in digital mode too.");
    }

}
