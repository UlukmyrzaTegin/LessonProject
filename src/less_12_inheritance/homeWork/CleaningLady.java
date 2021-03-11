package less_12_inheritance.homeWork;

/**
 * TheSusanin
 * 11 март 2021
 */
public class CleaningLady extends Person{

    @Override
    public void clear() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSalary());
        System.out.println(getWork());
    }
}
