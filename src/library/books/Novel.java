package library.books;

import library.Digital;

import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

public class Novel extends Book implements Digital {

    private String genre;

    public Novel(String type) {
        super();
        this.genre = type;
    }

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

}
