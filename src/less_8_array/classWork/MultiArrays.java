package less_8_array.classWork;

/**
 * TheSusanin
 * 2/27/2021 Feb 2021
 */
public class MultiArrays {
    public static void main(String[] args) {
        int [] [] numbers = new int[2][2];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2 ; j++) {
                System.out.println(numbers[i][j]);
            }
        }

        System.out.println();
        int[] num = new int[51];
        for (int i = 0; i < num.length ; i++) {
            num[i] = i * 2;
        }
        for (int item : num) {
            System.out.print(item + " ");
        }
    }
}
