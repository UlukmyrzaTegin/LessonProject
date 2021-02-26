package less_6_ifelse.ExampleSwitch;

import java.util.Scanner;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class SwitchWrapper {
    public static void main(String[] args) {
        Scanner scanAge = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanAge.nextInt();
        switch (age) {
            case (16):
                System.out.println("Вам меньше 18 лет");
                break;
            case (18):
                System.out.println("Вы имеете право голоса");
                break;
            case (65):
                System.out.println("Вы пенсионер.");
                break;
            default:
                System.out.println("Укажите действительный возраст");
                break;
        }
    }
}
