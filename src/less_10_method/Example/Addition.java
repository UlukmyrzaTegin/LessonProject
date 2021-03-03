package less_10_method.Example;

/**
 * TheSusanin
 * 03 март 2021
 */
public class Addition {
    public static void main(String[] args) {
        int a = 16;
        int b = 16;
        //вызов метода
        int c = add(a, b);
        System.out.println("Сумма чисел а и b = " + c);
    }

    public static int add(int n1, int n2) {
        int s;
        s = n1 + n2;
        return s; // возвращаем суммы
    }
}
