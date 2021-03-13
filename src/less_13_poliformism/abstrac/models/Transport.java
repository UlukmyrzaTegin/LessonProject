package less_13_poliformism.abstrac.models;

/**
 * TheSusanin
 * 3/13/2021 Mar 2021
 */
public abstract class Transport {
    private String name;
    private String model;
    private int year;

    public Transport(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void drive();
    public abstract void reverse();
    public abstract void stop();


}
