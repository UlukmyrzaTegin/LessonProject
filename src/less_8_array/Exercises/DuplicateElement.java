package less_8_array.Exercises;

/**
 * TheSusanin
 * 2/23/2021 Feb 2021
 */
public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = new int[] {2, 7, 9, 3, 1, 2, 8, 3, 0, 5};
        System.out.println("Повторящиеся элементы в массиве: ");
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] == arr[j])
                    System.out.print(arr[j] + " ");
            }
        }
    }
}
