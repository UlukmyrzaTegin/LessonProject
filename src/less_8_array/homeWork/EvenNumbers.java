package less_8_array.homeWork;

import java.util.Arrays;

/**
 * TheSusanin
 * 24 февраль 2021
 */
public class EvenNumbers {
    public static void main(String[] args) {
        int[] array = new int[10];
        int evenNum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (9-2)+1)+2);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0){
                evenNum++;
            }
        }

      //  System.out.println(Arrays.toString(array));
        int[] array2 = new int[evenNum];
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0){
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array2));
    }
}
