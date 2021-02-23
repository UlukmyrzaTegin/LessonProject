package less_8_array.homeWork;

/**
 * TheSusanin
 * 2/23/2021 Feb 2021
 */
public class RandomArrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[array.length];
        int max = array[0];
        int min = array[0];
        int totalArray = 0;
        double averageArray = 0;
        int chet = 0;
        int neChet = 0;

        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random()*(99-2)+1)+2;
            System.out.print(array[i] + "  ");
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min){
                min = array[i];
            }

            totalArray += array[i]; // сумма элементов в массиве
            averageArray = totalArray / array.length; // среднее арифметическое массива

            if (array[i] % 2 == 0)
                chet = array[i];
            // System.out.print(" Четные числа: " + neChet);
            if (array[i] % 2 != 0)
                neChet = array[i];
            //   System.out.print(" Нечетные числа: " + chet);

            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
        System.out.println("\n Максимальное значение в массиве: " + max);
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Среднее арифметическое массива: " + averageArray);
        System.out.println("Сумма элементов в массиве: " + totalArray);
        System.out.println("Четные числа в массиве: " + chet);
        System.out.println("Нечетные числа в массиве: " + neChet);
    }
}
