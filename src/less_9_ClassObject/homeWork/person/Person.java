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

    public void move(String name) {
        System.out.println(this.fullName + " говорит: " + name);
    }
    public void talk(String name){
        System.out.println(this.fullName + " говорит: " + name);
    }
}
