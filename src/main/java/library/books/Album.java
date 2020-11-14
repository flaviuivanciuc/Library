package library.books;

import library.Book;
import library.Digital;

public class Album extends Book implements Digital {

    public Album(int nrPages, String name, String author, float price, int isbn, String paperFormat) {
        super(nrPages, name, author, price, isbn);
        this.paperFormat = paperFormat;
    }

    private String paperFormat;

    public String getPaperFormat() {
        return paperFormat;
    }

    public void setPaperFormat(String paperFormat) {
        this.paperFormat = paperFormat;
    }

    @Override
    public void setToDigital() {
        System.out.println("This book is available now in digital mode too.");
    }
}

