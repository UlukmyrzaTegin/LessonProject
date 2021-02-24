package less_8_array.homeWork;

/**
 * TheSusanin
 * 24 февраль 2021
 */
public class DuplicatElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        int counter = 0;
        int max = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (99 - 2) + 1)) + 2;
            System.out.print(array[i] + " ");
            counter = 0;
            if (num == array[i]){
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (num == array[j]) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                num = array[i];
            }
        }
        System.out.println("\n num = " + num + ", counter = " + max);
    }
}
