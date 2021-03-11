package less_12_inheritance.homeWork;

/**
 * TheSusanin
 * 11 март 2021
 */
public class Employee {
    private String name;
    private int age;
    private double salary;
    private String work;

    public Employee(String name, int age, double salary, String work) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.work = work;
    }
    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void programmerInfo(){
        System.out.println("Кодить");
    }
    public void driverCar(){
        System.out.println("Водить машину");
    }
    public void clear(){
        System.out.println("Убирает");
    }

}
