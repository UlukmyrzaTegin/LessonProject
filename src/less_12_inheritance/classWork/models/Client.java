package less_12_inheritance.classWork.models;

/**
 * TheSusanin
 * 10 март 2021
 */
public class Client extends  Person {

    private double money;

    public Client(String name, int age, double money) {
        super(name, age);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void relax() {
        System.out.println(getName() + "-dancing");
        super.relax();
    }
}
