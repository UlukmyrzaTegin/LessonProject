package less_6_ifelse.Example;

/**
 * TheSusanin
 * 16 февраль 2021
 */
public class Man {

    private int age;

    public Man(int age) { // конструктор
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Man man = new Man(22);
      /*  1 - вариант if-else
      String securityAnswer;
        if (man.getAge() >= 18) {
            securityAnswer = "Все в порядке, проходите!";
        } else {
            securityAnswer = "Этот фильм не подходит для вашего возраста!";
        }

       */

        // 2 - вариант, тренарный условие ? результат 1: результат 2
        String securityAnswer = (man.getAge() >= 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";
        System.out.println(securityAnswer);
    }
}
