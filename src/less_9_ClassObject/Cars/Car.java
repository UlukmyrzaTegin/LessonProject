package less_9_ClassObject.Cars;

/**
 * TheSusanin
 * 25 февраль 2021
 */
public class Car {

    //поля класса
    public String model;
    int doorCounts;
    String color;
    public double price;

    //Конструктор, нужны для того созадть обьект с заполненными поля
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Car() {
    }
}
