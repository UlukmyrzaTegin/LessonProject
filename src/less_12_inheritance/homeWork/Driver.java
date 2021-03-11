package less_12_inheritance.homeWork;

import org.w3c.dom.ls.LSOutput;

/**
 * TheSusanin
 * 11 март 2021
 */
public class Driver extends Person {


    public Driver(String name, int age, double salary, String work) {
        super(name, age, salary, work);
    }

    @Override
    public void driverCar() {  //перезагруженный метод
        System.out.println("Ф.И.О: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Зарплaта: " + getSalary());
        System.out.println("Должность: " + getWork());
        super.driverCar();
    }
}
