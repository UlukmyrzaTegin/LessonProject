package less_10_method.Example;

/**
 * TheSusanin
 * 02 март 2021
 */
public class ArgumentMethod {
    public static void main(String[] args) {
        display("Tom", 34);
        display("Jack", 28);
        display("Fred", 30);
    }

    static void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}
