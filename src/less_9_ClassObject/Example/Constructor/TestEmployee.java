package less_9_ClassObject.Example.Constructor;

/**
 * TheSusanin
 * 01 март 2021
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insert(101, "ajeet", 45000);
        e2.insert(102, "irfan", 25000);
        e3.insert(103, "nakul", 35000);
        e1.display();
        e2.display();
        e3.display();


    }
}
