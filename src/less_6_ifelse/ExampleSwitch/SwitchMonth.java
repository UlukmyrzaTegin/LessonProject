package less_6_ifelse.ExampleSwitch;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class SwitchMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц в числах: ");
        int month = scanner.nextInt();
        String monthString = "";

        switch (month) {
            case 1: monthString = "1 - Январь";
            break;
            case 2: monthString = "2 - Февраль";
                break;
            case 3: monthString = "3 - Март";
                break;
            case 4: monthString = "4 - Апрель";
                break;
            case 5: monthString = "5 - Май";
                break;
            case 6: monthString = "6 - Июнь";
                break;
            case 7: monthString = "7 - Июль";
                break;
            case 8: monthString = "8 - Август";
                break;
            case 9: monthString = "9 - Сентябрь";
                break;
            case 10: monthString = "10 - Октябрь";
                break;
            case 11: monthString = "11 - Ноябрь";
                break;
            case 12: monthString = "12 - Декабрь";
                break;
            default:
                System.out.println("invalid month");
        }
        System.out.println(monthString);
    }
}
