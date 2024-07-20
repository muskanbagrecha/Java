package src;

import src.oops.SOLID.SRP.Book;
import src.oops.SOLID.SRP.Customer;
import src.oops.SOLID.SRP.expectation.InvoicePrinter;
import src.oops.SOLID.SRP.expectation.Library;
import src.oops.inheritance.Animal;
import src.oops.inheritance.Cat;
import src.oops.inheritance.Dog;
import src.oops.loosecoupling.ShoppingCart;
import src.oops.loosecoupling.UPIProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        testRecord();
        testEnum();
        testInhertitance();
        testLooseCouplingWithInterface();
        testSRP();
    }

    public static void testRecord(){
        EmployeeRecord emp = new EmployeeRecord(1, "Muskan");
        EmployeeRecord emp1 = new EmployeeRecord(1, "Muskan");
        System.out.println(emp.id());
        System.out.println(emp.name());
        System.out.println(emp1.equals(emp));
        System.out.println(emp);
    }

    public static void testEnum(){
        TestEnum pz = new TestEnum(TestEnum.Status.ORDERED);
        System.out.println(pz.getStatus());
    }

    public static void testInhertitance(){
        Animal unknownAnimal = new Animal();
        unknownAnimal.makeSound();
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }

    public static void testLooseCouplingWithInterface(){
        ShoppingCart cart = new ShoppingCart(new UPIProcessor());
        cart.processPayment();
    }

    public static void testSRP(){
        Library library = new Library();
        Customer customer = new Customer("Musk");
        Book book1 = new Book(1, "Sapiens", "XYZ");
        library.addBook(book1);
        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice(book1, customer);
    }
}