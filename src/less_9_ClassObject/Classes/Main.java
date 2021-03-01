package less_9_ClassObject.Classes;

import java.util.Calendar;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        //System.out.println(toyota.hashCode());
        toyota.model = "Toyota";

        toyota.drive();

        Car audi = new Car();
        audi.model = "Audi";
        audi.price = 54577;
        audi.drive();


        Calculator calculator = new Calculator();
        int sum = calculator.sum(5457, 856);
        int sum1 = calculator.sum(578, 954);
        System.out.println(sum + " " + sum1);
    }
}
