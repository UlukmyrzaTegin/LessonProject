package less_11_1_enum;

import less_11_1_enum.models.EnumAnimal;
import less_11_1_enum.models.Season;

/**
 * TheSusanin
 * 3/14/2021 Mar
 */
public class AnimalEnum {
    public static void main(String[] args) {
        EnumAnimal enumAnimal = EnumAnimal.CAT;
        System.out.println(enumAnimal.getTranslation());
        System.out.println("---------------");
        System.out.println(enumAnimal.toString());
        System.out.println("---------------");
        System.out.println(enumAnimal);
        switch (enumAnimal) {
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            default:
                System.out.println("Not an animal");
        }

        System.out.println("-----------------------");
        // Наследование в enum: Object -> Enum -> Season
        // instamceof - проверяет, является обьект обьектом этого классса
        // getClass - тот, обьект который является обьектам класса
        Season season = Season.SUMMER;
        System.out.println(season instanceof Season);  //т.е, проверка season был ли создан от класса Season
        System.out.println(season.getClass()); // проверка, выводит season.SUMMER от какого класса
        System.out.println("-----------------------");
        Season winter = Season.valueOf(Season.class, "WINTER");
        System.out.println(winter);
        System.out.println("-----------------------");
        Season spring = Season.SPRING;
        System.out.println(season.ordinal());
        System.out.println("-----------------------");
        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
    }
}
