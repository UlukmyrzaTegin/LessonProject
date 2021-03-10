package less_13_poliformism.models;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public class Calculator {
    //методы класса должны отличаться по названием, либо по количество параметров

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(double a, int b) {
        return 0;
    }
}
