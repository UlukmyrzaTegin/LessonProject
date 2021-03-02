package less_10_constructor.Constructor;

/**
 * TheSusanin
 * 02 март 2021
 */
public class Program {
    public static void main(String[] args) {

       // Person конструкторы
        Person bob = new Person(); // вызов первого конструктора без параметоров
        bob.displayInfo();

        Person tom = new Person("Tom"); //Вызов второго конструктора с одним параметором
        tom.displayInfo();

        Person sam = new Person("Sam", 25); //вызов третьего коструктора с двумя параметрами
        sam.displayInfo();

//        tom.name = "Tom";
//        tom.age = 34;
//        tom.displayInfo();

    }
}
