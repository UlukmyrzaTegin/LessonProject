package less_9_ClassObject;


import less_9_ClassObject.Cars.Car;

/**
 * TheSusanin
 * 24 февраль 2021
 */
public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", 10000);
        System.out.println(audi.model + " - " + audi.price);

        Car volvo = new Car("Volvo", 5000);
        System.out.println(volvo.model + " - " + volvo.price);

    }
}
