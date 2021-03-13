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
        Developer developer = new Developer("Aza");
        Analyst analyst = new Analyst("Nurik");

        employeeps[0] = developer.goToVacation();
        employeeps[1] = ceo.goToVacation();
        employeeps[2] = analyst.goToVacation();



    }
}
