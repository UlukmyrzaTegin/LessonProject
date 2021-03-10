package less_13_poliformism.models;

/**
 * TheSusanin
 * 3/10/2021 Mar 2021
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void spendMoney();  // абстракный, он не имеет реализации
    public abstract void dance();

}
