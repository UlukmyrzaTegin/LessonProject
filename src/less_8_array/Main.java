package less_8_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TheSusanin
 * 22 февраль 2021
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = 0;

        while (n <= 3) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 3) {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод: ");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод: ");
            }
        }
        int [] array1 = new int[n];
        int evenNum = 0;
        for (int i = 0; i < n; i++) {
            array1[i] = (int) (Math.random() * (n + 1));
            if (array1[i] % 2 == 0){
                evenNum++;
            }
        }
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[evenNum];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0){
                array2[index] = array1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
