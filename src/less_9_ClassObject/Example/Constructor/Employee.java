package less_9_ClassObject.Example.Constructor;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Employee {
    int id;
    String name;
    float salary;
    void insert(int Id, String Name, float Salary){
        id = Id;
        name = Name;
        salary = Salary;
    }
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
