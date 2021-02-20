package less_6_ifelse.ExampleSwitch;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class SwitchString {
    public static void main(String[] args) {
        String levelStrin = "Expert";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int level = scanner.nextInt();

        switch (levelStrin) {
            case "Beginner": level = 1;
            break;
            case "Intermediate": level = 2;
                break;
            case "Expert": level = 3;
                break;
            default: level = 0;
            break;
        }
        System.out.println("Your Level is: " + level);
    }
}
