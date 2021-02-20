package less_7_loops.Multiplication;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/19/2021 Feb 2021
 */
public class TableMultiplication {

    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
