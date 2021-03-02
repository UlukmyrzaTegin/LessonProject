package less_10_method.Classes;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Calculator {
    String model;
    double price;
    String color;

    public int sum(int a, int b)
    {
        return (a + b) * 2;
    }
    public void showInfo() {

        System.out.println(price);
    }
}
