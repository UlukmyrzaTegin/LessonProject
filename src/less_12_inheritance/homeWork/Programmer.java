package less_12_inheritance.homeWork;

/**
 * TheSusanin
 * 11 март 2021
 */
public class Programmer extends Person{
    private boolean computer;
    private String login;
    private String password;

    public Programmer(String name, int age, double salary, String work, boolean computer, String login, String password) {
        super(name, age, salary, work);
        this.computer = computer;
        this.login = login;
        this.password = password;
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

    @Override
    public void programmerInfo() {
        System.out.println("Ф.И.О: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Должность: " + getWork());
        System.out.println("Есть компьютер: " + isComputer());
        System.out.println("Логин: " +getLogin());
        System.out.println("Пароль: " + getPassword());
        super.programmerInfo();
    }
}
