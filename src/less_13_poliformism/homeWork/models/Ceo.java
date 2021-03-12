package less_13_poliformism.homeWork.models;

/**
 * TheSusanin
 * 12 март 2021
 */
public class Ceo extends Employee {
    public Ceo(String name) {
        super(name);
    }

    @Override
    public Employee goToVacation() {
        System.out.println(getName() + " I am going to Havail!");
        //super.goToVacation();
        return null;
    }
}
