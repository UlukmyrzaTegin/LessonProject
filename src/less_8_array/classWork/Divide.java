package less_8_array.classWork;

/**
 * TheSusanin
 * 2/28/2021 Feb 2021
 */
public class Divide {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";

        int len = str.length();
        int n = 3;
        int temp = 0, chars = len/n;

        String[] equalStr = new String[n];
        if (len % n != 0) {
            System.out.println(" Эту строку нельзя разделить на " + n + " равные части.");
        } else {
            for (int i = 0; i < len; i = i + chars ) {
                //Разделить строки на n равных частей с помощью substring()
                String part = str.substring(i, i + chars);
                equalStr[temp] = part;
                temp++;
            }
            System.out.println(n + " равные части данной строки");
            for (int i = 0; i < equalStr.length ; i++) {
                System.out.println(equalStr[i]);
            }
        }
    }
}
