package less_8_array.Exercises;

import java.util.Arrays;

/**
 * TheSusanin
 * 2/28/2021 Feb 2021
 */
public class ArrayCopy {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'c', 'a', 'g', 'r', 'q', 'y', 'u', 's', 'l'};
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(String.valueOf(copyTo));

        //public static  void arrayCope (Object src, int srcPos, Object dest, int destPos, int length) - метод, копирование массива

        System.out.println();
        int arr[] = {33, 3, 4, 55, 77};
        System.out.println("Printing original array: ");
        for (int i : arr)
            System.out.println(i);

        System.out.println("Printing clone of the array: ");
        int carr[] = arr.clone();
        for (int i : carr)
            System.out.println(i);

        System.out.println("Are both equal?");
        System.out.println(arr == carr);
    }
}
