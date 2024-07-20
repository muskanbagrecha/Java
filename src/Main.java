package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        testRecord();
    }

    public static void testRecord(){
        EmployeeRecord emp = new EmployeeRecord(1, "Muskan");
        EmployeeRecord emp1 = new EmployeeRecord(1, "Muskan");
        System.out.println(emp.id());
        System.out.println(emp.name());
        System.out.println(emp1.equals(emp));
        System.out.println(emp);
    }

}