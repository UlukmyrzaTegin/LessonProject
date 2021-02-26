package less_8_array.homeWork;

import java.util.Arrays;

/**
 * TheSusanin
 * 2/23/2021 Feb 2021
 */
public class RandomArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        int evenNum = 0, element = 10;
        int max = array[0], min = array[0];
        int totalArray = 0;
        int averageArray = 0, sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random() * (99-2) + 1) + 2;
            System.out.print(array[i] + "  ");
            if (array[i] % 2 == 0){
                evenNum++;
            }
            if (array[i] > max) // мах число
                max = array[i];
            if (array[i] < min) //мин число
                min = array[i];

            totalArray += array[i]; // сумма элементов в массиве
            averageArray = totalArray / array.length; // среднее арифметическое массива
            sum1 = array[2] * array[3];
            sum2 = array[5] * array[6];
            sum3 = array[8] * array[9];

        }
        int[] array2 = new int[evenNum];
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 == 0){
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array2)); // вывожу четные числа в первом массиве

//            System.out.println();
//            int[] arrayChet = new int[element];
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] % 2 == 0)
//                    arrayChet[j] = array[j];
//                System.out.print(arrayChet[j] + "  ");
//        }
        System.out.println("\n Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Среднее арифметическое массива: " + averageArray);
        System.out.println("Сумма элементов в массиве: " + totalArray);
        System.out.print("Произведение каждого 3-го на следующий: " + sum1 + " " + sum2+ " " + sum3);

    }
}