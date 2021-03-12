package less_13_poliformism.homeWork.models;

/**
 * TheSusanin
 * 12 март 2021
 */
public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public Employee goToVacation() {
        System.out.println(getName()+ " I am going to bootcamp!");
        //super.goToVacation();
        return null;
    }
}
