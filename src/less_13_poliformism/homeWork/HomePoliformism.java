package less_13_poliformism.homeWork;

import less_13_poliformism.homeWork.models.*;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public class HomePoliformism {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Manager("I am Manager ");
        employees[1] = new Developer("I am Developer ");
        employees[2] = new Ceo("I am CEO ");
        employees[3] = new Analyst("I am Analyst ");

        for (int i = 0; i <employees.length ; i++) {
            employees[i].goToVacation();
        }
    }
}
