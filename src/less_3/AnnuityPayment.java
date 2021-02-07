package less_3;

import java.util.Scanner;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class AnnuityPayment {
    public static void main(String[] args) {
        System.out.println("Аннуитетный платеж:");
        Scanner scanAnnuity = new Scanner(System.in);

        System.out.println("Введите размер кредита: ");
        int summaKredita = scanAnnuity.nextInt();

        System.out.println("Введите процентную ставку в процентах:");
        float stavka = scanAnnuity.nextFloat();
        float resStavka = (stavka/100/12);
        //System.out.println(resStavka);

        System.out.println("Введите срок кредита в месяцах:");
        float srokKredita = scanAnnuity.nextFloat();

        float resKoefisent = (resStavka*(1+resStavka)*srokKredita/(1+resStavka)*srokKredita-1);
        System.out.println(resKoefisent);

        System.out.println("Ежемесячный платеж:");
        float resAnnuity = (resKoefisent * srokKredita - summaKredita);
        System.out.println(resAnnuity);

        System.out.println("Переплата по кредиту за " + srokKredita + "месяцев составит: ");
        float pereplata = (resAnnuity*srokKredita-summaKredita);
        System.out.println(pereplata);
    }
}
