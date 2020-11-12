package library.books;

import library.Book;
import library.Digital;


public class Novel extends Book implements Digital {

    private String genre;

    public Novel(int nrPages, String name, String author, float price, int isbn, String genre) {
        super(nrPages, name, author, price, isbn);
        this.genre = genre;
    }

//    public void getDescription(){
//    }


    public String getType() {
        return genre;
    }

    public void setType(String type) {
        this.genre = type;
    }

    @Override
    public void setToDigital() {
        System.out.println("This book is available now in digital mode too.");
    }

    @Override
    public String toString() {
        return "The novel ";
    }
}
