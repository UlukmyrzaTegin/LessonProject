package less_5_boolean;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * TheSusanin
 * 16 февраль 2021
 */
public class Man {
    public static void main(String[] args) {
        Scanner scannerMan = new Scanner(System.in);

        System.out.print("Сколько вам лет? ");
        String age = scannerMan.next();

       System.out.print("У вас билет? ");
       String hasTicket = scannerMan.next();

        System.out.print("Купон на бесплатное посещение? ");
        String hasCoupon = scannerMan.next();

        System.out.print("С вами нет маленьких детей? ");
        String hasChild = scannerMan.next();

        boolean resMan = (age.equals("18") && hasTicket.equals("true") || hasCoupon.equals("true") && hasChild.equals("false"));
        System.out.println("Результат: " + resMan);
    }
}
