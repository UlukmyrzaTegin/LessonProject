package less_10_method.Example;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }
    void displayInformation() {
        System.out.println(rollno + " " + name);
    }
}