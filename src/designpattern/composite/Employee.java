package sample.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern creates a class contains group of its own objects.
 * This class provides ways to modify its group of same objects.
 * This pattern is useful for hierarchical or tree type data structures.
 */
public class Employee {
    String name;
    String department;
    int salary;
    List<Employee> subordinates;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    void add(Employee employee) {
        subordinates.add(employee);
    }

    void remove(Employee employee) {
        subordinates.remove(employee);
    }

    List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : " + name
                + ", department : " + department + ", salary :"
                + salary + " ]");
    }

    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(" > " + headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println("  > " + employee);
            }
        }

    }
}
