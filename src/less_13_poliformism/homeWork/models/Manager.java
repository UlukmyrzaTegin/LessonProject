package less_13_poliformism.homeWork.models;

/**
 * TheSusanin
 * 12 март 2021
 */
public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public Employee goToVacation() {
        System.out.println(getName() + "I am going to Miami ");
        //return super.goToVacation();
        return null;
    }
}
