package less_11_1_enum;

import less_11_1_enum.models.Music;

/**
 * TheSusanin
 * 3/14/2021 Mar
 */
public class MainEnum {
    public static void main(String[] args) {
        Music ms = Music.CLASSIC;
        for (Music element : Music.values()) { // данный массив будем перебирать
            System.out.println(element);
        }
        // статический метода valueOf()
        System.out.println("-------------------------");
        Music mc2 = Music.valueOf(Music.class, "ROCK");
        System.out.println(mc2);
        //ordinal() - возвращает позицию данного элемента массива по индексу
        System.out.println("-------------------------");
        System.out.println(ms.ordinal());
        System.out.println("-------------------------");
        switch (ms) {
            case CLASSIC:
                System.out.println("Classic");
                break;
            case ROCK:
                System.out.println("Rock");
                break;
            case POP:
                System.out.println("Pop");
                break;
            default:
                System.out.println("No genre");
        }
        System.out.println("-------------------------");
        System.out.println(ms.getI());
        System.out.println(ms.getName());
        System.out.println("-------------------------");
        ms.foo();
    }
}
