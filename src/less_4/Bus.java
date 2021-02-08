package less_4;

import java.util.Scanner;

/**
 * TheSusanin
 * 08 февраль 2021
 */
public class Bus {
    public static void main(String[] args) {

        System.out.println("Введите номер автобуса: ");
        int bus = 7;
        Scanner scanBus = new Scanner(System.in);
        int currentBus = scanBus.nextInt();

        // 1. Мне нужно понять, что это мой автобус или нет.

        boolean resBus = bus == currentBus;
        System.out.println("Это мой автобус ? - " + resBus);

        // 2. Проверка, что этой не мой автобус
        resBus = bus != currentBus;
        System.out.println("Это не мой автобус ? - " + resBus);
    }
}
