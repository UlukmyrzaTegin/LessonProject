package less_8_array.Exercises;

/**
 * TheSusanin
 * 2/28/2021 Feb 2021
 */
public class TestArray {
    public static void main(String[] args) {
        int a[] = {33, 5, 7, 9};
        min(a);
        System.out.println();
        printArray(new int[]{10, 54, 87, 35}); // передача анонимного массива в метод
        System.out.println();
        int arr2[] = get();  // возврат массива из метода
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    // метод, который принимает массив в качества параметра
    static void min (int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (min > arr[i])
                min = arr[i];
            System.out.print(min + " ");
        }
    }
    static  void printArray(int arr[]) { // анонимный массов
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // метод, который возвращает массив
    static int[] get() {
        return  new int[] {54, 87, 96, 52, 10};
    }
}
