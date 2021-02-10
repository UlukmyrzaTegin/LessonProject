package less_4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * TheSusanin
 * 09 февраль 2021
 */
public class NegativeNumbers {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа. Проверить на экран не является ли разность этих числе отрицательным числом.");
        Scanner scanNum = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firsNum = scanNum.nextInt();

        System.out.println("Введите второе число");
        int secondNum = scanNum.nextInt();

        System.out.println("Введите третье число");
        int threeNum = scanNum.nextInt();

        float resNum = (firsNum - secondNum - threeNum) / 3;
        System.out.println("Результат трех числе: " + resNum);

        boolean result = resNum > 0;
        System.out.println("Результат: " + result);
    }
}
