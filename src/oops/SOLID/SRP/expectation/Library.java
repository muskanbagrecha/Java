package src.oops.SOLID.SRP.expectation;

import src.oops.SOLID.SRP.Book;

import java.util.HashSet;

public class Library {
    private HashSet<Book> books;

    public Library(){
        this.books = new HashSet<>();
    }

    public HashSet<Book> getAllBooks(){
        return this.books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }
}

//Here, this class has only one responsibility which is books management.