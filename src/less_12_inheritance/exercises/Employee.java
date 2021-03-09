package less_12_inheritance.exercises;

/**
 * TheSusanin
 * 09 март 2021
 */
public class Employee extends  Person{
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        //super.display();
        System.out.printf("Name: %s \n", getName());
        System.out.printf("Works in %s \n", company);
    }

//    public void work() {
//        System.out.printf("%s works in %s \n", getName(), company);
//    }
}
