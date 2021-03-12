package less_13_poliformism.homeWork;

import less_13_poliformism.homeWork.models.Analyst;
import less_13_poliformism.homeWork.models.Ceo;
import less_13_poliformism.homeWork.models.Developer;
import less_13_poliformism.homeWork.models.Employee;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public class HomePoliformism {
    public static void main(String[] args) {
        Employee[] employeeps = new Employee[4];

        Ceo ceo = new Ceo("Jack");
        ceo.goToVacation();

        Developer developer = new Developer("Aza");
        developer.goToVacation();

        Analyst analyst = new Analyst("Nurik");
        analyst.goToVacation();

        employeeps[0] = developer.goToVacation();


    }
}
