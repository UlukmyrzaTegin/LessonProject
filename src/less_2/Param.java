package less_2;

/**
 * TheSusanin
 * Fri Feb 2021
 */
public class Param {
    public static void main(String[] args) {

        String fullName = "Жакыпбеков Улукмырза";
        byte age = 30;
        String placeOfBirth = "Таласа";
        String working = "ГВЦ Нацстатком КР";
        String phoneMumber = "0709 858-858";
        String mail = "ulukmyrza.zhakypbekov@gmail.com";
        char gender = 'm';
        String experience = " Опыт работы в программирование";

        System.out.println(" Меня зовут " + fullName);
        System.out.println(" Мне " +age);
        System.out.println(" Я из " + placeOfBirth);
        System.out.println(" Работаю в " + working);
        System.out.println(" Контакты " + phoneMumber);
        System.out.println(" Пол: "+gender);
        System.out.println(" Электронная почта: " + mail);
        System.out.println(experience + " не имеется.");
    }
}
