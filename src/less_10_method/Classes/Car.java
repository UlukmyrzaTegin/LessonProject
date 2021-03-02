package less_10_method.Classes;

/**
 * TheSusanin
 * 01 март 2021
 */
public class Car {
    long id;
    String model;
    String color;
    double price;
    int doorsCount;
    boolean isNew;

    // модификатор доступа - public
    // void - тип возвращаемого значения,
    // имя метода
    public void drive(){
        System.out.println(model + " drive");
    }

    public void stop() {
        System.out.println(model + "stop");
    }

    public void print(String text, int num) {
        System.out.println(text);
    }

    public int calc(int a, int b) {
        int sum = a + b;
        return sum;
    }

//    public void setColor(){
//        System.out.println(color + " white");
//    }
}
