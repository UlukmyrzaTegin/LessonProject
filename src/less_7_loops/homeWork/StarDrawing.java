package less_7_loops.homeWork;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class StarDrawing {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
