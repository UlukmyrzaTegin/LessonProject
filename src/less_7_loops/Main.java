package less_7_loops;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/21/2021 Feb 2021
 */
public class Main {
    public static void main(String[] args) {
        //
        String name = "Toyota";
        Scanner scanner = new Scanner(System.in);

        String model = "";
        while (!model.equals(name)){
            System.out.println("model = ");
            model = scanner.next();

        }
       // for (int i = 0; i < 10; i++)
        //    System.out.println(i);

      /*  boolean isTrue = true;
        int j = 0;
        while (isTrue) {
            System.out.println(j);
            j += 2;
            if (j > 10)
                break;
        }*/

     /*   int j = 0;
        while (j < 100) {
            j += 1;
            if (j % 2 == 0)
                continue;
            System.out.println(j);
        }*/

      /*  int x = 13;
        do {
            x--;
            System.out.println(x);
        } while (x > 10);
       */
    }
}
