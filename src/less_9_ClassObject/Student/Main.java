package less_9_ClassObject.Student;

/**
 * TheSusanin
 * 2/26/2021 Feb 2021
 */
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Ulukmyrza";
        System.out.println("Меня зовут " + s1.name);
        s1.age = 30;
        System.out.println("Мне " + s1.age);

        Student s2 = new Student();
        s2.name = "Aiperish";
        System.out.println("Меня зовут " + s2.name);
        s2.age = 28;
        System.out.println("Мне " + s2.age);

    }
}
