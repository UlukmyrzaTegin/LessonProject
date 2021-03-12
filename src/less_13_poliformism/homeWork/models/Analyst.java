package less_13_poliformism.homeWork.models;

/**
 * TheSusanin
 * 12 март 2021
 */
public class Analyst extends Employee {
    public Analyst(String name) {
        super(name);
    }

    @Override
    public Employee goToVacation() {
        System.out.println(getName()+ " I am going to Dubai!");
        //super.goToVacation();
        return null;
    }
}
