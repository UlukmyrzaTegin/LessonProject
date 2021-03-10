package less_13_poliformism.models;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public abstract class Employee extends Person {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
