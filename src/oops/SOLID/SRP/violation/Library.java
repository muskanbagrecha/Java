package src.oops.SOLID.SRP.violation;

import src.oops.SOLID.SRP.Book;

import java.util.HashSet;

public class Library {
    private HashSet<Book> books;

    public HashSet<Book> getAllBooks(){
        return this.books;
    }

    public void addBook(){ //one change

    }

    public void printReceipt(){ //second change

    }

    public void paySalaries(){ //third change

    }
}


//Here, a single class has more than one responsibility, book management, receipt generation, payroll management
//This violates SRP