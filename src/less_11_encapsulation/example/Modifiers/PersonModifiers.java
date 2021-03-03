package less_11_encapsulation.example.Modifiers;

/**
 * TheSusanin
 * 03 март 2021
 */
public class PersonModifiers {
    public static void main(String[] args) {
        Person ulukmyrza = new Person("Ulukimyrza", 30, "Baker Street", "+996709858858");
        ulukmyrza.displayName();
        ulukmyrza.displayAge();
        ulukmyrza.displayAddress();
        ulukmyrza.displayPhone();

        System.out.println("-------------------------------");

        System.out.println(ulukmyrza.name);
        System.out.println(ulukmyrza.address);
        System.out.println(ulukmyrza.age);
        //System.out.println(ulukmyrza.phone); // ошибка, модификатор private

    }

}
