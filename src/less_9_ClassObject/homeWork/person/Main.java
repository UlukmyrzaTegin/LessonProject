package less_9_ClassObject.homeWork.person;


/**
 * TheSusanin
 * 3/3/2021 Mar 2021
 */
public class Main {
    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person("Начальник", 30);
        second.talk("Иди учиться!");
        first.move("Иди отдыхай!");
    }
}
