package less_10_method.Example;

/**
 * TheSusanin
 * 02 март 2021
 */
public class ParamMethod {
    public static void main(String[] args) {
        int a = 6, b = 8;
        sum(a, b);
        sum(3, b);
        sum(a, 5);
        sum(23, 5);
    }

    static void sum(int x, int y) {
        int z = x + y;
        int z1 = x * y;
        System.out.println(z + " " + z1);
    }
}
