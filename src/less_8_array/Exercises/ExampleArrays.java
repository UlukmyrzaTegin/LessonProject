package less_8_array.Exercises;

import java.util.Arrays;

/**
 * TheSusanin
 * 2/25/2021 Feb 2021
 */
/*
* sort
* binarySearch
* toString
 */
public class ExampleArrays {
    public static void main(String[] args) {

        int[] numbers = new int[15]; // {14, 15, 164, 795, 578, 0, 788, 65, 47, 52, 36, 24, 96};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * (99 - 2) + 1) + 2);
            System.out.print(numbers[i] + " ");
        }
        //sort
        System.out.println();
        for (int i = 0; i < numbers.length ; i++){
        Arrays.sort(numbers, 0, numbers.length); // sort

        }
        for (int item : numbers) {
            System.out.print(item + " ");
        }
        //toString
        System.out.println();
        System.out.println(Arrays.toString(numbers));

        //binarySearch
        System.out.println();
        int index = Arrays.binarySearch(numbers, 0, numbers.length, numbers.length);
        System.out.print("position = " + index);
    }
}
