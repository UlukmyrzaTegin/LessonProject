package less_11_1_enum.models;

/**
 * TheSusanin
 * 3/14/2021 Mar
 */
public enum  EnumAnimal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");
    private  String translation;

    EnumAnimal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык: " + translation;
    }
}
