package less_12_inheritance.exercises;

/**
 * TheSusanin
 * 09 март 2021
 */
public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Bethoven");
        dog.setAge(7);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.bakr();
        dog.eat();

    }
}
