package less_3.homeWork;

import java.util.Scanner;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите оклад по дням: ");
        int salary = scan.nextInt();                // оклад

        System.out.println("Введите количество календарных дней: ");
        int numberOfDays = scan.nextInt();          // количество дней

        System.out.println("Введите количество фактических отработанных дней: ");
        int numberOfActualDays = scan.nextInt();    //количество фактических дней

        System.out.println("Введите надбавка за выслуга лет:");
        int prize = scan.nextInt();                 //Премия

        System.out.println("Вредность:");          //Вредность
        int insalubrity = scan.nextInt();

        int coast = salary + prize + insalubrity;   //Начислено
        System.out.println("Начислено: " + coast);

        System.out.println("Штраф за опоздание: "); //Штраф за опоздание
        int variousDeductions = scan.nextInt();

        final double contribution = (salary + prize + insalubrity)/100*1;         //ПрофВзнос процентная ставка 1%
        System.out.println("Удержано ПрофВзнос по ставке 1% : " + contribution);

        final double incomeTax = salary/numberOfDays * numberOfActualDays * 0.13;             //Подоходный налог
        System.out.println("Удержано подоходный налог по ставке 13%: " + incomeTax);

        float uderjano = (float) (contribution + incomeTax + variousDeductions);
        System.out.println("Всего удержано: " + uderjano);

        System.out.print("К выплате: ");
        double wage = (salary / numberOfDays) * numberOfActualDays + prize + insalubrity - incomeTax - contribution - variousDeductions;
        System.out.println(wage);
    }
}
