package less_14_interface.models;

/**
 * TheSusanin
 * 3/17/2021
 */
public abstract class EmployeeInterface extends PersonInterface{

    public static final String companyName = "MegaCom"; // нельзя изменить
    private double salary;

    public EmployeeInterface(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
