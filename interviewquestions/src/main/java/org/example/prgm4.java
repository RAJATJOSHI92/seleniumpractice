package org.example;

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    public static ArrayList<Book> bookCollection = new ArrayList<Book>();

    Book(String title, String author, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void addbooks(Book book) {
        bookCollection.add(book);
    }

    public static void removebooks(Book book) {
        bookCollection.remove(book);
    }

    public static ArrayList<Book> getbooks() {
        return bookCollection;
    }

}


public class prgm4 {
    public static void main(String[] args) {
        Book book1 = new Book("aaa", "bbb", "ccc");
        Book book2 = new Book("aaaa", "bbbb", "cccc");
        Book.addbooks(book1);
        Book.addbooks(book2);
        ArrayList<Book> bookcollection = Book.getbooks();

        System.out.println("list of books");

        for (Book b : bookcollection) {
            System.out.println(b.getTitle() + " " + b.getAuthor() + " " + b.ISBN);
        }

        Book.removebooks(book1);

        System.out.println("list of books after removinmg title and having new tile");

        book2.setTitle("new title");
        for (Book b : bookcollection) {
            System.out.println(b.getTitle() + " " + b.getAuthor() + " " + b.ISBN);
        }

    }
}
