package less_9_ClassObject.employes;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Main {
    public static void main(String[] args) {
        Position junior = new Position();
        junior.id = 1;
        junior.name = "Junior";
        junior.minSalary = 10000;
        junior.maxSalary = 20000;

        Position middle = new Position();
        middle.id = 2;
        middle.name = "Middle";
        middle.minSalary = 20000;
        middle.maxSalary = 70000;

        Position senior = new Position();
        senior.id = 3;
        senior.name = "Senior";
        senior.minSalary = 70000;
        senior.maxSalary = 120000;

        Position[] positions = {junior, middle, senior};
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[1];
        for (int i = 0; i <  employees.length; i++) {
            System.out.println("Add new employee: ");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.println("Position: ");
            for (Position position : positions) {
                System.out.println(position.id + ". " + position.name);
            }
            System.out.print("Position id: ");
            long positionId = scanner.nextLong();

            Position empPosition = null;
            for (Position position : positions) {
                if (position.id == positionId) {
                    empPosition = position;
                }
            }
            if (empPosition == null) {
                System.out.println("Wrong position!");
            }
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            if (salary < empPosition.minSalary || salary > empPosition.maxSalary) {
                System.out.println("Wrong salary!");
            }

            Employee employee = new Employee();
            employee.id = i + 1;
            employee.name = name;
            employee.position = empPosition;
            employee.salary = salary;

            employees[i] = employee;
        }
        double maxSalary = 0;
        for (Employee emp : employees) {
            if (emp.position.id == 1 && emp.salary > maxSalary) {
                maxSalary = emp.salary;
            }
        }
        System.out.println(maxSalary);
//
       System.out.println(junior.name + " junior's max salary = " + maxSalary);
//        System.out.println(junior.id + " ");
    }

}
