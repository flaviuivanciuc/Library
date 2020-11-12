package library.books;

import library.Digital;

import java.awt.print.Book;

public class Album extends Book implements Digital {

    private String paperFormat;

    public String getPaperFormat() {
        return paperFormat;
    }

    public void setPaperFormat(String paperFormat) {
        this.paperFormat = paperFormat;
    }

    public Album(int nrPages, String name, String author, float price, int isbn, String paperFormat) {
        super();
        this.paperFormat = paperFormat;
    }

    @Override
    public void setToDigital() {
        System.out.println("This book is available now in digital mode too.");
    }
}

