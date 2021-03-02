package less_10_method.Example;

/**
 * TheSusanin
 * 01 март 2021
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111, "Каран");
        s2.insertRecord(222, "Ариец");
        s1.displayInformation();
        s2.displayInformation();
    }
}
