package src;

import src.oops.inheritance.Animal;
import src.oops.inheritance.Cat;
import src.oops.inheritance.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        testRecord();
        testEnum();
        testInhertitance();
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
}