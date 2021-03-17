package less_14_interface.models;

/**
 * TheSusanin
 * 3/17/2021
 */
public abstract class PersonInterface {

    private String name;

    public PersonInterface(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
