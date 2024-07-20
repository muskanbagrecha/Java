package src.oops.SOLID.SRP.expectation;

import src.oops.SOLID.SRP.Book;
import src.oops.SOLID.SRP.Customer;

public class InvoicePrinter {
    public void printInvoice(Book book, Customer customer){
        System.out.println("Printing invoice for book: " + book.getName() + ". Thank you, " + customer.getName() + ".");
    }
}

