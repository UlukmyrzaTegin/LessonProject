package less_7_loops.Example;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * TheSusanin
 * 2/20/2021 Feb 2021
 */
public class Bank {
   /* public static void main(String[] args) {
        int moreNumber = 0;
        int lessNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте у вас 8 попыток: ");
        for (int i = 0; i < 8; i++) {
            int random = (int) (Math.random()*(99-2)+1);
          //  System.out.println("secret number =" + random);
            System.out.print("Вводите число: ");
            int answer = scanner.nextInt();
            if (answer > random) {
                System.out.printf("Ваш число %d " + "Больше \n", answer);
                ++moreNumber;
            } else if (answer < random) {
                System.out.printf("Ваш число %d " + "Меньше \n", answer);
                ++lessNumber;
            } else if (answer == random)
                System.out.println("Вы угадали");
        }
        System.out.printf("Вы ввели " +  moreNumber + " раз больше " +lessNumber + " и раз меньше ");
    }


*/

    /*
    public static void main() throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Меню пользователя");
        System.out.println("1. Term Deposite");
        System.out.println("2. Recurring deposits");
        System.out.println("Enter the choice(1 or 2):");
        int ch = Integer.parseInt(bufferedReader.readLine());

        switch (ch) {
            case 1:
                System.out.println("Enter principal:");
                float principal = Float.parseFloat(bufferedReader.readLine());
                System.out.println("Enter rate of intereset:");
                float rate = Float.parseFloat(bufferedReader.readLine());
                System.out.println("Enter time period in years:");
                float mounth = Float.parseFloat(bufferedReader.readLine());
                double a = 1 + (rate / 100);
                double A = principal * pow(a, mounth);
                System.out.println(" asf " + A);
                break;
            case 2:
                System.out.println("Enter monthly installment");
                principal = Float.parseFloat(bufferedReader.readLine());
                System.out.println("Enter rate inteset:");
                rate = Float.parseFloat(bufferedReader.readLine());
                System.out.println("Enter time period in months:");
                mounth = Float.parseFloat(bufferedReader.readLine());
                double c = (rate / 100) * (1 / 12);
                double b = (mounth*(mounth + 1)/2)*c;
                double B = (principal * mounth) + (principal * b);
                System.out.println("Maturity amount: " + "B");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

     */
}
