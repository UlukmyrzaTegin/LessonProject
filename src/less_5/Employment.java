package less_5;

import java.util.Scanner;

/**
 * TheSusanin
 * 10 февраль 2021
 */
public class Employment {
    public static void main(String[] args) {
        Scanner scanEmp = new Scanner(System.in);
        System.out.print("Направление: ");
        String direction = scanEmp.nextLine();

        System.out.print("Зарплата: ");
        int salary = scanEmp.nextInt();

        System.out.print("Официональное трудоустройство? ");
        boolean isOfficial = scanEmp.nextBoolean();

        System.out.print("Есть переезд? ");
        boolean isReplaceNeed = scanEmp.nextBoolean();

        System.out.print("Начало рабочего дня: ");
        int startHour = scanEmp.nextInt();

        System.out.print("Конец рабочего дня: ");
        int endHour = scanEmp.nextInt();

        System.out.print("Необходимый стаж работы: ");
        double exp = scanEmp.nextDouble();

        System.out.print("Стек технологий: ");
        String lang = scanEmp.next();

        System.out.print("Карьерный рост? ");
        boolean isCareer = scanEmp.nextBoolean();

        boolean resultEmp =((direction.equals("backend") && (salary >= 20000 || isOfficial) && exp <=2 && lang.equals("java")) || (isReplaceNeed && (startHour >= 9 && endHour <= 18))) && isCareer;
        System.out.println("Результат: " + resultEmp);

        /*
        || - или or, один из вариантов должен быть верным, тогда ответ будут правильным т.е true
        && - и and, если одно из них false то, ответ false или true
        */
    }
}
