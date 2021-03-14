package less_12_1_inheritance.models;

/**
 * TheSusanin
 * 3/14/2021
 */
public class Birds {
    private String name;

    public Birds(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Ho-ho-ho");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


