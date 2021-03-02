package less_10_method.Classes;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.model = "Toyota";
        toyota.drive();
        toyota.stop();
        toyota.print("text", 45);
        int result = toyota.calc(2415, 658);
        System.out.println("Результат метода calc = " + result);

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
