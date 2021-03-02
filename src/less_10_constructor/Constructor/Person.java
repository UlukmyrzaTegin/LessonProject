package less_10_constructor.Constructor;

/**
 * TheSusanin
 * 02 март 2021
 */
public class Person {
    String name;
    int age;

    //инициализаторы
    /*
    {
        name = "Underfined";
        age = 18;
    }
     */


    Person() {
        this("Underfined", 18);      //this - ссылка на текущий экземпляр класса.Мы можем обращаться к переменным, методам обьекта, а так вызывать его конструкторы
    }
    Person(String n) {
        this(n, 18);
    }
    Person(String n, int a) {
        this.name = n;
        this.age = a;

    }
    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
