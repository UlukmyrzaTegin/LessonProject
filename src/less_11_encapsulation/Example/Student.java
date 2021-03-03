package less_11_encapsulation.Example;

/**
 * TheSusanin
 * 03 март 2021
 */
public class Student {
    private String name;

    public String getName() { // доступа, метод получения имени. Только для чтения
        return name;
    }

    public void setName(String name) { // мутатор - метод установки для имени. Только для записи
        this.name = name;
    }
}
