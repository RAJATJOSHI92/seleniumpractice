package org.example;

import java.util.ArrayList;

class Book1 {
    String title;
    String author;

    Book1(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library {
    ArrayList<Book1> books;

    Library() {
        books = new ArrayList<Book1>();
    }

    public void addbooks(Book1 b) {
        books.add(b);
    }

    public void removebooks(Book1 b) {
        books.remove(b);
    }

    public ArrayList<Book1> getdetails() {
        return books;
    }
}


public class prgm8 {
    public static void main(String[] args) {
        Book1 book1 = new Book1("aaa", "rajat");
        Book1 book2 = new Book1("bbb", "joshi");
        Library library = new Library();
        library.addbooks(book1);
        library.addbooks(book2);

        ArrayList<Book1> ll = library.getdetails();
        for (Book1 g : ll) {
            System.out.println("title is :" + g.getTitle() + "   and  " + "author is :" + g.getAuthor());
        }

        library.removebooks(book1);

        for (Book1 g : ll) {
            System.out.println("title is :" + g.getTitle() + "   and  " + "author is :" + g.getAuthor());
        }

    }
}
