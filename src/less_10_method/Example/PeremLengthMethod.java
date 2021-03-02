package less_10_method.Example;

/**
 * TheSusanin
 * 02 март 2021
 */
public class PeremLengthMethod {
    public static void main(String[] args) {
        sum(1,2,3);
        sum(1, 2, 3, 4, 5, 6);
        sum();
        System.out.println();

        sum1("Welcome", 20, 30);
        sum1("Welcome world!");

    }
    static void sum(int ...nums) {
        int result = 0;
        for (int n : nums)
            result += n;
        System.out.println(result);
    }
    static void sum1(String message, int ...nums) {
        int result1 = 0;
        for (int x : nums)
            result1 += x;
        System.out.println(result1);
    }
}
