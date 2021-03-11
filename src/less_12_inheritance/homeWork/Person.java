package less_12_inheritance.homeWork;

/**
 * TheSusanin
 * 11 март 2021
 */
public class Person {
    private String name;
    private int age;
    private double salary;
    private String work;
    private boolean computer;
    private String login;
    private String password;

    public Person(String name, int age, double salary, String work, boolean computer, String login, String password) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.work = work;
        this.computer = computer;
        this.login = login;
        this.password = password;
    }

    public Person() {
    }

    public boolean isComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSalary());
        System.out.println(getWork());
        System.out.println(isComputer());
        System.out.println(getLogin());
        System.out.println(getPassword());
        System.out.println("Кодить");
    }
    public void driverCar(){
        System.out.println("Водить машину");
    }
    public void clear(){
        System.out.println("Убирает");
    }

}
