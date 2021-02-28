package less_8_array.Exercises;

/**
 * TheSusanin
 * 2/28/2021 Feb 2021
 */
public class TestArray3 {
    public static void main(String[] args) {
        int arr[][] ={{1, 2, 3}, {2, 4, 5},{4, 4, 5}};
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
