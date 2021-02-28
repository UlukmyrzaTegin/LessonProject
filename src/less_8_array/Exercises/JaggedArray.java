package less_8_array.Exercises;

/**
 * TheSusanin
 * 2/28/2021 Feb 2021
 */
public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        // инициализация зубчатого массива
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = count++;

                // печать данных зубчатого массива
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr[i].length ; l++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }

        }
    }
}
