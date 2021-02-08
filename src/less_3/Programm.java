package less_3;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/8/2021 Feb 2021
 */
public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        System.out.print("Input height: ");
        float height = scanner.nextFloat();
        System.out.printf("Name: %s, Age: %d, Height: %.2f \n", name, age, height);
        scanner.close();
    }
}
