package less_8_array.classWork;

/**
 * TheSusanin
 * 2/28/2021 Feb 2021
 */
public class Tree {
    public static void main(String[] args) {
        int coe = 3, rows = 10;
        for (int i = 0; i < rows ; i++) {
            for (int space = 1; space < rows - i; ++space) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coe = 1;
                else
                    coe = coe * (i - j + 1) / j;
                System.out.printf("%4d", coe);
            }
            System.out.println();
        }
    }
}
