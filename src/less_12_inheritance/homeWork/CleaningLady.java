package less_12_inheritance.homeWork;

/**
 * TheSusanin
 * 11 март 2021
 */
public class CleaningLady extends Person{

    public CleaningLady(String name, int age, double salary, String work) {
        super(name, age, salary, work);
    }

    @Override
    public void clear() {
        System.out.println("Ф.И.О: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Должность: " + getWork());
        super.clear();
    }
}
