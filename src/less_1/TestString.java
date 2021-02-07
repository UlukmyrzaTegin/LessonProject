package less_1;

/**
 * TheSusanin
 * 2/7/2021 Feb 2021
 */
public class TestString {
    public static void main(String[] args) {

        String s = "First";
        String s1 = " Second";

        int a =3;
        int b =4;
        int c =5;

        System.out.println(testString(s, s1));
        System.out.println(testInt(a, b, c));

    }
    public static String testString(String name, String name1){
        return name + name1;
    }
    public static int testInt(int a, int b, int c) {
        return a * b / c;
    }
}
