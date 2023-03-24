package lab05.exercise1p4.client;

import lab05.exercise1p4.service.Employee;

public class MainTest {
    public static void main(String[] args) {
        // Test constructors and toString()
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        // Test getter and setter
        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("id is: " + employee1.getId());
        System.out.println("firstname is: " + employee1.getFirstName());
        System.out.println("lastname is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());

        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        // Test raiseSalary()
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
