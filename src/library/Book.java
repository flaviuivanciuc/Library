package library;

import java.util.Objects;

public class Book implements Digital {

    private int nrPages;
    private String name;
    private String author;
    private float price;
    private int isbn;

    public int getIsbn(){return isbn; }

    public void setIsbn(int isbn) { this.isbn = isbn; }

    public int getNrPages() {
        return nrPages;
    }

    public void setNrPages(int nrPages) {
        this.nrPages = nrPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(int nrPages, String name, String author, float price, int isbn) {
        this.nrPages = nrPages;
        this.name = name;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    void getDescription() {
        System.out.println("The book " + name + " is written by " + author + " and has " + nrPages + " pages. \nIt's price is " + price + " $");
    }

    @Override
    public void setToDigital() {
        System.out.println("This book is available now in digital mode too.");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Book)) {
            return false;
        }
        return this.isbn == (((Book)o).getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrPages, name, author, price, isbn);
    }

    @Override
    public String toString() {
        return name + " by " + author + ". The book has " + nrPages + " pages. The price is " + price + " $" + ". ISBN: " + isbn + '\n';
    }
}
