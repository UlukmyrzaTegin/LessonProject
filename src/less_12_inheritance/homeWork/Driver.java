package less_12_inheritance.homeWork;

import org.w3c.dom.ls.LSOutput;

/**
 * TheSusanin
 * 11 март 2021
 */
public class Driver extends Person {


    @Override
    public void driverCar() {  //перезагруженный метод
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getSalary());
        System.out.println(getWork());
    }
}
