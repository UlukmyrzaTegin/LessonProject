package less_10_method.Example;

/**
 * TheSusanin
 * 03 март 2021
 */
public class InstanceMethod {
    public static void main(String[] args) {
        //Обьект класса
        InstanceMethod object = new InstanceMethod();
        //вызов метода экземпляра
        System.out.println("Сумма равен = " + object.add(12, 13));
    }
    int s;
    public int add(int a, int b) {
        s = a + b;
        return s;
    }
}
