package less_9_ClassObject.homeWork.person;

/**
 * TheSusanin
 * 3/3/2021 Mar 2021
 */
public class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " говорит: ");
    }
    public void talk() {
        System.out.println(this.fullName + " говорит: ");
    }
}
