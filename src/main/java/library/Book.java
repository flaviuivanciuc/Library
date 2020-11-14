package library;

import java.util.Objects;

public class Book implements Digital {

    private int nrPages;
    private String name;
    private String author;
    private float price;
    private int isbn;

    public Book(){ }

    public Book(int nrPages, String name, String author, float price, int isbn) {
        this.nrPages = nrPages;
        this.name = name;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public int getIsbn(){return isbn; }

    public void setIsbn(int isbn) { this.isbn = isbn; }

    public int getNrPages() { return nrPages; }

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

    public void setPrice(float price) { this.price = price; }

    public void getDescription() {
        System.out.println("The book " + getName() + " is written by " + getAuthor() + " and has " + getNrPages() + " pages.");
        System.out.println("\tIt's price is " + getPrice() + " $");
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
        return name + " by " + author + " (" + nrPages + " pages). \n\t\tThe price is " + price + " $" + "\n\t\t\tISBN: " + isbn + '\n';
    }

    @Override
    public void setToDigital() {
        System.out.println("This book is available now in digital mode too.");
    }

}
