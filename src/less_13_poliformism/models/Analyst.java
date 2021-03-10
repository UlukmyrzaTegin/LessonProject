package less_13_poliformism.models;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public class Analyst extends Employee {

    public Analyst(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("Test");

    }

    @Override
    public void spendMoney() {

    }

    @Override
    public void dance() {

    }
}
